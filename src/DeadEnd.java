import java.util.HashSet;

/**
 * Created by abhishek.ar on 12/02/17.
 */
//Given a Binary search Tree that contains positive integer values greater then 0.
// The task is to check whether the BST contains a dead end or not.
// Here Dead End means, we are not able to insert any element after that node.
//        Examples:
//        Input :        8
//        /   \
//        5      9
//        /   \
//        2     7
//        /
//        1
//        Output : Yes
//        Explanation : Node "1" is the dead End because
//        after that we cant insert any element.
//
//        Input :       8
//        /   \
//        7     10
//        /      /   \
//        2      9     13
//
//        Output : Yes
//        Explanation : We can't insert any element at
//        node 9.

public class DeadEnd {
    public static HashSet<Integer> allNodes = new HashSet<Integer>();
    public static HashSet<Integer> leafNodes = new HashSet<Integer>();
    public static void insert(Node root){
        if (root != null){
            allNodes.add(root.key);
            if(root.left == null && root.right == null)
                leafNodes.add(root.key);
            insert(root.left);
            insert(root.right);
        }
    }

    public static boolean isDeadEnd(){
        //for the case of 1;
        allNodes.add(0);
        for(Integer i : leafNodes){
            if (allNodes.contains(i+1) && allNodes.contains(i-1))
                return true;
        }
        return false;
    }

    public static void main(String[] args){
        Node root = new Node(8);
        root.left = new Node(7);
        root.right = new Node(10);
        root.left.left = new Node(2);
        root.right.left = new Node(9);
        root.right.right = new Node(13);
        insert(root);
        System.out.println(isDeadEnd());
    }
}
