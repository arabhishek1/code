/**
 * Created by abhishek.ar on 06/02/17.
 */
//Given an array A[0 … n-1] containing n positive integers, a subarray A[i … j]
//  is bitonic if there is a k with i <= k <= j such that A[i] <= A[i + 1] ... <= A[k] >= A[k + 1] >= .. A[j – 1] > = A[j].
//  Write a function that takes an array as argument and returns the length of the maximum length bitonic subarray.
//  Expected time complexity of the solution is O(1)
//
//        Simple Examples
//        1) A[] = {12, 4, 78, 90, 45, 23}, the maximum length bitonic subarray is {4, 78, 90, 45, 23} which is of length 5.
//
//        2) A[] = {20, 4, 1, 2, 3, 4, 2, 10}, the maximum length bitonic subarray is {1, 2, 3, 4, 2} which is of length 5.
public class Bitonic {

    public static int bitonic(int [] arr){
        int inc[] = new int [arr.length]; // Length of increasing subarray ending at all indexes
        int dec[] = new int [arr.length]; // Length of decreasing subarray starting at all indexes
        int i, max;

        // length of increasing sequence ending at first index is 1
        inc[0] = 1;

        // length of increasing sequence starting at first index is 1
        dec[arr.length-1] = 1;

        // Step 1) Construct increasing sequence array
        for (i = 1; i < arr.length; i++)
            inc[i] = (arr[i] > arr[i-1])? inc[i-1] + 1: 1;

        // Step 2) Construct decreasing sequence array
        for (i = arr.length-2; i >= 0; i--)
            dec[i] = (arr[i] > arr[i+1])? dec[i+1] + 1: 1;

        // Step 3) Find the length of maximum length bitonic sequence
        max = inc[0] + dec[0] - 1;
        for (i = 1; i < arr.length; i++)
            if (inc[i] + dec[i] - 1 > max)
                max = inc[i] + dec[i] - 1;

        return max;
    }

    public static void main(String[] args){
        int arr[] = new int[] {20, 4, 1, 2, 3, 4, 2, 10};
        System.out.println(bitonic(arr));
    }
}
