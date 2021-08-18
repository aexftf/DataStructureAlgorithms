package Self.implemented.data.structure.senior;

/**
 * @author DELL
 */
public class BSR <E extends Comparable<E>> {

    private class Node{
        public E e;
        public  Node left,right;

        public Node(E e, Node left, Node right) {
            this.e = e;
            this.left = null;
            this.right = null;
        }
        private Node root;
        private int size;


    }
}
