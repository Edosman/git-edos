package edos;

import java.util.*;

public class TheTask_2 {

    static HashMap<Integer, String> phoneBook = new HashMap<>();

    static void add(Integer number, String lastName) {
        phoneBook.put(number, lastName);
    }

    static void getInfo(String lastName) {
        Set<HashMap.Entry<Integer, String>> set = phoneBook.entrySet();
        for (HashMap.Entry<Integer, String> hme : set) {
            if (hme.getValue().equalsIgnoreCase(lastName)) {
                System.out.println(hme.getKey());
            }
        }
    }

    public static void main(String[] args) {
        add(891565423, "Смирнов");
        add(891752148, "Смирнов");
        add(891752259, "Петров");
        add(890325144, "Висильев");
        getInfo("Смирнов");
    }
}
