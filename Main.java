package com.company;

import com.company.Queue.Dequeue;
import com.company.Queue.DequeueImpl;
import com.company.Queue.Queue;
import com.company.Queue.QueueImpl;

public class Main {

    public static void main(String[] args) {
        testStack();
        testQueue();
        testBrackets();
        testRevers();
        testDequeue();

    }


    public static void testStack(){
        Stack stack = new StackImpl(5);

        stack.push('A');
        stack.push('B');
        stack.push('C');
        stack.push('D');
        stack.push('F');

        System.out.println("Чтение из стека:");

        while ( !stack.isEmpty() ) {
            System.out.println(stack.pop());
        }
    }
    public static void testQueue(){
        Queue queue = new QueueImpl(5);

        queue.insert(1);
        queue.insert(2);
        queue.insert(3);
        queue.insert(4);

        queue.remove();

        queue.insert(5);
        queue.insert(6);
        queue.insert(7);

        System.out.println("\n Чтение из очереди:");

        while ( !queue.isEmpty() ) {
            System.out.println(queue.remove());
        }
    }


    private static void testBrackets() {
        System.out.println("\n Тест на правописание скобок:");
        Brackets brackets = new Brackets("    public int peek() (        return data[size - 1};    ");
        brackets.checkBrackets();
    }

    public static void testRevers(){
        System.out.println("\n Перевёрнутая строка: ");
        ReverseText reverseText = new ReverseText("\n Живи, сохраняя покой. Придет время и цветы распустятся сами.");
        reverseText.revers();
    }

    private static void testDequeue() {
        Dequeue dequeue = new DequeueImpl(5);

        dequeue.insertRight(1);
        dequeue.insertRight(2);
        dequeue.insertRight(3);
        dequeue.insertRight(4);
        dequeue.insertRight(5);

        dequeue.removeRight();
        dequeue.removeLeft();

        dequeue.insertRight(5);
        dequeue.insertLeft(1);

        System.out.println("\n Чтение из двухсторонней очереди:");

        while ( !dequeue.isEmpty() ) {
            System.out.println(dequeue.removeLeft());
        }
    }

}
