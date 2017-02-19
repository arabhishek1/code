package Amazon.FullProblem;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

/**
 * Created by abhishek.ar on 19/02/17.
 */
public class ParenthesisChecker {
    public static boolean parenthesisChecker(char[] chars){
        Stack<Character> stack = new Stack<Character>();
        for(int i=0; i < chars.length; ++i){
            if(chars[i] == '{' ||chars[i] == '(' || chars[i] == '['){
                stack.push(chars[i]);
            } else {
                if (!stack.isEmpty())
                    stack.pop();
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args){
        String brackets= "[()]{}{[()()]()}";
        String brackets1 = "][][";
        System.out.println(parenthesisChecker(brackets.toCharArray()));
    }
}
