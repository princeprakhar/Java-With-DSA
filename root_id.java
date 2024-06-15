import java.util.*;
public class root_id
{
     public double root1(double a1,double  b1,double  c1)
     {
            double x1=(b1*(-1)+Math.pow(b1*b1 - 4*a1*c1,1/2))/(2*a1);
            return x1;
     }
     public double root2(double a1,double  b1,double  c1)
     {
            double x1=((b1)*(-1)-Math.pow(b1*b1 - 4*a1*c1,1/2))/(2*a1);
            return x1;
     }
     public static void main(String [] args)
     {
         Scanner sc=new Scanner(System.in);
         root_id r=new root_id();
         double a,b,c;
         System.out.println("Enter the cofficient of x^2: ");
         a=sc.nextDouble();
         System.out.println("Enter the cofficient of x: ");
         b=sc.nextDouble();
         System.out.println("Enter the constant term: ");
         c=sc.nextDouble();
         //System.out.println(a+"x^2+"+b+"x+"+c);
         if((Math.pow(b,2)-4*a*c)<0)
            System.out.printf("IMIGINARY ROOTS");
         else{
            System.out.printf("REAL ROOTS");  
            System.out.println("Roots are: "+r.root1(a,b,c));
            System.out.println(r.root2(a,b,c));
            
         }   
     }
}
