package com.company;

import java.util.Arrays;

public class Main {
    static final int size = 10000000;
    static final int numberOfTreads = 2;
    static final int h = size / numberOfTreads;
    private float[] arr = new float[size];

    public static void main(String[] args) {
        Main main = new Main();
        main.method_1();
        main.method_2();
    }

    private void method_1() {
        Arrays.fill(arr, 1);
        long a = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        System.out.println("Затраченное время на выполненике процесса в одном потоке: " + (System.currentTimeMillis() - a) + " миллисекунд");
    }

    private void method_2() {
        float[] part1 = new float[h];
        float[] part2 = new float[h];

        long start = System.currentTimeMillis();
        System.arraycopy(arr, 0, part1, 0, h);
        System.arraycopy(arr, h, part2, 0, h);

        MyThread t1 = new MyThread("a", part1);
        MyThread t2 = new MyThread("b", part2);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        part1 = t1.getArr();
        part2 = t2.getArr();

        System.arraycopy(part1, 0, arr, 0, h);
        System.arraycopy(part2, h, arr, part1.length, part2.length);

        long multiTime = System.currentTimeMillis()-start;

        System.out.println(multiTime);

        // Arrays.fill(arr, 1);
        long a = System.currentTimeMillis();

    }
}

class MyThread extends Thread {
    private float[] arr;

    MyThread(String a, float[] arr) {
        this.arr = arr;
    }

    float[] getArr() {
        return arr;
    }
    @Override
    public void run(){
        calculation();
    }

    private void calculation() {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        System.out.println("Конец");
    }
}