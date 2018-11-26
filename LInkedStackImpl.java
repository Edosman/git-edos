package edos;

public class LInkedStackImpl implements Stack{
    private LinkedList linkedList;

    public LInkedStackImpl() {
        this.linkedList = new SimpleLinkedListImpl();
    }

    @Override
    public boolean isEmpty() {
        return linkedList.isEmpty();
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public int getSize() {
        return linkedList.getSize();
    }

    @Override
    public void push(char value) {
        linkedList.add(value);
    }

    @Override
    public char pop() {
        return linkedList.remove();
    }

    @Override
    public char peek() {
        return linkedList.getFirstElement();
    }
}