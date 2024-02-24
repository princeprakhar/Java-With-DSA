package array;
import java.util.*;
public class minmax_array
{
	public static class MinMax
	{	int min,max;	}
	static Scanner sc = new Scanner(System.in);
	public MinMax check(int a[],int n)
	{	
		MinMax m = new MinMax();
		m.min=a[0];
		m.max=a[0];
		for(int i=1;i<n-1;i++)
		{
			if(a[i]<=m.min){
				m.min=a[i];
				}
			if(a[i]>=m.max){
			m.max=a[i];	}
		}
		return m;
	}	
	public static void main(String []args)
	{
		int n;
		System.out.print("Enter the size of array: ");
		n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the element of array: ");
		for(int i=0;i<n;i++)
		{	
			a[i]=sc.nextInt();
		}
		minmax_array q =new minmax_array();
		MinMax m1=new MinMax();
		m1 = q.check(a,n);
		System.out.println("Minimum: "+m1.min+"\nMaximum: "+m1.max);
		
	}
}
		

