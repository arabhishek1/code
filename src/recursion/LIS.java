package recursion;

/**
 * Created by abhishek.ar on 24/02/17.
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
