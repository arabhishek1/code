/**
 * Created by abhishek.ar on 10/02/17.
 */
//2. You are given a binary tree and a given sum. The task is to check if there exist a subtree whose sum of all nodes is equal to the given sum.

public class SumTree {
    Node root;
    static int currentSum =0;

    public boolean sumTree(Node root, int sum, int currentSum){
        if (root == null){
            currentSum = 0;
            return false;
        }
        int sumleft=0,  sumright =0;
        return (sumTree(root.left, sum, sumleft) ||
                sumTree(root.right, sum, sumright) ||
                ((currentSum = sumleft + sumright +root.key) == sum));
    }

    public static void main(String [] args){
        SumTree sumTree= new SumTree();
        Node root = new Node(8);
        root.left = new Node(5);
        root.right = new Node(4);
        root.left.left = new Node(9);
        root.left.right = new Node(7);
        root.right.left = new Node(45);
        root.right.right = new Node(70);
        root.right.right.left = new Node(65);
        root.right.right.right = new Node(80);

        sumTree.root = root;
        System.out.println(sumTree.sumTree(root, 18, currentSum));

    }
}
