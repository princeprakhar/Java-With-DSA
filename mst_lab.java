import java.util.Scanner;
class ms
{	
	private static int n=3;
	private static int c[][]=new int[n][n];
	public static void display(int a[][])
	{
		for(int i=0;i<n;i++)
		{
			System.out.print("[ " );
			for(int j=0;j<n;j++)
			{	
				System.out.print(a[i][j]+"\t");
			}
			System.out.println("]");
		}
	}
	public static void add(int a[][],int b[][])
	{
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{	
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		System.out.println("ADDED MATRIX IS: ");
		display(c);
	}

	public static void trans()
	{	
		for(int i=0;i<n;i++)
		{
			for (int j=0;j<n;j++)
			{
				int x=c[i][j];
				c[i][j]=c[j][i];
				c[j][i]=x;
			}
			
		}
		System.out.println("TRANSPOSE MATRIX IS: ");
		display(c);
	}
	public static void main(String []args)
	{	
		Scanner sc=new Scanner(System.in);
		int a[][]=new int[n][n],b[][]=new int[n][n];
		System.out.println("Enter the element of first matrix :");
		for(int i=0;i<n;i++)
		{
			for( int j=0;j<n;j++)
			{	
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter the element of second matrix :");
		for(int i=0;i<n;i++)
		{
			for( int j=0;j<n;j++)
			{	
				b[i][j]=sc.nextInt();
			}
		}
		System.out.println("FIRST MATRIX: ");
		display(a);
		System.out.println("SECOND MATRIX: ");
		display(b);
		add(a,b);
		trans();
	}
}
