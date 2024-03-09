package BinarySearch;

import java.util.Scanner;

public class BS {
    int a[];
    BS(int n)
    {
        this.a= new int[n];
    }
    //defining the search elememt method which will the element int the arr  and if the current the element is
    //in the array then it should return the index for the value and if not then return -1.

    public int searchElement(int target)
    {
        int l=0,r=a.length;
        while(l<r)
        {
            int mid = l + (r-l)/2;
            if(a[mid]==target)
            {
                return mid;
            }
            else if(a[mid]<target)
            {
                 l = mid + 1;
            }
            else{
                r = mid ;
            }
        }
        return -1;
    }
    public static void main(String []args)
    {
        Scanner sc   = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n= sc.nextInt();
        BS obj =  new BS(n);
        obj.takeInput(n,sc);
        System.out.println("Enter the target element that you to search: ");
        int target = sc.nextInt();
        //using the binary search method to the target element.
        System.out.println("the index for required element: ");
         System.out.println(obj.searchElement(target));


    }

    private void takeInput(int n,Scanner sc) {
        System.out.println("Enter tyhe elemnt for the array:");
        for(int i=0;i<n;i++)
        {
            this.a[i] = sc.nextInt();
        }
    }
}
