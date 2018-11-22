package com.company.Queue;

public interface Dequeue {

    boolean isEmpty();
    boolean isFull();

    int getSize();

    void insertRight(int value);
    void insertLeft(int value);

    int removeLeft();
    int removeRight();
}
