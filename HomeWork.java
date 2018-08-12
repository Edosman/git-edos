/**
 * Java. Level 1. Lesson 1. Homework
 *
 * @author Eduard Krasikov
 * @version Aug 11, 2018
 */

public class HomeWork {

    public static void main(String[] args) {
        // Задание №2
        byte a = 10;
        short b = 100;
        int c = 2539;
        long d = 3649875;
        float e = 56.7f;
        double f = 12.984;
        boolean g = true;
        char h = 'B';
        System.out.println(expression_1(4, 1, 2, 8));
        System.out.println(check_limit_10_20(8, 3));
        check_sign(-24);
        System.out.println(negative(10));
        name("Эдуард");
        leap_year(2016);
    }

    // Задание №3
    static int expression_1(int a, int b, int c, int d) {
        return a * (b + (c / d));
    }

    // Задание №4
    static boolean check_limit_10_20(int a, int b) {
        if ((a + b) >= 10 && (a + b) <= 20) {
            return true;
        } else {
            return false;
        }
    }

    // Задание №5
    static void check_sign(int a) {
        if (a < 0) {
            System.out.println("Число отрицательное");
        } else {
            System.out.println("Число положительное");
        }
    }

    // Задание №6
    static boolean negative(int a) {
        if (a < 0) {
            return true;
        }
        return false;
    }

    // Задание №7
    static void name(String a) {
        System.out.println("Привет, " + a + "!");
    }

    // Задание №8*
    static void leap_year(int a) {
        if ((a % 4 == 0 && a % 100 != 0) || a % 400 == 0) {
            System.out.println("Високосный год");
        } else {
            System.out.println("Вевисокосный год");
        }
    }
}