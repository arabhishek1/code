package Amazon.FullProblem;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by abhishek.ar on 15/01/17.
 */
//Minimize string value
//http://www.practice.geeksforgeeks.org/problem-page.php?pid=1304
public class MinimizeStringValue {
    public static int minValueOfString(char[] chars, int k){
        Map<Character, Integer> charCount = new TreeMap<Character, Integer>();
        for(int i=0; i <chars.length; ++i){
            if (!charCount.containsKey(chars[i])){
                charCount.put(chars[i], 1);
            } else {
                charCount.put(chars[i], charCount.get(chars[i]) +1);
            }
        }

        return 0;
    }

}
