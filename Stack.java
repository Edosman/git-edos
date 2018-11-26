package edos;

public interface Stack {

    boolean isEmpty();
    boolean isFull();

    void push(char value);
    char pop();
    char peek();
    int getSize();

}
