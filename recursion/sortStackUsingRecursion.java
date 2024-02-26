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
        sortStack(st);
        System.out.println("Sorted stack is as follow: ");
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
