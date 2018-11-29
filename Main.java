package edos;

public class Main {

    public static void main(String[] args) {
        LinkedList list = new SimpleLinkedListImpl();
        list.add(5);
        list.add(4);
        list.add(0);
        list.add(1);

        displayAll(list);

        System.out.println("Тест методов итератора: ");

        ListIterator iterator = (ListIterator) list.iterator();
        iterator.reset();
        iterator.next();
        iterator.remove();
        iterator.insertBefore(2);
        iterator.insertAfter(3);

        displayAll(list);
    }

    private static void displayAll(LinkedList list) {
        for (Integer value : list) {
            System.out.println(value);
        }
    }
}