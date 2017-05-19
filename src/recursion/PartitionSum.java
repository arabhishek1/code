package recursion;

/**
 * Created by abhishek.ar on 02/04/17.
 *
 * Partition problem is to determine whether a given set can be partitioned into two subsets such that the
 * sum of elements in both subsets is same.
 * arr[] = {1, 5, 11, 5}
 Output: true
 The array can be partitioned as {1, 5, 5} and {11}

 arr[] = {1, 5, 3}
 Output: false
 The array cannot be partitioned into equal sum sets.
 */
public class PartitionSum {

    public static boolean partitionSum(int arr[], int n, int sum){
        if (sum == 0)
            return true;
        if (n == 0 && sum != 0)
            return false;
        return partitionSum(arr, n-1, sum) || partitionSum(arr, n-1, sum-arr[n-1]);
    }

    public static boolean partitionHelper(int arr[], int n){
        int sum = getSum(arr, n);
        if (sum %2 == 0)
            return partitionSum(arr, n, sum);
        else
            return false;
    }

    public static int getSum(int arr[], int n){
        int sum =0;
        for (int i=0; i < n; ++i)
            sum += arr[i];
        return sum;
    }

    public static void main(String [] args){
        int arr[] = {3, 2, 5, 9, 6};
        System.out.println(partitionHelper(arr, arr.length));
    }
}
