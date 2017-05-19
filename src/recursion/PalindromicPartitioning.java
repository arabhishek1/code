package recursion;

/**
 * Created by abhishek.ar on 14/05/17.
 *
 * Given a string, a partitioning of the string is a palindrome partitioning if every substring of the partition
 * is a palindrome. For example, “aba|b|bbabb|a|b|aba” is a palindrome partitioning of “ababbbabbababa”. Determine
 * the fewest cuts needed for palindrome partitioning of a given string. For example, minimum 3 cuts are needed
 * for “ababbbabbababa”. The three cuts are “a|babbbab|b|ababa”. If a string is palindrome, then minimum 0 cuts are
 * needed. If a string of length n containing all different characters, then minimum n-1 cuts are needed.
 *
 * http://www.geeksforgeeks.org/dynamic-programming-set-17-palindrome-partitioning/
 * */
public class PalindromicPartitioning {

    public static boolean isPalindrome(char[] str, int start, int end){
        for(int i=start, j = end; i <j; ++i,--j){
            if( str[i] != str[j])
                return false;
        }
        return true;
    }
    public static int palindromicPartionting(char[] str, int start, int end){
        if (isPalindrome(str, start, end-1) || start > end){
            return 0;
        } else {
            return 1+ Math.min(palindromicPartionting(str, start, end-1),
                    palindromicPartionting(str, start+1, end));
        }
    }

    public static void main(String[] args){
        String str = "ababbbabbababa";
        System.out.println(palindromicPartionting(str.toCharArray(), 0, str.length()));
    }
}
