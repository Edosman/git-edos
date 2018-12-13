package com.company;

public class Main {

    public static void main(String[] args) {
        HashMap_2 map = new HashMap_2();

        map.add(1992, "Виктор");
        map.add(1995, "Михаил");
        map.add(1998, "Олеся");
        map.add(2000, "Екатерина");
        map.add(2000, "Алексей");
        map.add(2001, "Светлана");

        System.out.println(map.getValue(2000));
        System.out.println(map.getValue(1998));

        map.remove(2000);

        System.out.println("---------- Remove ----------");
        System.out.println(map.getValue(2000));
    }
}
