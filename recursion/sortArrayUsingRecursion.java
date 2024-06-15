package recursion;

import java.util.Scanner;

public class sortArrayUsingRecursion {
    //creating a sort function which will take array and a reference variable i.e. size of array.
    public static void sort(int[] a, int n) {
        if (n == 0) {
            return;
        }
        int temp = a[n - 1];
        n--;
        sort(a, n);
        insert(a, n, temp);
    }
    // creating an insert function which will help to insert element to the sort array.
    private static void insert(int[] a, int n, int temp) {
        if (n <= 0 || a[n - 1] <= temp) {
            a[n] = temp;
            return;
        }
        int val = a[--n];
        insert(a, n, temp);
        a[++n]=val;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] n = new int[1];
        System.out.println("Enter the Array Size: ");
        n[0] = sc.nextInt();
        int[] a = new int[n[0]];
        System.out.println("Enter the Array Elements: ");
        for(int i=0;i<n[0];i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Sorted array: ");
        sort(a, n[0]);
        for (int i : a) {
            System.out.println(i);
        }
    }
}
