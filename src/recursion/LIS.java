package recursion;

/**
 * Created by abhishek.ar on 24/02/17.
 * The Longest Increasing Subsequence (LIS) problem is to find the length of the longest subsequence of a given sequence
 * such that all elements of the subsequence are sorted in increasing order.
 * For example, the length of LIS for {10, 22, 9, 33, 21, 50, 41, 60, 80} is 6 and LIS is {10, 22, 33, 50, 60, 80}.
 */
public class LIS {

    public static int recLIS(int[] arr, int startIndex, int endIndex){
        int currLIS = 0;
        if(startIndex < endIndex) {
            for (int i = startIndex; i < endIndex - 1; ++i) {
                if (arr[i] < arr[i+1]) {
                    currLIS += 1;
                }
            }
            return Math.max(currLIS, recLIS(arr, startIndex+1, endIndex));
        }
        return currLIS;
    }


    public static void main(String [] args){
        int arr[]={0, 8, 4, 12, 2, 10, 6, 14, 1, 9, 5, 13, 3, 11, 7, 15};
        System.out.println(recLIS(arr, 0, arr.length));
    }
}
