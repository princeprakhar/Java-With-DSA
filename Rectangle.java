 import java.util.*;
class Rectangle
{
	double l,w,Area;
	String colour;
	public static Scanner sc = new Scanner(System.in);
	public void set_length()
	{  	l=sc.nextDouble(); 	}
	public void set_width()
	{  	w=sc.nextDouble(); 	}
	public void set_colour(String a)
	{  	colour=a;	}
	public String getColor()
	{	return colour;	}
	public void find_area()
	{	Area=l*w;	}
	public double getArea()
	{	return Area;	}
	public static void main(String []args)
	{	
		Rectangle r1 = new Rectangle();
		r1.set_length();
		r1.set_width();
		r1.set_colour("RED");
		r1.find_area();
		r1.getArea();
		r1.getColor();
		Rectangle r2 = new Rectangle();
		r2.set_length();
		r2.set_width();
		r2.set_colour("RED");
		r2.find_area();
		r2.getArea();
		r2.getColor();    							if(r1.getColor()==r2.getColor()&&r1.getArea()==r2.getArea()){
			System.out.println("Matching Rectangle");}
	else{
			System.out.println("Not matching rectangle");}


	}		
}
	

	
