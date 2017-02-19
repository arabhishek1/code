package Amazon.FullProblem;

/**
 * Created by abhishek.ar on 19/02/17.
 */
//Given a sorted array which is rotated 'N' times. Find the value of 'N'
public class RotationArray {
    public static int findRotation(int [] arr){
        for(int i=0; i < arr.length-1; ++i){
            if(arr[i] > arr[i+1])
                return i+1;
        }
        return 0;
    }

    public static int findRotation(int arr[], int low, int high){

        if (high < low)  return -1;
        int mid = low + (high-low)/2;
        if(arr[mid]> arr[mid+1])
            return mid;
        if(arr[mid]< arr[mid-1])
            return mid-1;
        if(arr[low] >= arr[mid])
            return findRotation(arr, low, mid-1);
        else
            return findRotation(arr, mid+1, high);

    }
    public static void main(String[] args){
        int arr[]={2,3,4,5,1};
        System.out.println(findRotation(arr));
        System.out.println(findRotation(arr, 0, arr.length-1)+1);
    }
}
