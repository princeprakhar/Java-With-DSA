package Trie;

public class trie {
    private  Node root;
    public trie(){
        root = new Node();
    }
    //defining the insertion for the String in Trie.
    public void insert(String word)
    {
        Node node = root;
        for(int i=0;i<word.length();i++)
        {
            if(!node.containsKey(word.charAt(i)))
            {
                node.put(word.charAt(i),new Node());
            }
            node.getNode(word.charAt(i))
        }
        node.endOfWord = true;
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
    //contains method
    boolean containsKey(char ch)
    {
        return (!(alphabet[ch - 'a'] == null));
    }
    //defining the put method
    public void put(char ch, Node node)
    {
         alphabet[ch - 'a'] = node;

    }
    //defining the get method for the node.
    public Node getNode(char ch)
    {
        return alphabet[ch - 'a'];
    }
}
