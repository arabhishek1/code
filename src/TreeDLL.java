/**
 * Created by abhishek.ar on 06/02/17.
 */

class Node{
    int key;
    Node right;
    Node left;

    public Node(int key) {
        this.key = key;
        this.left = null;
        this.right = null;
    }
}

public class TreeDLL {
    Node root;

    Node head = null;

    public void inOrderTraversal(Node root){
        if (root != null){
            inOrderTraversal(root.left);
            System.out.print(root.key+ " ");
            inOrderTraversal(root.right);
        }
    }

    public Node convertLeafNodeToNode(Node root){
        if (root !=null){

            if(root.right == null && root.left == null)
            {
//                root.right = head;
            }
        }
        return null;
    }

    public static void printNode(Node node){
        while(node.right != null) {
            System.out.print(node.key + " ");
            node = node.right;
        }
    }

    public static void main(String [] args){
        TreeDLL tree = new TreeDLL();
        Node root = new Node(50);
        root.left = new Node(30);
        root.right = new Node(60);
        root.left.left = new Node(5);
        root.left.right = new Node(20);
        root.right.left = new Node(45);
        root.right.right = new Node(70);
        root.right.right.left = new Node(65);
        root.right.right.right = new Node(80);

        tree.root = root;
        printNode(tree.convertLeafNodeToNode(root));

//
    }
}
