import java.util.Deque;
import java.util.LinkedList;

/**
 * Created by abhishek.ar on 10/02/17.
 */
//1. Given an array and an integer k, find the maximum for each and every contiguous subarray of size k.
//Examples:
//        Input :
//        arr[] = {1, 2, 3, 1, 4, 5, 2, 3, 6}
//        k = 3
//        Output :
//        3 3 4 5 5 5 6
//        Input :
//        arr[] = {8, 5, 10, 7, 9, 4, 15, 12, 90, 13}
//        k = 4
//        Output :
//        10 10 10 15 15 90 90
public class MaximumInContiguousArray {
    public static void maxInEachAndEveryContiguosArray(int arr[], int k){
        for(int i=0; i <= arr.length-k; ++i){
            int max=0;
            for(int l=0; l<k; ++l){
                max = Math.max(arr[i+l], max);
            }
            System.out.print(max);
        }
        System.out.println();
    }

    public static void maxInEachOptimized(int arr[], int k){
        Deque<Integer> deque = new LinkedList<Integer>();
        for(int i=0; i < arr.length; ++i){
            if (deque.isEmpty())
                deque.addFirst(arr[i]);
            else{
                if (deque.peek() < arr[i])
                    deque.addFirst(arr[i]);
                else
                    deque.addLast(arr[i]);
            }

        }
    }


    public static void main(String [] args){
        int[] arr= {1, 2, 3, 1, 4, 5, 2, 3, 6};
        maxInEachAndEveryContiguosArray(arr, 3);
    }
}
