import java.util.*;
public class Assignment1_q1
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int a[],n,s=0,pc;
		System.out.println("Enter the number of Subject of  student: ");
		n=sc.nextInt();
		a=new int[n];
		System.out.println("Enter the marks of student out of 100: ");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			s=s+a[i];
		}
		pc=(s/n);
		System.out.println("Total marks: "+s);
		System.out.println("Percentage of student: "+pc+"%");
	}
}
