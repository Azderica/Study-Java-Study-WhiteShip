package week5;

public class Node {
    int value;
    Node left;
    Node right;

    Node(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }

    public Node addLeftNode(int value){
        Node node = new Node(value);
        this.left = node;
        return node;
    }

    public Node addRightNode(int value){
        Node node = new Node(value);
        this.right = node;
        return node;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }
}
