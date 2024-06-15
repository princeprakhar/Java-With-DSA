import java.util.*;
public class matrixOperation
{  
    static void display(int a[][],int r,int c)
    {
      for(int i=0;i<r;i++)                     
      {
         for(int j=0;j<c;j++)
         System.out.print(a[i][j]+"   ");
         System.out.println();
      }
    }
    static void sum(int a[][],int b[][],int r,int c1)
    {  
       int c[][]=new int[r][c1];
       for(int i=0;i<r;i++)                     
       {                                                                                                                                                              
         for(int j=0;j<c1;j++)
         c[i][j]=a[i][j]+b[i][j];
       }
       display(c,r,c1);
    }
    static void diff(int a[][],int b[][],int r,int c1)
    {  
       int c[][]=new int[r][c1];
       for(int i=0;i<r;i++)                     
       {
         for(int j=0;j<c1;j++)
         c[i][j]=a[i][j]-b[i][j];
       }
       display(c,r,c1);
    }
    static void pod(int a[][],int b[][],int r,int c1)
    {  
       int c[][]=new int[r][c1];
       for(int i=0;i<r;i++)                     
       {
         for(int j=0;j<c1;j++)
         {
           for(int k=0;k<2;k++)
           c[i][j]=c[i][j]+a[i][k]*b[k][j];
          }  
       }
       display(c,r,c1);
    }
    public static void main(String [] args)
    {
      int a[][]=new int[3][2],b[][]=new int[2][3],c[][]=new int[3][3];
      Scanner sc=new Scanner(System.in);
      System.out.println("ENTER THE FIRST MATRIX: ");  
      for(int i=0;i<3;i++)                     
      {
         for(int j=0;j<2;j++)
         a[i][j]=sc.nextInt();
      }
      System.out.println("ENTER THE SECOND MATRIX: ");
      for(int i=0;i<2;i++)                     
      {
         for(int j=0;j<3;j++)
         b[i][j]=sc.nextInt();
      }
     // System.out.println("ADDED MATRIX: ");
      //sum(a,b,2,3);
      //System.out.println("SUBRACTED MATRIX: ");
      //diff(a,b,2,3);
      //System.out.println("FOR MULTIPLICATION ENTER THE SECOND MATRIX OF 3*3: ");
      //for(int i=0;i<3;i++)                     
      //{
        // for(int j=0;j<3;j++)
         //c[i][j]=sc.nextInt();
      //}
   
   System.out.println("MULTIPLICATED MATRIX: ");
      pod(a,b,3,3);
      
    }
}