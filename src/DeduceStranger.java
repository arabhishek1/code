import java.util.Stack;

/**
 * Created by abhishek.ar on 03/02/17.
 */
//In a party of N people, only one person is known to everyone.
//Such a person may be present in the party, if yes, (s)he doesn’t know anyone in the party.
//        We can only ask questions like “does A know B? “. Find the stranger (celebrity) in minimum number of questions.
//
//        We can describe the problem input as an array of numbers/characters representing persons in the party.
//        We also have a hypothetical function HaveAcquaintance(A, B) which returns true if A knows B, false otherwise.
//        How can we solve the problem, try yourself first.
//
//        We measure the complexity in terms of calls made to HaveAcquaintance().

public class DeduceStranger {
    public static int deduceStranger(int[][] connectionGraph){
        Stack<Integer> stack = new Stack<Integer>();
        for(int i=0; i < connectionGraph.length; ++i){
            stack.push(i);
        }
        while(stack.size() != 1){
            int element1 = stack.pop();
            int element2 = stack.pop();
            if (connectionGraph[element1][element2] != 1)
                stack.push(element1);
            else if (connectionGraph[element1][element2] != 1)
                stack.push(element2);
        }
        int guest = stack.pop();
        int count =0;
        for(int i=0; i < connectionGraph.length; ++i){
            if(connectionGraph[i][guest] == 1)
                ++count;
        }
        if (count + 1 == connectionGraph.length )
            return guest;
        else
            return -1;
    }

    public static void main(String [] args){
        int arr [][]= {
                {1, 1 ,1 ,0, 1},
                {0, 0, 1, 1, 1},
                {1, 0, 0, 1, 1},
                {0, 1, 1, 1, 1},
                {0, 0, 0, 0, 0}
        };
        System.out.println("THe guest is " + deduceStranger(arr));
    }
}
