/**
 * Created by abhishek.ar on 15/01/17.
 */
//In a given array A[] find the maximum value of (A[i] – i) - (A[j] – j) where i is not equal to j.
//http://www.practice.geeksforgeeks.org/problem-page.php?pid=1330
public class MaxValue {
    public static int maxValue(int arr[]){
        int diffArr[] = new int[arr.length];
        for(int i=0; i < arr.length; ++i){
            diffArr[i] = arr[i]-i;
        }
        int maxSoFar = diffArr[0];
        int minSoFar = diffArr[0];
        for(int i=1; i<diffArr.length; ++i){
            if (diffArr[i] > maxSoFar)
                maxSoFar = diffArr[i];
            if (diffArr[i] < minSoFar)
                minSoFar = diffArr[i];
        }
        return maxSoFar-minSoFar;
    }

    public static void main(String[] args){
        int arr[] = new int[]{9, 15, 4, 12, 13};
        System.out.println(maxValue(arr));
    }
}
