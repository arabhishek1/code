/**
 * Created by abhishek.ar on 30/03/17.
 * Implment Min Priority Queue with insertion and deletion in log(n) time and isEmpty, size of the queue
 * and minimum element in constant time
 * *
 * heap
 * */
public class MinPQ {
    public void insert(int arr[], int n, int key){

    }

    public void heapify(int arr[], int pos, int key){
        if (key < arr[pos/2] && pos != 0){
            int temp = arr[pos/2];
            arr[pos/2] = key;
            arr[pos] = temp;
            heapify(arr, pos/2, key);
        }
    }
}
