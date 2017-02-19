package Amazon.FullProblem;

/**
 * Created by abhishek.ar on 19/02/17.
 */
public class SearchInRotationArray {
    public static int findInRotatedArray(int []arr, int key, int low, int high){
        int pivot = findRotation(arr, low, high);
        if (key == arr[pivot])
            return pivot;
        if (arr[low] < key)
            return binarySearch(arr, low, pivot-1, key);
        return binarySearch(arr, pivot+1, high, key);
    }

    public static int binarySearch(int arr[], int low, int high, int key) {
        if (high < low)
            return -1;
        int mid = (low + high) / 2;  /*low + (high - low)/2;*/
        if (key == arr[mid])
            return mid;
        if (key > arr[mid])
            return binarySearch(arr, (mid + 1), high, key);
        return binarySearch(arr, low, (mid - 1), key);
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

    public static void main(String [] args){
        int []arr = {3,4,5,1,2};
//        System.out.println(findRotation(arr, 0, arr.length-1));
        System.out.println(findInRotatedArray(arr,4,0, arr.length-1));
    }
}
