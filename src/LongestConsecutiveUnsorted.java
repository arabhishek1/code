import java.util.HashSet;

/**
 * Created by abhishek.ar on 29/01/17.
 */
//Given an unsorted array of integers, find the length of the longest consecutive elements sequence.
// For example,
// Given [100, 4, 200, 1, 3, 2],
// The longest consecutive elements sequence is [1, 2, 3, 4]. Return its length: 4.
// Your algorithm should run in O(n) complexity.

public class LongestConsecutiveUnsorted {
    public static int longestConsecutiveUnsorted(int [] arr){
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i : arr){
            set.add(i);
        }
        int longestCount =0;


        for(int i : arr){
            int left = i-1;
            int right = i+1;
            int count =1;

            while(set.contains(left)){
                ++count;
                set.remove(left);
                --left;
            }

            while(set.contains(right)){
                ++count;
                set.remove(right);
                ++right;
            }
            longestCount = Math.max(count, longestCount);

        }
        return longestCount;
    }
    public static void main(String[] args){
        int arr[] = new int[] {100,200, 3,2,1,4};
        System.out.println(longestConsecutiveUnsorted(arr));
    }
}
