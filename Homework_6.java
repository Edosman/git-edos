/**
 * Java. Level 1. Lesson 6. Homework
 *
 * @author Eduard Krasikov
 * @version Aug 30, 2018
 */

class Homework_6 {

    public static void main(String[] args) {
        Animal[] animals = {
                new Cat("Cat_1 ", 150, 5, 1),
                new Cat("Cat_2 ", 50, 1, 5),
                new Dog("Dog_1 ", 600, 10, 2),
                new Dog("Dog_2 ", 450, 6, 0.3f)};
        for (Animal animal : animals)
            System.out.println(animal);
    }
}

abstract class Animal {
    private String name;
    private int longRun;
    private int longSwim;
    private float heightJump;

    //Параметрический конструктор
    Animal(String name, int longRun, int longSwim, float heightJump) {
        this.name = name;
        this.longRun = longRun;
        this.longSwim = longSwim;
        this.heightJump = heightJump;
    }

    int getLongRun() {
        return longRun;
    }

    int getLongSwim() {
        return longSwim;
    }

    float getHeightJump() {
        return heightJump;
    }

    abstract boolean run();

    abstract boolean swim();

    abstract boolean jump();

    @Override
    public String toString() {
        return name + ":" + " run: " + run() + " swim: " + swim() + " jump: " + jump();
    }
}

class Cat extends Animal {
    Cat(String name, int longRun, int longSwim, float heightJump) {
        super(name, longRun, longSwim, heightJump);
    }

    boolean run() {
        return (getLongRun() <= 200);
    }

    boolean swim() {
        return false;
    }

    boolean jump() {
        return (getHeightJump() <= 2);
    }
}

class Dog extends Animal {
    Dog(String name, int longRun, int longSwim, float heightJump) {
        super(name, longRun, longSwim, heightJump);
    }

    boolean run() {
        return (getLongRun() <= 500);
    }

    boolean swim() {
        return (getLongSwim() <= 10);
    }

    boolean jump() {
        return (getHeightJump() <= 0.5);
    }
}
