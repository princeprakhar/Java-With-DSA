public class Javalab1
{
    static int a=1;
    public static int fb(int n)
    {
        if(n==1||n==2)
        { 
           return (1);
        }
        else
        {
           int x=fb(n-1)+fb(n-2);
           return (x);
        } 
    }
    public static void main(String []args)
    {
         while(a<=10)
         {
             System.out.println(fb(a));
             a++;
          }
     }
}
