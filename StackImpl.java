package com.company;

public class StackImpl implements Stack {

    private char[] dataChars;
    private int size;

    public StackImpl(int maxSize) {
        this.dataChars = new char[maxSize];
        this.size = 0;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean isFull() {
        return size == dataChars.length;
    }

    @Override
    public void push(char value) {
        dataChars[size++] = value;
    }

    @Override
    public char pop() {
        return dataChars[--size];
    }

    @Override
    public char peek() {
        return dataChars[size - 1];
    }

    @Override
    public int getSize() {
        return size;
    }

}
