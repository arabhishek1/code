import java.util.*;

/**
 * Created by abhishek.ar on 28/01/17.
 */
public class
PrefixTrie {

    private static StringBuffer next = new StringBuffer();
    private static String[] arr;
    private class Node {
        private final Node[] children = new Node[256];
        private int frequency;
    }

    private Node root;

    public PrefixTrie() {
        root = new Node();
    }

    public void insert(String string){
        if (string == null || string.isEmpty()) {
            return;
        }
        char[] chars = string.toCharArray();
        Node currentNode = root;
        for (char chr : chars) {
            // note how the chr is represented by the index of its ascii code - neat!
            Node currentChild = currentNode.children[chr];
            if (currentChild != null) {
                currentNode = currentChild;
                currentNode.frequency++;
            } else {
                currentChild = new Node();
                currentNode.children[chr] = currentChild;
                currentNode = currentChild;
            }
        }
    }

    public String shortestPrefix(String word){
        char[] chars = word.toCharArray();
        int index =0;
        Node currentNode = root;
        for(char ch : chars){
            currentNode = currentNode.children[ch];
            if (currentNode.frequency ==0){
                return word.substring(0, index+1);
            }
            ++index;
        }
        return "";
    }

    public static void main(String [] args){
        PrefixTrie trie = new PrefixTrie();
        trie.insert("geeksgeeks");
        trie.insert("geeksquiz");
        trie.insert("geeksforgeeks");
        System.out.println(trie.shortestPrefix("geeksgeeks"));
        System.out.println(trie.shortestPrefix("geeksquiz"));
        System.out.println(trie.shortestPrefix("geeksforgeeks"));
    }
}
