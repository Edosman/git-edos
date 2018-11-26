package edos;

import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        testStack();
        testQueue();
    }


    public static void testStack() {
        LinkedList list = new SimpleLinkedListImpl();

        list.add('A');
        list.add('B');
        list.add('C');
        list.add('D');
        list.add('F');

        System.out.println("Чтение из стека:");

        while (!list.isEmpty()) {
            System.out.println(list.remove());
        }
    }

    public static void testQueue() {
        TwoSideLinkedList list = new TwoSideLinkedListImpl();

        list.add('A');
        list.add('B');
        list.add('C');
        list.add('D');

        list.remove();

        list.add('E');
        list.add('F');
        list.add('G');

        list.remove('A');
        list.addLast('Z');

        System.out.println("\n Чтение из очереди:");

        list.display();
        }
    }

