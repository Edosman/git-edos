package Lesson_1.Marathon;

public class Team {

   private String teamName;

    Competitor[] competitors = {new Cat("Murzik"), new Dog("Sharik"), new Human("Alex"), new Horse("Adel")};

    public Team(String teamName) {
        this.teamName = teamName;
    }

    void showResults() {
        System.out.println("Информация о команде " + teamName);
        for (Competitor c : competitors) {
            c.info();
        }
    }
}
