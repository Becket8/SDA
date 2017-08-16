/**
 * Created by RENT on 2017-08-16.
 */
public class RandomBinaryTree {
    public static void main(String[] args) {

    }

    public static Node randomBinaryTree(int n, int z, double p, Node node) {
        Node nodeElement = new Node();
        nodeElement.setKey((int) Math.random() * z);

        for (int i = 1; i < n; i++) {
            Node newElement = new Node();
            newElement.setKey((int) Math.random() * z);

            boolean added = false;
            do{
                if(Math.random() < p){
                    
                }else{

                }

            }while(!added);
        }
        return nodeElement;
    }
}
