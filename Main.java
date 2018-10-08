package Lesson_1.Marathon;

public class Main {
    public static void main(String[] args) {
        Course c = new Course();
        Team team = new Team("Apalon-1");
        System.out.println("На дистанцию вышли:");
        c.doIt(team.competitors);
        team.showResults();
    }
}
