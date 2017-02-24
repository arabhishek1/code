package Amazon.FullProblem;

/**
 * Created by abhishek.ar on 19/02/17.
 */
//Count ways to reach the n’th stair
public class Stairs {
    public static int fib(int n){
        if(n <=1)
            return n;
        else
            return fib(n-1) + fib(n-2);
    }

    public static int countNoOfWays(int n){
        return fib(n+1);
    }

    public static void main(String[] args){
        System.out.println(countNoOfWays(10));
    }
}
