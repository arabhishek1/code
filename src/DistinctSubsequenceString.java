/**
 * Created by abhishek.ar on 29/01/17.
 */
//Given a string S and a string T, count the number of distinct subsequences of T in S.
// A subsequence of a string is a new string which is formed from the original string by deleting some (can be none)
// of the characters without disturbing the relative positions of the remaining characters. (ie, "ACE" is a subsequence of "ABCDE" while
// "AEC" is not).
public class DistinctSubsequenceString {

    public static int numDistinct(String s, String t){
        int[] [] table = new int[s.length()+1][t.length()+1];
        for(int i=0; i <=s.length(); ++i){
            table[i][0]=1;
        }

        for(int i=1; i <= s.length(); ++i){
            for(int j=1; j <= t.length(); ++j){
                if (s.charAt(i-1) == t.charAt(j-1))
                    table[i][j] = table[i-1][j-1] + table[i-1][j];
                else
                    table[i][j] = table[i-1][j];
            }
        }

        return table[s.length()][t.length()];
    }

    public static void main(String[] args){
        System.out.println(numDistinct("rabbbit", "rabbit"));
    }

}
