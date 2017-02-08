package Amazon.FullProblem;

/**
 * Created by abhishek.ar on 08/02/17.
 */
//Given an array containing both negative and positive integers. Find the contiguous sub-array with maximum sum.
public class KadaneAlgo {

    public static int maxSumSubsequence(int arr[]) {
        int currSum = 0;
        int maxSum = 0;
        for (int i = 0; i < arr.length; ++i) {
            currSum = Math.max(currSum + arr[i], 0);
            maxSum = Math.max(maxSum, currSum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int arr[] = new int[]{-1, 2, -3, -4};
        System.out.println(maxSumSubsequence(arr));
    }
}
