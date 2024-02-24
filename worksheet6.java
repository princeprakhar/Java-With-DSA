import java.util.*;
interface student
{
	void display_Grade();
	void display_attend();
}
class PG_student implements student
{
	String name,grade;
	int m1,m2,m3,attendance,total;
	PG_student(String name,int m1,int m2 ,int m3,int attendance)
	{	
	this.name=name;
	this.m1=m1;
	this.m2=m2;
	this.m3=m3;
	this.attendance=attendance;
	}
	void display()
	{
		System.out.println("Name is: "+name);
		System.out.println("Marks are: "+m1+" "+m2+" "+m3);
	}
	public void display_attend()
	{
		System.out.println("The attendance is: "+attendance);
	}
	public void display_Grade()
	{
		total=m1+m2+m3;
		if(total>=250)
			grade="A";
		else if(total<250 && total>=200)
			grade="B";
		else if(total>=100 && total<200)
			grade="C";
		else
			grade	="D";
		System.out.print("The grade is: "+grade);
	}
}
class UG_student implements student
{
	String name,grade;
	int m1,m2,m3,attendance,total;
	UG_student(String name,int m1,int m2 ,int m3,int attendance)
{	
	this.name=name;
	this.m1=m1;
	this.m2=m2;
	this.m3=m3;
	this.attendance=attendance;
}
void display()
{
	System.out.println("Name is: "+name);
	System.out.println("Marks are: "+m1+" "+m2+" "+m3);
}
public void display_attend()
{
	System.out.println("The attendance is: "+attendance);
}
public void display_Grade()
{
	total=m1+m2+m3;
	if(total>=250)
	grade="A";
	else if(total<250 && total>=200)
	grade="B";
	else if(total>=100 && total<200)
	grade="C";
	else
	grade="D";
	System.out.print("The grade is: "+grade);
}
}	
class Main
{
	public static void main(String []args)
	{
		int n;
		Scanner sc=new Scanner(System.in);
		int []a=new int[3];
		try
		{
			for(int i=0;i<=4;i++)	
				a[i]=sc.nextInt();
		}
		catch(ArrayIndexOutOfBoundsException ex)
		{
			System.out.println("Exception: "+ex.getMessage());
		}	
		PG_student s1=new PG_student("Prakhar deep",a[0],a[1],a[2],100);
		s1.display();
		s1.display_attend();
		s1.display_Grade();
		UG_student s2=new UG_student("Prince",99,100,99,100);
		System.out.println();
		s2.display();
		s2.display_attend();
		s2.display_Grade();
	}
}

	
