// import static org.junit.jupiter.api.Assertions.assertEquals;
package Java-With-DSA.binarySearchTree;
// import org.junit.jupiter.api.Test;
class Node{

    int val ;
    Node left;
    Node right;
    public Node(int val)
    {
        this.val = val;
        this.left=null;
        this.right=null;
    }


    void insert(int val) {
        if (val < this.val) {
            if (left == null) {
                left = new Node(val);
            } else {
                left.insert(val);
            }
        } else {
            if (right == null) {
                right = new Node(val);
            } else {
                right.insert(val);
            }
        }
    }
    Node findMinNode(Node node) {
        Node current = node;
        while (current.left != null) {
            current = current.left;
        }
        return current;
    }


    Node delete(Node root, int val) {
        // Your existing deleteRec logic here
        root = deleteRec(root, val);
        return root;
    }

    Node deleteRec(Node root, int val) {
        if (root == null) return root;
        if (val < root.val) {
            root.left = deleteRec(root.left, val);
        } else if (val > root.val) {
            root.right = deleteRec(root.right, val);
        } else {
            if (root.left == null) return root.right;
            else if (root.right == null) return root.left;

            root.val = findMinNode(root.right).val;
            root.right = deleteRec(root.right, root.val);
        }
        return root;
    }


}

public class Main {

    public static void printGraph(Node root, String indent, boolean last) {
        if (root != null) {
            System.out.print(indent);
            if (last) {
                System.out.print("└─");
                indent += "  ";
            } else {
                System.out.print("├─");
                indent += "│ ";
            }
            System.out.println(root.val);
            printGraph(root.left, indent, false);
            printGraph(root.right, indent, true);
        }
    }
    public static int findHeight(Node root)
    {
        if(root== null)
        {
            return 0;
        }
        return (1+Math.max(findHeight(root.left),findHeight(root.right)));
    }
    public static void main(String[] args) {
        Node root = new Node(3);
        int[] nodes = {5, 2, 7, 1, 4, 6, 8, 9, 10};
        for (int val : nodes) {
            root.insert(val);
        }

        printGraph(root, "", true);

        System.out.println(findHeight(root));
    }
    // @Test
    // void addition() {
    //     assertEquals(2, 1 + 1);
    // }
}