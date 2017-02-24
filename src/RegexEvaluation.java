/**
 * Created by abhishek.ar on 20/02/17.
 */
public class RegexEvaluation {
    public static boolean isRegexValid(char[] regex, char[] word){
        for(int i=0, j=0; i<regex.length && j < word.length; ++i,++j){
            if(regex[i] == '*'){
                if(i > 0){
                    while(regex[i-1] == word[j] && j <word.length-1){
                        ++j;
                    }
                    ++i;
                }
            }
            if (regex[i] == '.'){
                if ((regex.length-i) != (word.length-j))
                    return false;
                else {
                    ++i;++j;
                }
            }

            if (regex[i] != '*' && regex[i] != '.' && regex[i] != word[j]){
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args){
        String regex = "a*b..c*";
        String word = "abijc";
        System.out.println(isRegexValid(regex.toCharArray(), word.toCharArray()));
    }
}
