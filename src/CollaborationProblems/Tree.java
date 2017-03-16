package CollaborationProblems;

/**
 * Created by abhishek.ar on 06/03/17.
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

public class Tree {
    Node root;

    public Tree(Node root) {
        this.root = root;
    }

    public static Node treeFromInOrderAndPostOrder(int[] inOrder, int[] postOrder, int iStart, int iEnd, int pStart,int pEnd) {
        if (iStart > iEnd || pStart > pEnd)
            return null;

        Node node = new Node(postOrder[pEnd]);
        if (iStart == iEnd)
            return node;

        int iIndex = find(inOrder,node.key, iStart, iEnd);

        node.left = treeFromInOrderAndPostOrder(inOrder, postOrder, iStart, iIndex-1, pStart, pStart + iIndex -(iStart+1));
        node.right = treeFromInOrderAndPostOrder(inOrder, postOrder, iIndex+1, iEnd, pStart + iIndex -iStart ,pEnd-1);
        return node;

    }

    private static int find(int[] inOrder, int key, int iStart, int iEnd) {
        int i;
        for(i = iStart; i <= iEnd; ++i)
            if (inOrder[i] == key)
                break;
        return i;

    }

    public static void main(String[] args){

    }
}
