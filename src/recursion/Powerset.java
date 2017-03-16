package recursion;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by abhishek.ar on 26/02/17.
 */
public class Powerset {

    public static Set<String> set = new HashSet<String>();

    public static void powerset(String str){
        set.add(str);
        for(int i=0; i < str.length(); ++i){
            String newString = str.substring(0, i) + str.substring(i+1, str.length());
            if(!set.contains(newString))
                powerset(newString);
        }
    }

    public static void main(String [] args){
        powerset("123");
        for(String str : set){
            System.out.println(str);
        }
        System.out.println(set.size());
    }
}
