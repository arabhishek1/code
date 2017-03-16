package recursion;

/**
 * Created by abhishek.ar on 24/02/17.
 *
 * Given two strings str1 and str2 and below operations that can performed on str1.
 * Find minimum number of edits (operations) required to convert ‘str1’ into ‘str2’.

 Insert
 Remove
 Replace/

 Input:   str1 = "geek", str2 = "gesek"
 Output:  1
 We can convert str1 into str2 by inserting a 's'.

 Input:   str1 = "cat", str2 = "cut"
 Output:  1
 We can convert str1 into str2 by replacing 'a' with 'u'.

 Input:   str1 = "sunday", str2 = "saturday"
 Output:  3
 Last three and first characters are same.  We basically
 need to convert "un" to "atur".  This can be done using
 below three operations.
 Replace 'n' with 'r', insert t, insert a
 */
public class EditDistance {
    public static int minEditDistance(char[] str1, char[] str2, int str1End, int str2End) {
        if (str1End == 0)
            return str2End;
        if (str2End == 0)
            return str1End;

        if (str1[str1End - 1] == str2[str2End - 1]) {
            return minEditDistance(str1, str2, str1End - 1, str2End - 1);
        } else {
            return 1 + Math.min(Math.min(minEditDistance(str1, str2, str1End, str2End - 1),
                    minEditDistance(str1, str2, str1End - 1, str2End)),
                    minEditDistance(str1, str2, str1End - 1, str2End - 1));
        }
    }

    public static void main(String[] args){
        String str1 = "sunday";
        String str2 = "saturday";

        System.out.println(minEditDistance(str1.toCharArray(), str2.toCharArray(), str1.length(), str2.length()));
    }
}
