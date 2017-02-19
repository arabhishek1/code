package Amazon.FullProblem;

import java.util.Arrays;

/**
 * Created by abhishek.ar on 19/02/17.
 */
//Given a number n, find the smallest number that has same set of digits as n and is greater than n. If x is the greatest possible number with its set of digits, then print “not possible”.

//Examples:
//        For simplicity of implementation, we have considered input number as a string.
//Input:  n = "218765"
//Output: "251678"
//
//        Input:  n = "1234"
//        Output: "1243"
public class GreaterNumber {
    public static String nextGreaterNumber(char[] chars){
        for(int i= chars.length-1; i >=1; --i){
            if(chars[i] > chars[i-1]){
                char smallest ='9';
                int smallestIndex= -1;
                for(int j= i; j < chars.length; ++j){
                    if(chars[j] < smallest) {
                        smallest = chars[j];
                        smallestIndex =j;
                    }
                }
                char temp = chars[i];
                chars[i] = chars[smallestIndex];
                chars[smallestIndex]=temp;
                String intermediateResult = String.valueOf(chars);
                String subStr= intermediateResult.substring(i, chars.length);
                char[] subStrch = subStr.toCharArray();
                Arrays.sort(subStrch);
                subStr = String.valueOf(subStrch);
                String result = intermediateResult.substring(0, i) + subStr;
                return result;
            }

        }
        return "-1";
    }

    public static void main(String[] args){
        String str = "4321";
        System.out.println(nextGreaterNumber(str.toCharArray()));
    }
}
