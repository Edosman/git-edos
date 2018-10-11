package edos;

enum Workday {
    Mondey(40), Tuesday(32), Wednesday(24), Thursday(16), Friday(8), Sunday(0), Saturday(0);
    private int hours;

    public int getHours() {
        return hours;
    }

    Workday(int hours) {
        this.hours = hours;
    }
}

public class DayOfWeek {

    public static void main(String[] args) {
        for (Workday w : Workday.values()) {
            if (w.getHours() > 0) {
                System.out.println(w + " " + w.getHours());
            }
            if (w.getHours() == 0) {
                System.out.println(w + " Выходной");
            }
        }
    }
}
