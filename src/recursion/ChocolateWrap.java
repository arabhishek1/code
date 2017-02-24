package recursion;

/**
 * Created by abhishek.ar on 24/02/17.
 *
 * Program for Chocolate and Wrapper Puzzle
 Given following three values, the task is to find the total number of maximum chocolates you can eat.

 money : Money you have to buy chocolates
 price : Price of a chocolate
 wrap : Number of wrappers to be returned for getting one extra chocolate.
 Input :   money = 16, price = 2, wrap = 2
 Output :   15


 Input :   money = 15, price = 1, wrap = 3
 Output :   22
 We buy and eat 15 chocolates
 We return 15 wrappers and get 5 more chocolates.
 We return 3 wrappers, get 1 chocolate and eat it
 (keep 2 wrappers). Now we have 3 wrappers. Return
 3 and get 1 more chocolate.
 So total chocolates = 15 + 5 + 1 + 1
 */

public class ChocolateWrap {
    public static int noOfChocolates(int chocolates, int noOfWrap, int diff){
        if (chocolates == 0)
            return 0;
        else {
            diff = diff + chocolates%noOfWrap;
            if (diff/noOfWrap > 0){
                chocolates += diff/noOfWrap;
                diff = diff%noOfWrap;
            }
            return  chocolates + noOfChocolates((chocolates) / noOfWrap, noOfWrap, diff);
        }
    }

    public static int computeChocolate(int money, int price, int noOfWrap){
        int chocolates = money/price;
        return noOfChocolates(chocolates, noOfWrap, chocolates%noOfWrap);
    }

    public static void main(String[] args){
        System.out.println(computeChocolate(20, 3, 5));
    }
}
