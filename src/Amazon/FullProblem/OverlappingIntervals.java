package Amazon.FullProblem;

import java.util.Arrays;

/**
 * Created by abhishek.ar on 08/02/17.
 */
//Given a collection of Intervals,merge all the overlapping Intervals.
//For example:
//
//        Given [1,3], [2,6], [8,10], [15,18],
//
//        return [1,6], [8,10], [15,18].
public class OverlappingIntervals implements Comparable<OverlappingIntervals>{
    int startTime;
    int endTime;

    public OverlappingIntervals(int startTime, int endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }


    @Override
    public int compareTo(OverlappingIntervals o) {
        return this.endTime < o.endTime ? -1 : 1;
    }

    public OverlappingIntervals[] mergeOverLappings(OverlappingIntervals[] arr){
        OverlappingIntervals[] newArr = new OverlappingIntervals[arr.length];
        for(int i=0; i < arr.length-1; ++i){
            if (arr[i].endTime > arr[i+1].startTime){
                newArr[i].startTime = arr[i].startTime;
                newArr[i].endTime = arr[i+1].endTime;
            } else{
                newArr[i] = arr[i];
            }
        }
        return newArr;
    }

    public static void main(String[] args){
        OverlappingIntervals[] arr = new OverlappingIntervals[4];
        arr[0] = new OverlappingIntervals(1,3);
        arr[1] = new OverlappingIntervals(2,6);
        arr[2] = new OverlappingIntervals(15,18);
        arr[3] = new OverlappingIntervals(8,10);

        Arrays.sort(arr);
        for(OverlappingIntervals o : arr){
            System.out.println(o.startTime + " " + o.endTime);
        }
    }


}
