package com.company.Queue;

public class PriorityQueue implements Queue {

    private int dataPriorityQueue[];
    private int size;

    public PriorityQueue(int maxSize) {
        this.dataPriorityQueue = new int[maxSize];
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean isFull() {
        return size == dataPriorityQueue.length;
    }

    @Override
    public int getSize() {
        return size ;
    }

    @Override
    public int remove() {
        return dataPriorityQueue[--size];
    }

    @Override
    public void insert(int value) {
        if (isEmpty()) {
            dataPriorityQueue[size++] = value;
        }
        else {
            int index;
            for (index = size - 1; index >= 0; index--) {
                if (value > dataPriorityQueue[index]) {
                    dataPriorityQueue[index + 1] = dataPriorityQueue[index];
                }
                else {
                    break;
                }
            }

            dataPriorityQueue[index + 1] = value;
            size++;
        }
    }
}
