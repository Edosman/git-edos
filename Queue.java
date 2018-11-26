package edos;

public interface Queue {

    boolean isEmpty();
    boolean isFull();

    int getSize();
    char remove();
    void insert(char value);
}
