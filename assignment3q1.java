/*1. Write a program that accepts the marks of a student into
an array from the keyboard and finds total marks and percentage.
2. Write a program in java to illustrate divide by zero exception in 
java, Briefly Describe the primary advantages of exception 
handling in java.
3. Discuss about utility class in java. What are the most commonly 
used utility classes in java?
4. Differentiate b/w following:
a) abstraction and encapsulation 
b) this vs. super keyword*/
import java.util.*;
class ques1
{
	public static void main(String []args)
	{
		Scanner sc= new Scanner(System.in);
		int n;
		System.out.println("Enter the number of subject of student: ");
		n=sc.nextInt();
		float a[]=new float[n];
		float avg=0,sum=0;
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();	
			sum=sum+a[i];	
		}
		avg=sum/n;
		System.out.println("AVGERAGE MARKS OF STUDENT IS: "+avg);
	}
}	
class ques2
{
	public static void main(String []args)
	{
		Scanner sc= new Scanner(System.in);
		float x,y;
		System.out.println("Enter the dividend: ");
		x=sc.nextFloat();
		System.out.println("Enter the divisor: ");
		y=sc.nextFloat();
		try
		{
			if(y==0)
			{	
				throw new ArithmeticException("DIVISION IS NOT POSSIBLE!");
			}
			else
			System.out.println("DIVISION OF X AND Y IS: "+(x/y));
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception: "+e.getMessage());
		}
		finally
		{	
			System.out.println("Program executed suceesfully!");
		}
	}
}	
