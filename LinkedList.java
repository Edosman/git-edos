package edos;

public interface LinkedList {
    void add(char value);

    boolean remove(char value);

    char remove();

    boolean find(char value);

    boolean isEmpty();

    int getSize();

    void display();

    char getFirstElement();

}
