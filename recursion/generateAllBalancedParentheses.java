package recursion;

import java.util.Scanner;

public class generateAllBalancedParentheses {
    public static void generateString(int n, int ctOp, int ctCl,StringBuilder temp)
    {
        if(ctCl==0 && ctOp==0)
        {
            System.out.println(temp);
            return;
        }
        if(ctOp>0)
        {
            temp.append('(');
            generateString(n,ctOp-1,ctCl,temp);
            temp.deleteCharAt(temp.length()-1);
        }
        if(ctOp<ctCl){
            temp.append(')');
            generateString(n,ctOp,ctCl-1,temp);
            temp.deleteCharAt(temp.length()-1);
        }
    }
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the string of parentheses you want to generate: ");
        int n = sc.nextInt();
        System.out.println("The valid possible String are: ");
        generateString(n,n,n,new StringBuilder());
    }
}
