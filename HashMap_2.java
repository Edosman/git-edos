package com.company;

public class HashMap_2 {

    private int sizeTab = 100;

    LinkedHashMap[] tsb;

    HashMap_2() {
        tsb = new LinkedHashMap[sizeTab];
    }

    public int getSizeTab() {
        return sizeTab;
    }

    public void add(int key, String value) {
        int hashCode = hashFunc(key);
        if (tsb[hashCode] == null) tsb [hashCode] = new LinkedHashMap(key, value);
        else {
            LinkedHashMap hash = tsb[hashCode];
            while (hash.getNext() != null && hash.getKey() != key){
                hash = hash.getNext();
                if (hash.getKey() == key) hash.setValue(value);
                else hash.setNext(new LinkedHashMap(key, value));
            }
        }
    }

    public String getValue(int key) {
        int hashCode = hashFunc(key);
        if (tsb[hashCode] == null) return null;
        else {
            LinkedHashMap hash = tsb[hashCode];
            while (hash != null && hash.getKey() != key)
                hash = hash.getNext();
            if (hash == null) return null;
            else return hash.getValue();
        }
    }

    public void remove(int key) {
        int hashCode = hashFunc(key);
        if (tsb[hashCode] != null) {
            LinkedHashMap prevEntry = null;
            LinkedHashMap entry = tsb[hashCode];
            while (entry.getNext() != null && entry.getKey() != key) {
                prevEntry = entry;
                entry = entry.getNext();
            }
            if (entry.getKey() == key) {
                if (prevEntry == null)
                    tsb[hashCode] = entry.getNext();
                else
                    prevEntry.setNext(entry.getNext());
            }
        }
    }

    private int hashFunc(int key) {
        return key % sizeTab;
    }
}
