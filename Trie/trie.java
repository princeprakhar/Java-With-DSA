package Trie;

public class trie {
    private Node root;
    public trie(){
        root = new Node();

    }
    public void insert(String word)
    {
        Node node = root;
        for(int i=0;i<word.length();i++)
        {

        }
    }

}
class Node {
    Node []alphabet;//Initialization for map for character all possible alphabets.(Assuming all the character are small case.
    boolean endOfWord;//flag which will indicate for the end for the words.
    //constructor
    public Node()
    {
        alphabet = new Node[26];
        endOfWord = false;
    }
    public void put(char ch, Node node)
    {
         alphabet[ch - 'a'] = node;

    }
    public Node getNode(char ch)
    {
        return alphabet[ch - 'a'];
    }
}
