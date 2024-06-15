package Dsa_by_coding_ninjas;

import java.util.Arrays;
import java.util.Scanner;

public class randomizedAlgorithm {
    public static void swap(int []a,int l, int r)
    {
        int temp=a[l];
        a[l]=a[r];
        a[r]=temp;
    }
    public static int choosePivot(int []a, int l, int r, int pivotID)
    {
        if(pivotID==3)
        {
            swap(a,l,r);
        }
        else {
            int mid=l+(r-l)/2;
            int []temp={a[l],a[r],a[mid]};
            Arrays.sort(temp);
            int x=temp[1];
            if(x==a[l])
            {
                pivotID=l;
            }
            else if(x==a[r])
            {
                pivotID=r;
            }
            else {
                pivotID=mid;
                swap(a,l,pivotID);
            }
        }
        return l;
    }
    public static int partitionTim(int []a, int l,int r)
    {

        int p=a[l];
        int i=l+1;

        for(int j=l+1;j<=r;j++)
        {
            if(a[j]<p)
            {
                swap(a,i,j);
                i++;
            }
        }
        swap(a,l,i-1);
        return i-1;
    }
    public static int rSelect(int []a,int l, int r,int orderStastics,int pivotId)
    {
        if(l==r)
            return a[l];
        choosePivot(a,l,r,pivotId);
        int pi=partitionTim(a,l,r);
        System.out.println(pi+" ");
        if(pi==orderStastics-1) return a[pi];
        else  if (pi>orderStastics)
            return rSelect(a,l,pi-1,orderStastics,pivotId);
        else
            return rSelect(a,pi+1,r,orderStastics-pi,pivotId);
    }
    public static void main(String []args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int []a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println();
        int z=3;
        System.out.println(z+"th smallest element is : "+rSelect(a,0,n-1,z,2));
        System.out.println("After the processed: ");
        for(int i:a)
        {
            System.out.print(i+" ");
        }
    }

}
