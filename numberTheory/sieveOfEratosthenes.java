package numberTheory;

import java.util.Arrays;
import java.util.Scanner;

public class sieveOfEratosthenes {
    boolean a[];
    int n;
    sieveOfEratosthenes(int n)
    {
        a=new boolean[n+1];
        this.n= n+1;
        Arrays.fill(this.a,true);
    }
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        final int n = 2_000_000_000;
        System.out.println("Enter the number the range of prime number you want between 2 - 2000000000 : ");
        int low = sc.nextInt();
        int high = sc.nextInt();
        sieveOfEratosthenes ob = new sieveOfEratosthenes(n);
        ob.fillPrimeNumber();
        ob.getPrimeBetweenRange(low,high);

    }
    private void fillPrimeNumber()
    {
        for(int i=2;i*i<n;i++)
        {
            if(a[i])
            {
                for(int j=i*i;j<n;j+=i){
                    a[j]=false;
                }
            }
        }
    }

    private void getPrimeBetweenRange(int low, int high) {
        int r=0;
        for(int i=low;i<=high;i++)
        {
            if(a[i]==true) {
                if(r%9==0)
                {
                    System.out.print("|  ");
                }
                System.out.print(i + " | ");

                r++;
                if(r%9==0)
                {
                    System.out.println();
                }
            }
        }

    }

}
