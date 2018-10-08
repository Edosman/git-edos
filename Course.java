package Lesson_1.Marathon;

public class Course {
    Obstacle[] obstacles = {new Cross(100), new Wall(5), new Water(25)};

   public void doIt(Competitor[] competitors) {
        for (Competitor c : competitors) {
            for (Obstacle o : obstacles) {
                o.doit(c);
                if (!c.isOnDistance()) {
                    break;
                }
            }
        }
    }
}