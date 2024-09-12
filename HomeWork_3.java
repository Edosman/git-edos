/**
 * Java. Level 1. Lesson 3. Homework
 *
 * @author Eduard Krasikov
 * @version Aug 19, 2018
 */

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HomeWork_3 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Вызов методов задания №1
        System.out.println("Это игра - Угадай число от 0 до 9");
        System.out.println("У вас три попытки отгадать");
        guessTheNumber();
        repeatMetod();
        scanner.close();
        // Вызов методов задания №2
        guessTheWord();
        scanner.close();
    }

    // Задание №1
    public static void guessTheNumber() {
        Random rand = new Random();
        int guessNumber = rand.nextInt(10);
        for (int i = 1; i < 5; i++) {
            if (i == 4) {
                System.out.println("Конец игры");
                break;
            }
            System.out.println("Введите число");
            int number = scanner.nextInt();
            if (number == guessNumber) {
                System.out.println("Вы выграли!");
                break;
            }
            if (number > guessNumber) {
                System.out.println("Загаданное число меньше");
            }
            if (number < guessNumber) {
                System.out.println("Загаданное число больше");
            }
        }
    }

    public static void repeatMetod() {
        int repeat;
        System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
        repeat = scanner.nextInt();
        if (repeat == 1) {
            guessTheNumber();
        }
        if (repeat == 0) {
            System.out.println("Пока!");
        } else {
            repeatMetod();
        }
    }

    // Задание №2
    public static void guessTheWord() {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot",
                "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea",
                "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        System.out.println("Эта программа загадывает слово из перечисленных ниже:");
        System.out.println(Arrays.toString(words));
        Random rand = new Random();
        int i = rand.nextInt(words.length);
        while (true) {
            System.out.println("Введите слово:");
            String text = scanner.nextLine(); // Пользователь вводит слово
            if (text.equals(words[i])) {
                System.out.println("Вы угадали!");
                break;
            }
            int shortWord;
            if (text.length() > words[i].length()) {  // Поиск короткого слова
                shortWord = words[i].length();
            } else {
                shortWord = text.length();
            }
            for (int j = 0; j < shortWord; j++) {  // Поиск совпадающих символов
                if (text.charAt(j) == words[i].charAt(j)) {
                    System.out.print(text.charAt(j));
                } else {
                    System.out.print("#");
                }
            }
            for (int k = 0; k < 15 - shortWord; k++) System.out.print("#");
            System.out.println();
        }
    }
}