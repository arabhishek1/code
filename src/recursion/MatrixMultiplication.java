package recursion;

/**
 * Created by abhishek.ar on 25/02/17.
 *  Input: p[] = {40, 20, 30, 10, 30}
 Output: 26000
 There are 4 matrices of dimensions 40x20, 20x30, 30x10 and 10x30.
 Let the input 4 matrices be A, B, C and D.  The minimum number of
 multiplications are obtained by putting parenthesis in following way
 (A(BC))D --> 20*30*10 + 40*20*10 + 40*10*30
 */
public class MatrixMultiplication {
    public static int minMultiply(int arr[], int i, int j){
        if (i == j)
            return 0;
        int min = Integer.MAX_VALUE;

        for(int k=i; k < j ; ++k){
            int count = minMultiply(arr, i, k) + minMultiply(arr, k+1, j) + arr[i-1]*arr[k]*arr[j];
            if (count < min)
                min = count;
        }
        return min;
    }

    public static void main(String [] args){
        int arr[] = {1, 2, 3, 4, 3};
        System.out.println(minMultiply(arr, 1, arr.length-1));
    }
}
