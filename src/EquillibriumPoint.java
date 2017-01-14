/**
 * Created by abhishek.ar on 15/01/17.
 */
//Equilibrium index of an array
//http://www.geeksforgeeks.org/equilibrium-index-of-an-array/
public class EquillibriumPoint {

    public static int equillibriumPoint(int arr[]){
        int sum = getSum(arr);
        int leftSum=0;
        for(int i=1; i < arr.length-1; ++i){
            sum -= arr[i];
            if (sum == leftSum)
                return i;
            leftSum += arr[i];
        }
        return -1;
    }

    private static int getSum(int[] arr) {
        int sum =0;
        for(int i=0; i < arr.length; ++i)
            sum += arr[i];
        return sum;
    }

    public static void main(String[] args){
        int[] arr = new int[]{-7, 1, 5, 2, -4, 3, 0};
        System.out.println(equillibriumPoint(arr));
    }
}
