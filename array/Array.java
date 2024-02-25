package array;

import java.util.ArrayList;
import java.util.Scanner;
public class Array{




    public static void tower_hanoi(int n,String a,String b,String c)
    {
        if(n==1){
            System.out.println(n+"th Move from "+a+" to "+c);
            return ;
        }
        tower_hanoi(n-1,a,c,b);
        System.out.println(n+"th Move from "+a+" to "+c);
        tower_hanoi(n-1,b,a,c);
    }
    public static long kadane_al(int []A,int n)//kadane algorithm to find maximum sum of subarray of array A
    {
        long curr_sum=0,sum=Integer.MIN_VALUE;
        int i;
        for(i=0;i<n;i++){
            curr_sum+=A[i];

            if(curr_sum<0)
            {
                curr_sum=0;
            }
            sum=Math.max(curr_sum,sum);
        }
        return sum;
    }
    public static long merge_count_array_inversion(int []a,int l,int m, int r)
    {
        int n1=m+1-l;
        int n2=r-m;
        int i;
        long c=0;
        ArrayList<Integer>left= new ArrayList<>();
        ArrayList<Integer>right= new ArrayList<>();
        for(i=0;i<n1;i++)
        {
            left.add(a[i+l]);
        }
        for(i=0;i<n2;i++)
        {
            right.add(a[i+m+1]);
        }
        i=0;
        int j=0,k=l;
        while(i<n1 && j< n2)
        {
            if(left.get(i)<=right.get(j))
            {
                a[k++]=left.get(i);
                i++;
            }
            else {
                a[k++]=right.get(j);
                j++;
                c+=m+1-l-i;
            }
        }
        while(i<n1)
            a[k++]=left.get(i++);
        while(j<n2)
            a[k++]=right.get(j++);

        left.clear();
        right.clear();
        return c;
    }
    public static long merge_Invension_count(int []a,int l, int r)
    {
        long c=0;
        if(l<r)
        {
            int mid=l+(r-l)/2;
            c+=merge_Invension_count(a,l,mid);
            c+=merge_Invension_count(a,mid+1,r);
            c+=merge_count_array_inversion(a,l,mid,r);
        }
        return c;
    }
    public static void main(String []args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of array.Array: ");
        int n= sc.nextInt();
        int []a=new int[n];
        System.out.println("Enter the element of array: ");
        int i;
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        long invension_count=merge_Invension_count(a,0,n-1);
//        System.out.println("Sorted array.Array :");
//        for(int x:a)
//        {
//            System.out.print(x+" ");
//        }
        System.out.println();
        System.out.println("Total number of array.Array Invension count: "+invension_count);
//        System.out.println("Maximum sum of subarray using Kadane array: "+kadane_al(a,n) );
//        System.out.println("Tower of Hanoi");
//       tower_hanoi(n,"First","Second","Third");

    }
}
