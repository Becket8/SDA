/**
 * Created by RENT on 2017-08-16.
 */
public class RandomBinaryTree {
    public static void main(String[] args) {

    }

    public static Node randomBinaryTree(int n, int z, double p, Node node) {
        Node rootElement = new Node();
        rootElement.setKey((int) Math.random() * z);
        Node currentElement = rootElement;

        for (int i = 1; i < n; i++) {
            Node newElement = new Node();
            newElement.setKey((int) Math.random() * z);


            boolean added = false;
            do {
                if (Math.random() < p) {
                    if (currentElement.getLeft() == null) {
                        currentElement.setLeft(newElement);
                        added = true;
                    } else {
                        currentElement = currentElement.getLeft();
                    }

                } else {
                    if (currentElement.getRight() == null) {
                        currentElement.setRight(newElement);
                        added = true;

                    } else {
                        currentElement = currentElement.getRight();
                    }
                }


            }
            while (!added);
        }
        return rootElement;
    }
}
