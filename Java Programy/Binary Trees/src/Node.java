
public class Node {
    private int key;
    private Node right;
    private Node left;

    public int getKey() {
        return key;
    }

    public Node getRight() {
        return right;
    }

    public Node getLeft() {
        return left;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    @Override
    public String toString() {
        String temp = "";
        int leftInt = 0;
        int rightInt = 0;
        if (this.right != null) {
            rightInt = right.key;
        }
        if (this.left != null)
            leftInt = left.key;
        return "Node: " + this.key + " right: " + right + " left: " + left;
    }
}
