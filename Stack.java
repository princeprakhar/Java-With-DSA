import java.util.*;
public class Stack
{
	static Scanner sc = new Scanner(System.in);
	public static int n;
	public int push(int []a,int t)
	{
		if(t == Stack.n-1)
			System.out.println("Stack is Full");
		else
			System.out.println("Enter the item: "+Stack.n);
			t++;
			a[t]=sc.nextInt();
			return t;
	}
	public int pop(int []a,int t) 
	{	
		if(t == -1)
			System.out.println("Stack is empty");
		else{
			System.out.println("Item deleted"+a[t--]);
		}
		return t;
	}
	public void display(int []a,int t)
	{
		if(t == -1)
			System.out.println("Nothing in the Stack");
		else{
			for(int i=0;i<t;i++)
				System.out.print(a[i]);
		}
	}
	public static void main(String []args)
	{
		Stack s = new Stack();
		System.out.println("Enter the size of the stack: ");
		n=sc.nextInt();
		int a[]=new int[n],top = -1,x,y;
		do
		{
			System.out.println("Enter the operation you want to perform: \nFor push Enter 1,For pop Enter 2 and for top Enter the 3: ");
			x=sc.nextInt();
			switch(x)
			{	
				case 1: top=s.push(a,top);
					break;
				case 2: top=s.pop(a,top);
					break;
				case 3: s.display(a,top);
					break;
				default: System.out.println("INVALID INPUT");
				
			}
			System.out.println("TO CONTINUE ENTER 1 ELSE ENTER 0: ");
			y=sc.nextInt();
			
		}while(y!=0);
	}
}
	
		 
		
	


