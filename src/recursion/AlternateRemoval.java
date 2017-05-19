package recursion;

/**
 * Created by abhishek.ar on 17/05/17.
 *
 * There is a list of sorted integers from 1 to n. Starting from left to right, remove the first
 * number and every other number afterward until you reach the end of the list.
 Repeat the previous step again, but this time from right to left, remove the
 right most number and every other number from the remaining numbers.
 We keep repeating the steps again, alternating left to right and right to left,
 until a single number remains.

 Find the last number that remains starting with a list of length n.

 Example:

 Input:
 n = 9,
 1 2 3 4 5 6 7 8 9
 2 4 6 8
 2 6
 6

 Output:
 6



 * */
public class AlternateRemoval {



    public static int lastRemaining(int n){
        if (n == 1)
            return 1;
        else
            return leftToRight(n);
    }

    private static int leftToRight(int n) {
        if (n == 1)
            return 1;
        else
            return 2*rightToLeft(n/2);
    }

    private static int rightToLeft(int n) {
        if (n == 1)
            return 1;
        else{
            if (n % 2 == 0)
                return 2* leftToRight(n/2) - 1;
            else
                return 2* leftToRight(n/2);
        }
    }

    public static void main(String [] args){
        System.out.println(lastRemaining(10000000));
    }


}

/*
Treat both leftRight and RightLeft as different computations.
In case of RightLeft
If the length of array is even, we will get only odd number
        [1, 2, 3, 4] -> [1, 3] = 2 * [1, 2] - 1
else if the length of array is odd, we will get only even number
        [1, 2, 3, 4, 5] -> [2, 4] = 2 * [1, 2]
In case of LeftRight:
the length of array doesn't matter
         [1, 2, 3, 4] -> 2 * [1, 2]
         [1, 2, 3, 4, 5] -> 2 * [1, 2]
*/
