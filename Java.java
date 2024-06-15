import java.util.*;
import java.io.*;
//explicit throw
/*class throws_checked_exception
{
	public static void main(String []args) //throws	//IOException
	{
		Scanner sc=new Scanner(System.in);	
		throw new IOException();	
	}
}*/
//Thread using runnable interface
/*class A implements Runnable
{
	public void run()
	{
		for(int i=0;i<=10;i++)	
		{
			System.out.println("Thread A"+i);
		}
	}
}
class B implements Runnable
{
	public void run()
	{
		for(int i=0;i<=10;i++)	
		{
			System.out.println("Thread B"+i);
		}
	}
}

class thread
{
	public static void main(String args[])
	{
		Thread t1=new Thread(new A());
		Thread t2=new Thread(new B());
		setPriority(t1);
		t1.start();
		t2.start();
		
	}
}*/
//Thread using Thread class
class A extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Thread A "+i);
		}
	}
}
class thread1
{
	public static void main(String []args)	
	{
		A t=new A();
		t.start();
	}
}