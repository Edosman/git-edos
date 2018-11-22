package com.company.Queue;

public class DequeueImpl implements Dequeue {

    public static final int FRONT = 0;
    public static final int REAR = -1;

    private int dataDequeue[];
    private int size;

    private int front;
    private int rear;

    public DequeueImpl(int maxSize) {
        this.dataDequeue = new int[maxSize];
        front = FRONT;
        rear = REAR;
    }


    @Override
    public void insertRight(int value) {
        if (!isFull()) {
            if (rear == dataDequeue.length - 1) {
                rear = REAR;
            }
            dataDequeue[++rear] = value;
            size++;
        }
    }

    @Override
    public void insertLeft(int value) {
        if (!isFull()) {
            if (front == 0)
                front = size;
            dataDequeue[--front] = value;
            size++;
        }
    }

    @Override
    public int removeLeft() {
        int temp = dataDequeue[front++];
        if (!isEmpty()) {
            if (front == dataDequeue.length) {
                front = FRONT;
            }
            size--;
        }
        return temp;
    }

    @Override
    public int removeRight() {
        int temp = dataDequeue[rear--];
        if (!isEmpty()) {
            if (rear == dataDequeue.length) {
                rear = REAR;
            }
            size--;
        }
        return temp;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean isFull() {
        return dataDequeue.length == size;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public int remove() {
        return 0;
    }

    @Override
    public void insert(int value) {

    }
}
