//Popraw linijki z wyswietlaniem, zeby nulla nie pokazywalo w klasie Node.
public class RandomBinaryTree {
    public static void main(String[] args) {
        Node firstNode = randomBinaryTree(6, 10, 0.5);
        System.out.println("Preorder");
        preorder(firstNode);
        System.out.println("Inorder");
        inorder(firstNode);
        System.out.println("Postorder");
        postorder(firstNode);

        System.out.println("Czy jest w drzewie: ");
        System.out.println(findInTree(5, firstNode));
        System.out.println("Wysokosc drzewa: ");
        System.out.println(getTreeHeight(firstNode));
        System.out.println("Rowne drzewo: ");
        System.out.println(setBalancedTree(10, 4));


    }

    public static Node setBalancedTree(int n, int z) {
        Node tree = null;
        int nLeft = 0;
        int nRight = 0;
        if (n > 0) {
            nLeft = Math.floorDiv(n, 2);
            nRight = n - nLeft - 1;
            tree = new Node();

            int x = (int) (Math.random() * z);

            tree.setKey(x);
            tree.setLeft(setBalancedTree(nLeft, z));
            tree.setRight(setBalancedTree(nRight, z));
            tree.toString();

        }
        return tree;
    }

    public static boolean findInTree(int x, Node node) {
        boolean isInTree = false;
        if (node != null) {
            if (x == node.getKey()) {
                isInTree = true;
            } else {
                isInTree = findInTree(x, node.getLeft());
                if (!isInTree) {
                    isInTree = findInTree(x, node.getRight());
                }
            }
        }


        return isInTree;

    }

    public static int getTreeHeight(Node node) {
        if (node == null) {
            return 0;

        } else {
            int leftHeight = getTreeHeight(node.getLeft());
            int rightHeight = getTreeHeight(node.getRight());
            if (leftHeight > rightHeight) {
                return leftHeight + 1;
            } else {
                return rightHeight + 1;
            }
        }
    }

    public static void preorder(Node node) {
        if (node != null) {
            System.out.println(node.getKey());
            preorder(node.getLeft());
            preorder(node.getRight());
        }

    }

    public static void inorder(Node node) {
        if (node != null) {
            inorder(node.getLeft());
            System.out.println(node.getKey());
            inorder(node.getRight());
        }

    }

    public static void postorder(Node node) {
        if (node != null) {
            postorder(node.getLeft());
            postorder(node.getRight());
            System.out.println(node.getKey());
        }

    }

    public static Node randomBinaryTree(int n, int z, double p) {
        Node rootElement = new Node();
        rootElement.setKey((int) (Math.random() * z));
        Node currentElement = rootElement;
        System.out.println(currentElement.toString());
        for (int i = 1; i < n; i++) {
            Node newElement = new Node();
            newElement.setKey((int) (Math.random() * z));
            newElement.setId(i);


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

                System.out.println(currentElement.toString());
            }

            while (!added);
        }
        return rootElement;
    }
}
