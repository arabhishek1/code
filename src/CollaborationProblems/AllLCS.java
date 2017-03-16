package CollaborationProblems;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * Created by abhishek.ar on 02/03/17.
 * <p>
 * 1. Print all longest common sub-sequences in lexicographical order
 * Input : str1 = "abcabcaa", str2 = "acbacba"
 * Output: ababa
 * abaca
 * abcba
 * acaba
 * acaca
 * acbaa
 * acbca
 */

public class AllLCS {

    static int arr[][];

    public static int LCS(char[] str1, char[] str2) {
        for (int i = 1; i <= str1.length; ++i) {
            for (int j = 1; j <= str2.length; ++j) {
                if (str1[i - 1] == str2[j - 1]) {
                    arr[i][j] = arr[i - 1][j - 1] + 1;
                } else {
                    arr[i][j] = Math.max(arr[i - 1][j], arr[i][j - 1]);
                }
            }
        }
        return arr[str1.length][str2.length];
    }

    public static SortedSet<String> LCS(String str1, String str2, int len1, int len2) {
        if (len1 == 0 || len2 == 0) {
            SortedSet<String> SortedSet = new TreeSet<String>();
            SortedSet.add("");
            return SortedSet;
        }
        if (str1.charAt(len1 - 1) == str2.charAt(len2 - 1)) {
            SortedSet<String> SortedSet = LCS(str1, str2, len1 - 1, len2 - 1);
            SortedSet<String> SortedSet1 = new TreeSet<String>();
            for (String temp : SortedSet) {
                SortedSet1.add(temp + str1.charAt(len1 - 1));
            }
            return SortedSet1;
        } else {
            SortedSet<String> SortedSet = new TreeSet<String>();
            SortedSet<String> SortedSet1 = new TreeSet<String>();
            if (arr[len1 - 1][len2] >= arr[len1][len2 - 1]) {
                SortedSet = LCS(str1, str2, len1 - 1, len2);
            }
            if (arr[len1][len2 - 1] >= arr[len1 - 1][len2]) {
                SortedSet1 = LCS(str1, str2, len1, len2 - 1);
            }
            for (String str : SortedSet1) {
                SortedSet.add(str);
            }
            return SortedSet;
        }
    }

    public static void main(String[] args) {
        String string1 = "abcabcaa";
        String string2 = "acbacba";
        arr = new int[string1.length() + 1][string2.length() + 1];
        System.out.println(LCS(string1.toCharArray(), string2.toCharArray()));
        SortedSet<String> set = LCS(string1, string2, string1.length(), string2.length());
        for (String str : set) {
            System.out.println(str);
        }
    }
}
