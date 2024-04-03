package BinarySearch;

import java.util.Scanner;

public class BS {
    int []a;
    int n;
    BS(int n)
    {
        this.a= new int[n];
        this.n= n;
    }
    //defining the search element method which will the element int the arr  and if the current the element is
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
//
//        //using the binary search method to the target element.
//        System.out.println("The index for required element: ");
//        System.out.println(obj.searchElement(target));
//
//        //using the order agnostic search for not know order for sorted array.
//        System.out.println("The index for required element to unknown order of sorted array: ");
//        target = sc.nextInt();
//        System.out.println(obj.orderAgnosticSearch(target));

        //using the firstOccurrence method for first occurrence in the array.
//        System.out.println("The index for required element for first occurrence: ");
//        target = sc.nextInt();
        System.out.println(obj.firstOccurrence(target));

    }
    //order agnostic search
    public int orderAgnosticSearch(int target)
    {
        int l=0, r=this.n -1;
        // Checking the sorted order in ascending or descending of the given array
        boolean isAsc;
        isAsc = a[r] > a[l];
        while (l <= r) {
            int middle = l + (r - l) / 2;

            // Check if target is present at mid
            if (a[middle] == target)
                return middle;

            // if Ascending order
            if (isAsc) {

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
    //firstOccurrence method in ascending array
    private int firstOccurrence(int target) {
        int l = 0;
        int r = n - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (a[mid] == target ) {
                if(mid > 0 && a[mid]==a[mid-1])
                {
                    r = mid - 1;
                }
                else{
                    return mid;
                }
            }
            if (a[mid] < target) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return -1;
    }


    private void takeInput(int n,Scanner sc) {
        System.out.println("Enter the element for the array:");
        for(int i=0;i<n;i++)
        {
            this.a[i] = sc.nextInt();
        }
    }
}
