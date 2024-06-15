/*A. Compare T-Shirt Sizes
time limit per test1 second
memory limit per test256 megabytes
inputstandard input
outputstandard output
Two T-shirt sizes are given: a and b. The T-shirt size is either a string M or a string consisting of several (possibly zero) characters X and one of the characters S or L.

For example, strings M, XXL, S, XXXXXXXS could be the size of some T-shirts. And the strings XM, LL, SX are not sizes.

The letter M stands for medium, S for small, L for large. The letter X refers to the degree of size (from eXtra). For example, XXL is extra-extra-large (bigger than XL, and smaller than XXXL).

You need to compare two given sizes of T-shirts a and b.

The T-shirts are compared as follows:

any small size (no matter how many letters X) is smaller than the medium size and any large size;
any large size (regardless of the number of letters X) is larger than the medium size and any small size;
the more letters X before S, the smaller the size;
the more letters X in front of L, the larger the size.
For example:

XXXS < XS
XXXL > XL
XL > M
XXL = XXL
XXXXXS < M
XL > XXXS
Input
The first line of the input contains a single integer t (1?t?104) � the number of test cases.

Each test case consists of one line, in which a and b T-shirt sizes are written. The lengths of the strings corresponding to the T-shirt sizes do not exceed 50. It is guaranteed that all sizes are correct.

Output
For each test case, print on a separate line the result of comparing a and b T-shirt sizes (lines "<", ">" or "=" without quotes).

Example
inputCopy
6
XXXS XS
XXXL XL
XL M
XXL XXL
XXXXXS M
L M
outputCopy
<
>
>
=
<
>
*/
import java.util.*;
class Main
{
    public static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) {
	    int t=sc.nextInt();
	    for(int i=0;i<t;i++)
	    {
	        String a,b;
	        a=sc.next();
	        b=sc.next();
	        int n=a.length();
	        int n1=b.length();
	        if(a.charAt(n-1)==(b.charAt(n1-1)) && a.charAt(0)==('S'))
	        {
			if(n==n1)
				System.out.println("=");
	           else if(n>n-1)
	           {
	          		System.out.println(">");
	           }
			else
			{	
				System.out.println("<");
			}
		   }
		   else if(a.charAt(n-1)==('L'))
	        {
			System.out.println(">");
	        }
		   else if(b.charAt(n-1) == ('L'))
	        {
			System.out.println("<");
	        }
		   else if(a.charAt(n-1)==('M') && b.charAt(n-1)==('S'))
	        {
			System.out.println(">");
	        }
	         else if(a.charAt(n-1)==('M')&&b.charAt(n-1) == ('S'))
	        {
			System.out.println(">");
	        }
		
	    }
	}
}