/**
 * Created by abhishek.ar on 02/02/17.
 */
//Find the distance between two keys in a binary tree, no parent pointers are given.
//Distance between two nodes is the minimum number of edges to be traversed to reach one node from other.
public class DistanceBetweenNode {

    private Node root;

    public static class Node {
        private int key;
        private Node left;
        private Node right;

        public Node(int key) {
            this.key = key;
            this.left = null;
            this.right = null;
        }
    }

    public void inOrder(Node root){
        if (root == null)
            return;
        inOrder(root.left);
        System.out.print(root.key + " ");
        inOrder(root.right);
    }

    public int heightFromRoot(Node root, int key){
        if (root == null)
            return 0;
        if (root.key == key)
            return 0;
        return Math.min(1 + heightFromRoot(root.left, key) , 1 + heightFromRoot(root.right, key));
    }

    public Node LCA(Node root, Node m, Node n) {
        if(root == null)
            return null;
        if (root == m || root ==n)
            return root;
        Node left = LCA(root.left, m, n);
        Node right = LCA(root.right, m, n);
        if(left != null && right!= null)
            return root;
        return (left!=null) ? left: right;
    }

    public int distanceBetweenNodes(Node m, Node n){
        int distanceFromRootToM = heightFromRoot(root, m.key);
        System.out.println(distanceFromRootToM);
        int distanceFromRootToN = heightFromRoot(root,n.key);
        System.out.println(distanceFromRootToN);
        int LCA = LCA(root, m, n).key;
        System.out.println(LCA);
        int distanceFromRootToLCA = heightFromRoot(root, LCA);
        System.out.println(distanceFromRootToLCA);
        return (distanceFromRootToM + distanceFromRootToN - 2*distanceFromRootToLCA);
    }

    public static void main(String[] args){
        Node node = new Node(1);
        node.left = new Node(2);
        node.right = new Node(3);
        node.left.left = new Node(4);
        node.left.right = new Node(5);
        node.right.left = new Node(6);
        node.right.right = new Node(7);
        DistanceBetweenNode nde = new DistanceBetweenNode();
        nde.root = node;
        System.out.println(nde.distanceBetweenNodes(node.left.left,node.right.right));
    }


}
