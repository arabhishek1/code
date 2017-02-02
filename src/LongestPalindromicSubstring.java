/**
 * Created by abhishek.ar on 26/01/17.
 */
public class LongestPalindromicSubstring {

    public static int recLongestPalindromicSubstring(char[] chars, int start, int end){
        if (start == end)
            return 1;
        if (start < end) {
            if (chars[start] == chars[end])
                return 2 + recLongestPalindromicSubstring(chars, start + 1, end - 1);
            else {
                return Math.max(recLongestPalindromicSubstring(chars, start + 1, end), recLongestPalindromicSubstring(chars, start, end - 1));
            }
        }
        return 0;
    }

    public static int dpLongestPalindromicSubstring(char[] chars){
        int [][] count = new int[chars.length][chars.length];
        for(int i=1; i < chars.length; ++i){
            for(int j=1; j < chars.length; ++j){
                if (chars[i] == chars[j])
                    count[i][j] =  + 2;
                else{
                    count[i][j] = Math.max(count[i-1][j], count[i][j-1]);
                }
            }
        }
        return count[chars.length-1][chars.length-1];
    }

    public static void main(String[] args){
        String str = "AMALAYALAM";
        System.out.println(recLongestPalindromicSubstring(str.toCharArray(), 0, str.length()-1));
        System.out.println(dpLongestPalindromicSubstring(str.toCharArray()));
    }
}
