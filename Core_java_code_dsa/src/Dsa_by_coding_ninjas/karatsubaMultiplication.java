package Dsa_by_coding_ninjas;
import java.util.Scanner;
import java.math.BigInteger;
import java.time.*;
import java.util.Calendar;
abstract class calendar1 extends Calendar{

}

public class karatsubaMatrixMultiplication  {
    public static String appendZero(String s,int m)
    {
        while(m-->0){
            s="0"+s;
        }
        return s;
    }
    public static String Karatsuba_multiplication(String s1,String s2){

        if(s1.length()==1 && s2.length()==1){
            int x=(int)(s1.charAt(0)-'0');
            int y=(int)(s2.charAt(0)-'0');
            return Integer.toString(x*y);
        }
        int n=s1.length();
        int m=s2.length();
        if(n>m){
            s2=appendZero(s2,n-m);
            m=n;
        }
        else if(m>n){
            s1=appendZero(s1,m-n);
            n=m;
        }
        else {
            if(n%2!=0)
            {
                s1="0"+s1;
                s2="0"+s2;
                n++;
                m++;
            }
        }
//        System.out.println(s1+" "+s2);
        String a= s1.substring(0,n/2);
        String b= s1.substring(n/2,n);
        String c= s2.substring(0,m/2);
        String d= s2.substring(m/2,m);
        String p=Karatsuba_multiplication(a,c);
        String q=Karatsuba_multiplication(b,d);
//        System.out.println(a+" "+b+" "+c+" "+d);
        BigInteger e=new BigInteger(a);
        BigInteger f=new BigInteger(b);
        BigInteger g=new BigInteger(c);
        BigInteger h=new BigInteger(d);
        String r=Karatsuba_multiplication(e.add(f).toString(),g.add(h).toString());
//        System.out.println(e+" "+f+" "+g+" "+h);
        return "";
//        BigInteger pb=new BigInteger(p);
//        BigInteger qb=new BigInteger(q);
//        BigInteger rb= new BigInteger(r);
//        String temp2=Double.toString(Math.pow(10,n));
//        BigInteger b4=new BigInteger(temp2);
//        BigInteger res2=pb.multiply(b4);
//        BigInteger res3=pb.subtract(qb);
//        BigInteger res4=res3.subtract(rb);
//        String temp3=Double.toString(Math.pow(10,n/2));
//        BigInteger b5=new BigInteger(temp3);
//        BigInteger res5=res4.multiply(b5);
//        return res2.add(res5).add(rb).toString();

    }
    public static void main(String []args)
    {
       BigInteger s1= new BigInteger("234");
       BigInteger s2= new BigInteger("256753");
       System.out.println(Karatsuba_multiplication("67","4"));
    }
}
