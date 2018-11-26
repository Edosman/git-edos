package edos;

public class SimpleLinkedListImpl implements LinkedList {

    protected Node firstElement;
    protected int currentSize;

    @Override
    public void add(char value) {
        Node node = new Node(value);
        node.setNextNode(firstElement);
        firstElement = node;
        currentSize++;
    }

    @Override
    public char remove() {
        if (isEmpty()) {
            return (char) -1;
        }

        char removedValue = firstElement.getValue();
        firstElement = firstElement.getNextNode();

        currentSize--;
        return removedValue;
    }

    @Override
    public boolean remove(char value) {
        Node currentNode = firstElement;
        Node previousNode = null;

        while (currentNode != null) {
            if (value == currentNode.getValue()) {
                break;
            }
            previousNode = currentNode;
            currentNode = currentNode.getNextNode();
        }

        if (currentNode == null) {
            return false;
        }

        previousNode.setNextNode(currentNode.getNextNode());
        currentSize--;
        return true;
    }

    @Override
    public boolean find(char value) {
        Node currentNode = firstElement;

        while (currentNode != null) {
            if (value == currentNode.getValue()) {
                return true;
            }
            currentNode = currentNode.getNextNode();
        }

        return false;
    }

    @Override
    public boolean isEmpty() {
        return currentSize == 0 || firstElement == null;
    }

    @Override
    public int getSize() {
        return currentSize;
    }

    @Override
    public void display() {
        Node currentNode = firstElement;

        while (currentNode != null) {
            System.out.println(currentNode.getValue());
            currentNode = currentNode.getNextNode();
        }
    }

    @Override
    public char getFirstElement() {
        return firstElement != null ? firstElement.getValue() : null;
    }
}