import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

/**
 * Created by abhishek.ar on 04/02/17.
 */
//Given two words (start and end), and a dictionary, find the length of shortest transformation sequence from start to end,
//        such that only one letter can be changed at a time and each intermediate word must exist in the dictionary.
//        For example, given:
//
//        start = "hit"
//        end = "cog"
//        dict = ["hot","dot","dog","lot","log"]
//        One shortest transformation is "hit" -> "hot" -> "dot" -> "dog" -> "cog", the program should return its length 5.

class WordNode{
    String word;
    WordNode parent;
    int numSteps;

    public WordNode(String word, WordNode parent, int numSteps) {
        this.word = word;
        this.parent = parent;
        this.numSteps = numSteps;
    }
}



public class WordLadder {

    public static int getSteps(Set<String> words, String start, String end){
        Queue<WordNode> queue = new LinkedList<WordNode>();
        queue.add(new WordNode(start, null, 1));
        words.add(end);
        while (!queue.isEmpty()){
            WordNode topWord = queue.poll();
            if(topWord.word.equalsIgnoreCase(end)){
                String result = topWord.word;
                int stepCount = topWord.numSteps;

                while (topWord.parent != null) {
                    result = topWord.parent.word + "->" + result;
                    topWord = topWord.parent;
                }

                System.out.println(result);
                return stepCount;
            }


            for(int i=0; i < topWord.word.length();++i){
                for(char ch='a'; ch <='z';++ch){
                    String newWord = topWord.word.replace(topWord.word.charAt(i), ch);
                    if(words.contains(newWord)){
                        queue.add(new WordNode(newWord, topWord, topWord.numSteps+1));
                        words.remove(newWord);
                    }
                }
            }
        }
        return -1;
    }

    public static void main(String[] args){
        String beginWord = "hit";
        String endWord = "cog";

        Set<String> dictionary = new HashSet<String>() {{
            add("hot");
            add("dot");
            add("lot");
            add("log");
        }};

        System.out.println(getSteps(dictionary, beginWord, endWord));
    }
}
