/**
 * Java. Level 1. Lesson 4. Homework
 *
 * @author Eduard Krasikov
 * @version Aug 24, 2018
 */

import java.util.Random;
import java.util.Scanner;

class HomeWork_5x5 {
    final int SIZE = 5;
    final char DOT_X = 'x';
    final char DOT_O = 'o';
    final char DOT_EMPTY = '.';
    char[][] map = new char[SIZE][SIZE];
    Scanner sc = new Scanner(System.in);
    Random rand = new Random();

    public static void main(String[] args) {
        new HomeWork_5x5();
    }

    HomeWork_5x5() {
        System.out.println("Игра Крестики нолики");
        initMap();
        printMap();
        while (true) {
            humanTurn();
            if (checkWin(DOT_X)) {
                System.out.println("ВЫ ВЫГРАЛИ!");
                break;
            }
            if (isMapFull()) {
                System.out.println("НИЧЬЯ!");
                break;
            }
            aiTurn();
            printMap();
            if (checkWin(DOT_O)) {
                System.out.println("РОБОТ ПОБЕДИЛ!");
                break;
            }
            if (isMapFull()) {
                System.out.println("НИЧЬЯ!");
                break;
            }
        }
        System.out.println("GAME OVER");
        printMap();
    }

    void initMap() {
        for (int i = 0; i < SIZE; i++)
            for (int j = 0; j < SIZE; j++)
                map[i][j] = DOT_EMPTY;
    }

    void printMap() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++)
                System.out.print(map[i][j] + " ");
            System.out.println();
        }
        System.out.println();
    }

    void humanTurn() {
        int x, y;
        do {
            System.out.println("Введите координаты поля Х и У:");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellValid(x, y));
        map[y][x] = DOT_X;
    }

    void aiTurn() {
        int x, y;
        do {
            x = rand.nextInt(SIZE);
            y = rand.nextInt(SIZE);
        } while (!isCellValid(x, y));
        map[y][x] = DOT_O;
    }

    // Задание №2 и №3. Работает для любой мерности и колличеством фишек меньше на 1 от мерности
    boolean checkWin(char dot) {
        for (int i = 0, d1 = 0, d2 = 0, d3 = 0, d4 = 0, d5 = 0; i < SIZE; i++) {
            for (int j = 0, x = 0, y = 0; j < SIZE; j++) {
                // check horizontal lines
                if (map[i][j] == dot) {
                    x++;
                    if (x == SIZE-1) return true;
                }
                // check vertical lines
                if (map[j][i] == dot) {
                    y++;
                    if (y == SIZE-1) return true;
                }
                // check diagonal lines
                if (i == j && map[i][j] == dot) {
                    d1++;
                    if (d1 == SIZE-1) return true;
                }
                if (i + j == SIZE - 1 && map[i][j] == dot) {
                    d2++;
                    if (d2 == SIZE-1) return true;
                }
                // check diagonal lines-1
                if (Math.abs(i - j) == 1 && map[i][j] == dot) {
                    d3++;
                    if (d3 == SIZE - 1) return true;
                }
                if (i + j == SIZE - 2 && map[i][j] == dot) {
                    d4++;
                    if (d4 == SIZE - 1) return true;
                }
                if (i + j == SIZE && map[i][j] == dot) {
                    d5++;
                    if (d5 == SIZE - 1) return true;
                }
            }
        }
        return false;
    }

    boolean isMapFull() {
        for (int i = 0; i < SIZE; i++)
            for (int j = 0; j < SIZE; j++)
                if (map[i][j] == DOT_EMPTY)
                    return false;
        return true;
    }

    boolean isCellValid(int x, int y) {
        if (x < 0 || y < 0 || x >= SIZE || y >= SIZE)
            return false;
        return map[y][x] == DOT_EMPTY;  // by DSerov
    }
}