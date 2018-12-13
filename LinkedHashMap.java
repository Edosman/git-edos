package com.company;

public class LinkedHashMap {

    private int key;
    private String value;
    private LinkedHashMap next;

    public LinkedHashMap(int key, String value) {
        this.key = key;
        this.value = value;
        this.next = null;
    }

    public int getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public LinkedHashMap getNext() {
        return next;
    }

    public void setNext(LinkedHashMap next) {
        this.next = next;
    }
}

