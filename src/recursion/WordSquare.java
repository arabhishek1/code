package recursion;

/**
 * Created by abhishek.ar on 16/03/17.
 *
 * A word square is a special type of acrostic. It consists of a set of words written out in a square grid,
 * such that the same words can be read both horizontally and vertically. The number of words,
 * which is equal to the number of letters in each word, is known as the "order" of the square.
 * For example, this is an order 5 square:

 H E A R T
 E M B E R
 A B U S E
 R E S I N
 T R E N D

 */
public class    WordSquare {

    public static boolean wordSqaure(String [] words, int start, int end){
        if (start > end)
            return false;
        if (start == end)
            return true;
        for(int i=words[start].length()-1; i >start ; --i){
            if (words[start].charAt(i) != words[i].charAt(start)){
                return false;
            }
        }
        return wordSqaure(words, start+1, end);
    }

    public static void main(String[] args){
        String [] words = { "HEART", "EMBER", "ABUSE", "RESIN", "TREND"};
        System.out.println(wordSqaure(words, 0, words.length));
    }
}
