package com.company.Queue;

public interface Queue {

    boolean isEmpty();
    boolean isFull();

    int getSize();
    int remove();
    void insert(int value);
}
