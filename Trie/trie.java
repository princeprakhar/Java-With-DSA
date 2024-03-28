package Trie;

import java.util.Scanner;

public class trie {
    private final Node root;
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
            node.getNode(word.charAt(i));
        }
        node.endOfWord = true;
    }
//    defining the search method
    public boolean search(String word){
        Node node = root;
        for(int i=0;i<word.length();i++)
        {
            if(!node.containsKey(word.charAt(i)))
            {
                return false;
            }
        }
        return node.endOfWord;
    }
    //defining the stardWithWord method
    public boolean startWithWord(String word)
    {
        for(int i=0;i<word.length();i++)
        {
            if(!root.containsKey(word.charAt(i)))
            {
                return false;
            }
        }
        return true;
    }
    //main method
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of the String's array" );
        int n = sc.nextInt();
        trie root = new trie();
        String []s= new String[n];
        System.out.println("Enter String for the Array:");
        for(int i=0;i<n;i++)
        {
            s[i] = sc.next();
            root.insert(s[i]);
        }
        System.out.println("Enter the String you want to search:");
        String stringToSearch = sc.next();
        System.out.println(root.search(stringToSearch)?"The String is in the container": "The String is not present in the conatiner");
        System.out.println("Enter the Prefix you want to search:");
        String stringStartWith = sc.next();
        System.out.println(root.startWithWord(stringStartWith)?"The String is in the container has Prefix": "The String with Prefix is not present in the conatiner");



    }

}

class Node {
    Node []alphabet;//Initialization for map for character all possible alphabets.(Assuming all the character are small case).
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
