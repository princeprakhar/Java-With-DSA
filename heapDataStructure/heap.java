package heapDataStructure;

import java.util.Scanner;

public class heap {
    int []arr;//initializing the array.
    heap(int n)
    {
        this.arr=new int[n];
    }
    public static void swap(int i, int j)
    {
        i=i+j;
        j=i-j;
        i=i-j;
    }
    public void insertElement(int t)
    {
        int i=arr.length;
        int parentIndex=i/2;
        while(arr[t]<arr[parentIndex] && parentIndex>=0)
        {
            swap(arr[i],arr[parentIndex]);
            parentIndex/=2;
        }
        return ;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the heap: ");
        int n = sc.nextInt();
        heap h =new heap(n);
    }
}
