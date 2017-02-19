/**
 * Created by abhishek.ar on 14/02/17.
 */

public class printAllNodesAtK {
    public static void printKDistanceNodeDown(Node root, int k){
        if (root != null){
            if (k ==0)
                System.out.print(root.key);
            printKDistanceNodeDown(root.left, k-1);
            printKDistanceNodeDown(root.right, k-1);
        }
    }

    public static void printKNodesAllPath(Node root, int target, int k){


    }
}
