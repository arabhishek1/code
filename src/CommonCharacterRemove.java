import java.util.HashMap;
import java.util.Map;

/**
 * Created by abhishek.ar on 24/03/17.
 *
 * Given two strings, remove the common the character and print the left over characters from the first String.
 *
 * Example : Str1 = "abc" and Str2 = "bc" then then result to be printed is "a"
 * */
public class CommonCharacterRemove {

    public static String removeCommonCharacter(String str1, String str2){
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for(char ch : str1.toCharArray()){
            if (map.containsKey(ch)){
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }

        for (char ch : str2.toCharArray()){
            if (map.containsKey(ch)){
                map.remove(ch);
            }
        }

        String result = "";
        for(Character ch : map.keySet()){
            result += ch;
        }
        return result;
    }

    public static void main(String [] args){
        String str1 = "bc";
        String str2 = "abc";
        String result = removeCommonCharacter(str1, str2);
        if (result.isEmpty()){
            System.out.println("null");
        } else {
            System.out.println(result);
        }
        System.out.println(removeCommonCharacter(str1, str2));
    }
}
