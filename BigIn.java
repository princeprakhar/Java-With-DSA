import java.math.BigInteger;
import java.util.Scanner;
public class BigIn
{
    // public static void karatsuba(BigInteger b1, BigInteger b2)
    // {
        
    // }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number: ");
        String s1=sc.next();
        System.out.println("Enter the Secinf number: ");
        String s2=sc.next();
        int n1,n2;
        n1=s1.length();
        n2=s2.length();
        if(n1%2!=0)
        {
            s1="0"+s1;
        }
        if(n2%2!=0)
        {
            s2="0"+s2;
        }
        while(s1.length()!=s2.length())
        {
            if(s1.length()>s2.length())
            {
                s2="00"+s2;
            }
            else{
                s1="00"+s1;
            }
        }
        BigInteger b1=new BigInteger(s1);
        BigInteger b2=new BigInteger(s2);
        System.out.println(b1);
        System.out.println(b2);
        sc.closed();
    }
}