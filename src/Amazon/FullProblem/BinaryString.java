package Amazon.FullProblem;

/**
 * Created by abhishek.ar on 18/02/17.
 */
//Given a binary string, count number of substrings that start and end with 1.
// For example, if the input string is “00100101”, then there are three substrings “1001”, “100101” and “101”
public class BinaryString {
    public static int bruteForce(char[] chars){
        int count =0;
        for(int i=0; i < chars.length; ++i){
            if(chars[i] =='1'){
                for (int j=i+1; j < chars.length; ++j){
                    if (chars[j]== '1')
                        ++count;
                }
            }
        }
        return count;
    }
    //Reason : We only need to know how many distinct sets can be formed
    public static int efficient(char[] chars){
        int count =0;
        for (int i=0; i < chars.length; ++i){
            if (chars[i] =='1')
                ++count;
        }
        return (count*(count-1))/2;
    }
    public static void main(String[] args){
        String str = "000101001000001";
        System.out.println(bruteForce(str.toCharArray()));
        System.out.println(efficient(str.toCharArray()));
    }
}
