import java.util.Scanner;
class Main
{
	public static int fab_r(int n)
	{
		if(n<=0)
			return 0;
		else if(n==1||n==2)
			return 1;
		else	
		{
			return(fab_r(n-1)+fab_r(n-2));
		}
	}
	public static int fab_nr(int n)
	{
		int a=1,b=1,c=n-2,ans=0;
		if(n<=0)
			ans=0;
		else if(n==1||n==2)
			ans=1;
		else
		{
			while(c>0)
			{
				c--;
				ans=a+b;
				a=b;
				b=ans;
			}
			
		}
		return ans;
	}
	public static void main(String []args)
	{
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter nth term you want to print: ");
		n=sc.nextInt();
		System.out.println("Nth term using recussive method: "+fab_r(n));
		System.out.println("Nth term using non-recussive method: "+fab_nr(n));
	}
}