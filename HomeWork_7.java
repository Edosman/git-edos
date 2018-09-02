/**
 * Java. Level 1. Lesson 7. Homework
 *
 * @author Eduard Krasikov
 * @version Sept 02, 2018
 */

class HomeWork_7 {
    public static void main(String[] args) {
        Cats[] cats = new Cats[]{
                new Cats("Murzik", 7, false),
                new Cats("Barsik", 6, false),
                new Cats("Tornado", 10, false),
                new Cats("Marusya", 5, false)};
        Plate plate = new Plate(25);
        System.out.println(plate);
        for (Cats cat : cats) {
            if (plate.food < cat.getAppetite()) {
                System.out.println(cat);
                System.out.println("В тарелке не хватает еды");
                break;
            }
            cat.satiety(plate);
            cat.eat(plate);
            System.out.println(cat);
        }
        System.out.println(plate);
        for (Cats cat : cats) {
            if (!cat.getSatiety()) {
                System.out.println("Подкинем еды!");
                plate.additionFood(cat);
                System.out.println(plate);
                cat.satiety(plate);
                cat.eat(plate);
                System.out.println(cat);
            }
        }
        System.out.println(plate);
    }
}

class Cats {
    private String name;
    private int appetite;
    private boolean satiety;

    //Параметрический конструктор котов
    Cats(String name, int appetite, boolean satiety) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;
    }

    void eat(Plate plate) {
        plate.dicreaseFood(appetite);
    }

    boolean satiety(Plate plate) {
        if (plate.food >= appetite) {
            return satiety = true;
        }
        return satiety = false;
    }

    @Override
    public String toString() {
        return name + " " + satiety;
    }

     int getAppetite() {
        return appetite;
    }

    boolean getSatiety (){
        return satiety;
    }
}

class Plate {
    int food;

    //Параметрический конструктор тарелки
    Plate(int food) {
        this.food = food;
    }

    void dicreaseFood(int food) {
        this.food -= food;
    }

    void additionFood(Cats cats) {
        if (food < cats.getAppetite())
            food = cats.getAppetite();
    }

    @Override
    public String toString() {
        return "Еды в тарелке: " + food;
    }
}