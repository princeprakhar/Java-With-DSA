import java.util.Scanner;
public class Main {
    public static int solve(String a,String b, String c,int i,int j,int k)
    {
        if(i==0 ||j==0||k==0)
            return 0;
        if(a.charAt(i-1)==b.charAt(j-1) && b.charAt(j-1)== c.charAt(k-1))
        {
            return (1+solve(a,b,c,i-1,j-1,k-1));
        }
        int x=solve(a,b,c,i-1,j,k);
        int y=solve(a,b,c,i,j-1,k);
        int z=solve(a,b,c,i,j,k-1);
        if(x>=y)
        {
            return Math.max(z,x);
        }
        return Math.max(y,z);
    }
  
    public static void main(String[] args) {
//        Scanner sc= new Scanner(System.in);
//       int n;
//       n=sc.nextInt();
//       int a[]=new int[n];
//       for(int i=0;i<n;i++)
//       {
//           a[i]=sc.nextInt();
//       }
//
//        int b=sc.nextInt();
//        int x=a[0],ans=0;
//       for(int i=1;i<=b;i++)
//       {
//           int curr_profit=a[i]-x;
//           ans=Math.max(curr_profit,ans);
//           x=Math.min(x,a[i]);
//       }
//        System.out.println(ans);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }

    }
}