/**
 * Created by abhishek.ar on 06/02/17.
 */
//Given two strings str1 and str2, write a function that prints all interleavings of the given two strings.
//        You may assume that all characters in both strings are different
//
//        Example:
//
//        Input: str1 = "AB",  str2 = "CD"
//        Output:
//        ABCD
//        ACBD
//        ACDB
//        CABD
//        CADB
//        CDAB
//
//        Input: str1 = "AB",  str2 = "C"
//        Output:
//        ABC
//        ACB
//        CAB
//        An interleaved string of given two strings preserves the order of characters in individual strings.
//        For example, in all the interleavings of above first example, ‘A’ comes before ‘B’ and ‘C’ comes before ‘D’.
//

//
//Let the length of str1 be m and the length of str2 be n. Let us assume that all characters in str1 and str2 are different.
// Let count(m, n) be the count of all interleaved strings in such strings.
// The value of count(m, n) can be written as following.
//
//        count(m, n) = count(m-1, n) + count(m, n-1)
//        count(1, 0) = 1 and count(0, 1) = 1
//
//        To print all interleavings, we can first fix the first character of str1[0..m-1] in output string,
//        and recursively call for str1[1..m-1] and str2[0..n-1].
//        And then we can fix the first character of str2[0..n-1] and recursively call for str1[0..m-1] and str2[1..n-1].
public class InterLeavingString {

    public static void printInterLeavings(char[] str1, char[] str2, char[] result, int str1Start, int str1end, int str2Start, int str2End, int i) {
        if (str1end == 0 && str2End == 0) {
            System.out.println(new String(result));
        }

        if (str1end != 0) {
            result[i] = str1[str1Start];
            printInterLeavings(str1, str2, result, str1Start + 1, str1end - 1, str2Start, str2End, i + 1);
        }

        if (str2End != 0) {
            result[i] = str2[str2Start];
            printInterLeavings(str1, str2, result, str1Start, str1end, str2Start + 1, str2End - 1, i + 1);
        }
    }

    public static void main(String[] args) {
        String str1 = "AB", str2 = "CD";
        char[] result = new char[str1.length() + str2.length()];
        printInterLeavings(str1.toCharArray(), str2.toCharArray(), result, 0, str1.length(), 0, str2.length(), 0);
    }
}
