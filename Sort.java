package Dsa_by_coding_ninjas;
import java.util.*;

public class Sort {
    public static int res=0;
    public static void swap(int []a,int l, int r)
    {
        int temp=a[l];
        a[l]=a[r];
        a[r]=temp;
    }
//    def choosePivot(alist,first,last,pivotID):
//            if pivotID == 'first':
//    pass
//
//    if pivotID == 'last':
//            (alist[first], alist[last]) = (alist[last], alist[first])
//
//    elif pivotID == 'middle':
//    mid = (last-first)//2 + first
//    listTemp = [alist[first], alist[last], alist[mid]]
//            listTemp.sort()
//            if listTemp[1] == alist[first]:
//    pivotIndex = first
//    elif listTemp[1] == alist[last]:
//    pivotIndex = last
//        else:
//    pivotIndex = mid
//            (alist[first], alist[pivotIndex]) = (alist[pivotIndex], alist[first])
    public static void choosePivot(int []a,int l, int r,int pivotID)
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
    }
    public static int partitionTim(int []a, int l,int r)
    {

        int p=a[l];
        int i=l+1;

        res+=r-l;
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
    public static int partition(int []a,int l, int r)
    {
        int p=a[r];
        int i=l-1;
        for(int j=l;j<r;j++)
        {
            if(a[j]<p)
            {
                i++;
                swap(a,i,j);
            }
        }
        swap(a,i+1,r);
        return i+1;
    }
    public static void quickSort(int []a,int l, int r,int pivotID)
    {
       if(l<r)
       {
           choosePivot(a,l,r,pivotID);
           int pi=partitionTim(a,l,r);
           quickSort(a,l,pi-1,pivotID);
           quickSort(a,pi+1,r,pivotID);
       }
    }
    public static void main(String []args)
    {
        res=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=10000;
        int []a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Unsorted Array: ");
       for(int i:a)
       {
           System.out.print(i+" ");
       }
       System.out.println();
       quickSort(a,0,n-1,2);
        System.out.println("Sorted Array: ");
        for(int i:a)
        {
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("Number of Comparison: "+res);
    }
}
