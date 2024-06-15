package recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class binaryStringsWithNoConsecutive1s {
    public static List< String > generateString(int N) {
        // Write your code here.
        if (N == 0) {
            ArrayList<String> emptyList = new ArrayList<String>();
            emptyList.add("");
            return emptyList;
        }
        if (N == 1) {
            ArrayList<String> list = new ArrayList<String>();
            list.add("0");
            list.add("1");
            return list;
        }
        ArrayList<String> result = new ArrayList<String>();
        List<String> prevList = generateString(N - 1);
        for (String s : prevList) {
            result.add(s + "0");
            if (s.charAt(s.length() - 1) != '1') {
                result.add(s + "1");
            }
        }
        return result;
    }
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of binary that you want to genrate: ");
        int n = sc.nextInt();
        List<String> result = generateString(n);
        for(String s: result)
        {
            System.out.println(s);
        }
    }
}
