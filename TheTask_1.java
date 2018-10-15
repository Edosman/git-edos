package edos;

import java.util.*;

public class TheTask_1 {

    static String[] array = {"Один", "Один", "Два", "Два", "Два", "Три", "Черыре", "Черыре", "Пять", "Пять", "Шесть", "Шесть"};

    public static void main(String[] args) {
        List<String> list = Arrays.asList(array);

        System.out.println(list);
        Set<String> unique = new HashSet<>(list);
        System.out.println("Список уникальных имён: \n" + unique);

        HashMap<String, Integer> repeatHm = new HashMap<>();
        for (String s : array) {
            Integer sum = repeatHm.get(s);
            repeatHm.put(s, sum == null ? 1 : sum + 1);
        }
        System.out.println("Список повторений: \n" + repeatHm);
    }
}
