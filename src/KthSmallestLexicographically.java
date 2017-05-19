import java.util.Arrays;

/**
 * Created by abhishek.ar on 25/04/17.
 */
public class KthSmallestLexicographically {
    public static int kthSmallestLexicographically(int n, int k){
        int arr[] = new int [n];
        for(int i=1; i <= n; ++i){
            arr[i-1] = i;
        }
        int bitCount[] = new int[n];
        for(int i=0; i < bitCount.length; ++i){
            bitCount[i] = arr[i] & 1;
        }
        Arrays.sort(bitCount);
        return 0;
    }
}
