import java.util.*;
interface student
{
	void display_Grade();
	void display_attend();
}
class pgStudent implements student
{
	String name,grade;
	int m1,m2,m3,attendance,total;
	pgStudent(String name, int m1, int m2 , int m3, int attendance)
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
class ugStudent implements student
{
	String name,grade;
	int m1,m2,m3,attendance,total;
	ugStudent(String name, int m1, int m2 , int m3, int attendance)
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
class main5
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
		catch(Exception e)
		{
			System.out.println("Exception: "+e.getMessage());
		}	
		pgStudent s1=new pgStudent("Prakhar deep",a[0],a[1],a[2],100);
		s1.display();
		s1.display_attend();
		s1.display_Grade();
		ugStudent s2=new ugStudent("Prince",99,100,99,100);
		s2.display();
		s2.display_attend();
		s2.display_Grade();
	}
}

	