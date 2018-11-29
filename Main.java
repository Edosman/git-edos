package com.company;

public class Main {

    public static void main(String[] args) {
        Degree degree = new Degree(5, -3);
        degree.exponentiation();
        System.out.println("Число Х в степени У равно: " + degree.checkSignDegree());
    }
}
