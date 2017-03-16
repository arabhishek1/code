package recursion;

/**
 * Created by abhishek.ar on 03/03/17.
 *
 * Given an array of integers where each element represents the max number of steps that can be made forward
 * from that element. Write a function to return the minimum number of jumps to reach
 * the end of the array (starting from the first element). If an element is 0, then cannot move through that element.
 *
 *
 */
public class MinJump {
    public static int minJump(int arr[], int start, int end, int jump){
        if (start == end-1)
            return jump;
        if (start < end-1){
           int min =Integer.MAX_VALUE;
           for(int i= start+1 ; i <= arr[start]; ++i){
               int jumps = minJump(arr, start + i, end, jump +1);
               if (jumps < min && jumps !=0)
                   min = jumps;
           }
            return min;
        }
        if (start > end-1){
            jump = 0;
        }
        return jump;
    }

    public static void main(String [] args){
        int arr[]= {1 ,3, 5, 8, 9, 2, 6, 7, 6, 8 ,9};
        System.out.println(minJump(arr, 0, arr.length, 0));
    }
}
