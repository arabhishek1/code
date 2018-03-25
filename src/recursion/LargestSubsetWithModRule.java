package recursion;

import java.util.*;

/**
 * Created by abhishek.ar on 19/05/17.
 *
 * Given a set of distinct positive integers, find the largest subset such that every pair (Si, Sj) of
 * elements in this subset satisfies: Si % Sj = 0 or Sj % Si = 0.

 If there are multiple solutions, return any subset is fine.

 Example 1:

 nums: [1,2,3]

 Result: [1,2] (of course, [1,3] will also be ok)
 Example 2:

 nums: [1,2,4,8]

 Result: [1,2,4,8]
 * */
public class LargestSubsetWithModRule {

    public static Set<Integer> set = new HashSet<Integer>();

    public static void largestSubset(int arr[], int start, int end){
        for(int i=start +1; i < end; ++i){
            if (arr[i] % arr[i-1] == 0 || arr[i-1] % arr[i] == 0) {
                if (set.isEmpty()){
                    set.add(arr[i]);
                    set.add(arr[i-1]);
                } else{
                    if (!set.contains(arr[i])){
                        boolean flag = true;
                        Iterator<Integer> iterator = set.iterator();
                        while(iterator.hasNext()){
                            int temp = iterator.next();
                            if (!(arr[i] % temp == 0 || temp % arr[i] == 0)){
                                flag = false;
                            }
                        }
                        if (flag){
                            set.add(arr[i]);
                        }
                    }
                }
            }
        }
//        List<Integer> set = new ArrayList<Integer>();
//        for(int i=start; i < end - 1; ++i){
//            for (int j= i +1 ; j < end - 2 ; ++j){
//                if (arr[i] % arr[j] == 0 && arr[j] % arr[i] == 0 ){
//                    set.add(i);
//                }
//            }
//        }
//        return set;

    }

    public static void main(String [] args){
        int [] arr = {1,2,4,8,12,16,24};
        largestSubset(arr, 0, arr.length);
        Iterator<Integer> iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
