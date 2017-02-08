package Amazon.FullProblem;

/**
 * Created by abhishek.ar on 08/02/17.
 */
//Given an array of integers, sort the array into a wave like array and return it.
//In other words, arrange the elements into a sequence such that a1 >= a2 <= a3 >= a4 <= a5.....
public class WaveArray {
    public static void waveArray(int arr[]) {
        for (int i = 0; i < arr.length; i += 2) {
            if (i > 0 && arr[i] < arr[i - 1]) {
                int temp = arr[i];
                arr[i] = arr[i - 1];
                arr[i - 1] = temp;
            }
            if (i < arr.length - 1 && arr[i] < arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
    }

    public static void displayArr(int arr[]){
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        int arr[] = {10, 5, 6, 3, 2, 20, 100, 80};
        displayArr(arr);
        waveArray(arr);
        displayArr(arr);
    }
}
