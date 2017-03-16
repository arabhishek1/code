package recursion;

/**
 * Created by abhishek.ar on 24/02/17.
 *
 * Given a value N, if we want to make change for N cents, and we have infinite supply of each of S = { S1, S2, .. , Sm}
 * valued coins, how many ways can we make the change? The order of coins doesn’t matter.

 For example, for N = 4 and S = {1,2,3}, there are four solutions: {1,1,1,1},{1,1,2},{2,2},{1,3}.
 So output should be 4. For N = 10 and S = {2, 5, 3, 6}, there are five solutions:
 {2,2,2,2,2}, {2,2,3,3}, {2,2,6}, {2,3,5} and {5,5}. So the output should be 5.
 /*/
public class CoinChange {
    public static int coinChange(int val, int [] coins, int coinEnd){
        if (val == 0)
            return 1;
        if (val < 0)
            return 0;
        if ( coinEnd<=0 && val >= 1)
            return 0;
        return coinChange(val - coins[coinEnd-1], coins, coinEnd) + coinChange(val, coins, coinEnd-1);
    }

    public static void main(String[] args){
        int [] coins = {1,2,3};
        System.out.println(coinChange(4, coins, coins.length));
    }
}

