//the program implement sorting the stack using recursion .

package recursion;

import java.util.ListIterator;
import java.util.Scanner;
import java.util.Stack;

public class sortStackUsingRecursion {
    //main method
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of element you want in stack: ");
        int n = sc.nextInt();
        Stack<Integer> st = new Stack<Integer>();
        System.out.println("Enter the element of stack: ");
        for(int i=0;i<n;i++)
        {
            int x=sc.nextInt();
            st.push(x);
        }
//        sortStack(st); //call sort function to sort the stack.
//        System.out.println("Sorted stack is as follow: ");
        int k= n%2==0 ? n/2-1:n/2;
        deleteMiddle(st,k);
        System.out.println("stack after the deletion of middle element");
        reverseStack(st);
        printStack(st);

    }
    //creating a sortStack method which sort the stack
    private static void sortStack(Stack<Integer> st) {
        if(st.isEmpty())
        {
            return ;
        }
        int temp =st.pop();
        sortStack(st);
        insertElement(st,temp);

    }
    // creating a insertElement method which will help to insert the element at the top of required position
    private static void insertElement(Stack<Integer> st, int temp) {
        if(st.isEmpty() || st.peek() <= temp)
        {
            st.push(temp);
            return;
        }
        int val = st.pop();
        insertElement(st,temp);
        st.push(val);
    }


    //creating a deleteMiddle method which will delete element from the stack.
    public static void deleteMiddle(Stack<Integer> s, int k)
    {
        if (k == 0)
        {
            s.pop();
            return ;
        }
        int temp = s.pop();
        deleteMiddle(s, k-1);
        s.push(temp);
    }
    //creatingn a method which reverse a stack.
    public static void reverseStack(Stack<Integer>s)
    {
        if(s.size()==0)
        {
            return ;
        }
        int temp=s.pop();
        reverseStack(s);
        insertElementForReverse(s, temp);
//        s.push(temp);
    }

    //creating a inertElementForReverse method which will take two argument stack s and element e.
    private static void insertElementForReverse(Stack<Integer> s, int temp) {
        if(s.isEmpty())
        {
            s.push(temp);
            return;
        }
        int val = s.pop();
        insertElementForReverse(s,temp);
        s.push(val);
        return;
    }

    //creating a printStack method which will print the item in stack
    static void printStack(Stack<Integer> s)
    {
        ListIterator<Integer> lt = s.listIterator();

        // forwarding
        while (lt.hasNext())
            lt.next();

        // printing from top to bottom
        while (lt.hasPrevious())
            System.out.print(lt.previous() + " ");
    }
}
