
public class Node {
    private int id;
    private int key = 1;
    private Node right;
    private Node left;

    public void setId(int id) {
        this.id = id;
    }

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
        String temp = "Node: " + this.key + " key: " + this.id;
        int leftInt = 0;
        int rightInt = 0;
        if (this.right != null) {
            rightInt = right.key;
            temp += " right: " + right;
        }
        if (this.left != null)
            leftInt = left.key;
        temp += " left: " + left;
        return temp;
    }
}
