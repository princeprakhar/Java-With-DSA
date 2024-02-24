import java.util.*;
public class operationOnTwoNumber
{
	public static void main(String []args)
	{
		int a,b;
		char X;
		Scanner sc=new Scanner(System.in);
           System.out.println("Enter the first number: ");
		a=sc.nextInt();
            System.out.println("Enter the second number: ");
		b=sc.nextInt();
		System.out.println("For performing addition enter A: \nFor performing subtraction enter S: \nFor performing multiplication enter M: \nFor performing division enter D: ");
           X=sc.next().charAt(0);
		switch(X)
			{
				case 'A':System.out.println("Sum is:  "+(a+b));break;
				case 'S':System.out.println("Difference is: "+(a-b));break;
				case 'M':System.out.println("Product is: "+a*b);break;				case 'D':System.out.println("Division is: "+a/b);break;
				default:System.out.println("INVALID INPUT!");
			}
		}
}