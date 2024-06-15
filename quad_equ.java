import java.util.*;
public class quad_equ
{
     public static void main(String [] args)
     {
         Scanner sc=new Scanner(System.in);
         double a,b,c;
         System.out.println("Enter the cofficient of x^2: ");
         a=sc.nextDouble();
         System.out.println("Enter the cofficient of x: ");
         b=sc.nextDouble();
         System.out.println("Enter the constant term: ");
         c=sc.nextDouble();
         System.out.println("Enter the value of x in equation ax^2+bx+c: "); 
         double x=sc.nextDouble();
         double sum=a*(Math.pow(x,2))+b*x+c;
         System.out.println("Sum of equation is : "+sum);
       }
    
}