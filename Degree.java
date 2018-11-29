package com.company;


public class Degree {
    private double x;
    private int y;
    private double z;

    public Degree(double x, int y) {
        this.x = x;
        this.y = y;
    }

    double exponentiation() {
        if (y == 0) {
            System.out.println("Ошибка! Cтепень не може равняться нулю.");
            return 0;
        }
        if (y == 1 || y == -1) {
            return x;
        }
        if (y < 0) {
            if (x == 0) {
                System.out.println("Нельзя делить на ноль.");
                return 0;
            }
            ++y;
             z = x * exponentiation();
            return z;
        }
        --y;
        z = x * exponentiation();
        return z;

    }


    double checkSignDegree() {
        if (y < 0) {
            return 1 / z;
        }
        return z;
    }
}

