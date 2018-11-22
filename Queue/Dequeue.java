package com.company.Queue;

public interface Dequeue extends Queue{

    void insertRight(int value);
    void insertLeft(int value);

    int removeLeft();
    int removeRight();
}
