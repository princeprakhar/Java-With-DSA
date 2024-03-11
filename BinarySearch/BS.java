package BinarySearch;

import java.util.Scanner;

public class BS {
    int a[];
    int n;
    BS(int n)
    {
        this.a= new int[n];
        this.n= n;
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
    //order agnostic search
    public int orderAgnosticSearch(int target)
    {
        int l=0, r=this.n -1;
        // Checking the sorted order in ascending or descending of the given array
        boolean isAsc = a[l] < a[r];
        while (l <= r) {
            int middle = l + (r - l) / 2;

            // Check if target is present at mid
            if (a[middle] == target)
                return middle;

            // if Ascending order
            if (isAsc == true) {

                // If target greater, ignore left half
                if (a[middle] < target)
                    l = middle + 1;

                    // If target smaller, ignore right half
                else
                    r = middle - 1;
            }

            // else Descending order
            else {

                // If target smaller, ignore left half
                if (a[middle] > target)
                    l = middle + 1;

                    // If target greater, ignore right half
                else
                    r = middle - 1;
            }
        }

        // Element is not present
        return -1;
    }
    private void takeInput(int n,Scanner sc) {
        System.out.println("Enter tyhe elemnt for the array:");
        for(int i=0;i<n;i++)
        {
            this.a[i] = sc.nextInt();
        }
    }
}
