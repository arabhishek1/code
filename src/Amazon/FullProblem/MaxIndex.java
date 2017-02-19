package Amazon.FullProblem;

/**
 * Created by abhishek.ar on 18/02/17.
 */
//Given an array A of integers, find the maximum of j - i subjected to the constraint of A[i] <= A[j].
//Example :
//
//A : [3 5 4 2]
//
// Output : 2
// for the pair (3, 4)
public class MaxIndex {
    public static int maxIndex(int arr[]){
        int[] lArr= new int[arr.length];
        int[] rArr= new int[arr.length];
        lArr[0]=arr[0];
        for(int i=1; i < arr.length; ++i){
            lArr[i] = Math.min(arr[i], arr[i-1]);
        }
        rArr[arr.length-1]=arr[arr.length-1];
        for(int j= arr.length-2; j>=0; --j){
            rArr[j]= Math.max(arr[j], arr[j+1]);
        }
        int max=0;

        for(int i=0, j=0; j < arr.length && i < arr.length; ){
            if(lArr[i] < rArr[j]) {
                max = Math.max(max, j - i);
                ++j;
            } else {
                ++i;
            }
        }
        return max;
    }

    public static void main(String args[]){
        int arr[]={2,5,3,4,1};
        System.out.println(maxIndex(arr));
    }
}
