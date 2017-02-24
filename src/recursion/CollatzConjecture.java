package recursion;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by abhishek.ar on 24/02/17.
 */

//Given a positive integer n, the task is to find whether this number reaches to 1 after performing following two operations:-
//
//        If n is even, then n = n/2.
//        If n is odd, then n = 3*n + 1.
//        Repeat above steps, until it becomes 1.
//
public class CollatzConjecture {

    public static Set<Integer> set = new HashSet<Integer>();

    public static boolean collatzConjecture(int n) {
        if (set.contains(n))
            return false;
        if (n == 1)
            return true;
        else {
            if (n % 2 == 1) {
                n = 3 * n + 1;
                set.add(n);
                return collatzConjecture(n);
            } else {
                n = n / 2;
                set.add(n);
                return collatzConjecture(n);
            }
        }
    }

    public static void main(String [] args){
        System.out.println(collatzConjecture(5));
    }
}
