package recursion;

/**
 * Created by abhishek.ar on 24/02/17.
 *
 *
 * LCS Problem Statement: Given two sequences, find the length of longest subsequence present in both of them.
 * A subsequence is a sequence that appears in the same relative order,
 * but not necessarily contiguous. For example, “abc”, “abg”, “bdf”, “aeg”, ‘”acefg”, .. etc are
 * subsequences of “abcdefg”. So a string of length n has 2^n different possible subsequences.*/

public class LonegestCommonSubsequence {
    public static int longestCommonSubsequence(char[] str1, char[] str2, int str1End, int str2End){
        if (str1End == 0 || str2End == 0)
            return 0;
        if (str1[str1End-1] == str2[str2End-1]){
            return 1 + longestCommonSubsequence(str1, str2, str1End-1, str2End-1);
        } else{
            return Math.max(longestCommonSubsequence(str1, str2, str1End-1, str2End) ,
                    longestCommonSubsequence(str1, str2, str1End, str2End-1));
        }
    }

    public static int LCSDP(String str1, String str2){
        int [][] arr = new int[str1.length()+1][str2.length()+1];
        for (int i=0; i <= str1.length() ; ++i){
            for(int j =0 ; j <= str2.length(); ++j){
                if (i ==0 || j ==0)
                    arr[i][j] =0;
                else if (str1.charAt(i-1) == str2.charAt(j-1)){
                    arr[i][j] = 1 + arr[i-1][j-1];
                } else {
                    arr[i][j] = Math.max(arr[i-1][j], arr[i][j-1]);
                }
            }
        }
        return arr[str1.length()][str2.length()];
    }

    public static void main(String[] args){
        String str1="AGGTAB";
        String str2 = "GXTXAYB";
        System.out.println(longestCommonSubsequence(str1.toCharArray(), str2.toCharArray(), str1.length(), str2.length()));
        System.out.println(LCSDP(str1, str2));
    }
}
