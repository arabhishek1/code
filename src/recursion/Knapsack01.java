package recursion;

/**
 * Created by abhishek.ar on 27/02/17.
 *
 * Given weights and values of n items, put these items in a knapsack of capacity W to get the maximum total value
 * in the knapsack. In other words, given two integer arrays val[0..n-1] and wt[0..n-1] which represent values and
 * weights associated with n items respectively. Also given an integer W which represents knapsack capacity,
 * find out the maximum value subset of val[] such that sum of the weights of this subset is smaller than or equal to W.
 * You cannot break an item, either pick the complete item, or don’t pick it (0-1 property)./
*/
 public class Knapsack01 {
    public static int knapsack(int Wt[], int value[], int W, int n){
        if(W == 0 || n==0)
            return 0;
        if (W < Wt[n-1])
            return knapsack(Wt, value, W, n-1);
        return Math.max(value[n-1]+knapsack(Wt, value, W - Wt[n-1], n-1), knapsack(Wt, value, W, n-1));
    }

    public static void main(String[] args){
        int val[]= {60, 100, 120};
        int Wt[] = {10, 20, 30};
        int W=50;
        System.out.println(knapsack(Wt, val, W, val.length));
    }
}
