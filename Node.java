package edos;

public class Node {
    private final char value;
    private Node nextNode;

    public Node(char value) {
        this.value = value;
    }

    public char getValue() {
        return value;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }
}
