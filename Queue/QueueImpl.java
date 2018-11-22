package com.company.Queue;

public class QueueImpl implements Queue {

    public static final int FRONT = 0;
    public static final int REAR = -1;

    private int dataQueue[];
    private int size;

    private int front;
    private int rear;

    public QueueImpl(int maxSize) {
        this.dataQueue = new int[maxSize];
        front = FRONT;
        rear = REAR;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean isFull() {
        return size == dataQueue.length;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public int remove() {
        int temp = dataQueue[front++];
        if (!isEmpty()) {
            if (front == dataQueue.length) {
                front = FRONT;
            }
            size--;
        }
            return temp;
    }

    @Override
    public void insert(int value) {
        if (!isFull()) {
            if (rear == dataQueue.length - 1) {
                rear = REAR;
            }
            dataQueue[++rear] = value;
            size++;
        }
    }
}
