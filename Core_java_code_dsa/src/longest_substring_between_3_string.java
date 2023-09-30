import java.util.Scanner;
public class longest_substring_between_3_string {
    public static int solve(String a,String b, String c,int i,int j,int k) {
        if (i == 0 || j == 0 || k == 0)
            return 0;
        if (a.charAt(i - 1) == b.charAt(j - 1) && b.charAt(j - 1) == c.charAt(k - 1)) {
            return (1 + solve(a, b, c, i - 1, j - 1, k - 1));
        }
        int x = solve(a, b, c, i - 1, j, k);
        int y = solve(a, b, c, i, j - 1, k);
        int z = solve(a, b, c, i, j, k - 1);
        if (x >= y) return Math.max(z, x);
        return Math.max(y,z);
    }
        public static void main(String []args)
        {
            Scanner sc= new Scanner(System.in);
            String a,b,c;
            a=sc.next();
            b=sc.next();
            c=sc.next();
            System.out.println("The length Longest Substring that can be possible is:"+solve(a,b,c,a.length(),b.length(),c.length()));
        }
}
