import java.util.*;
class Main
{
    public static Scanner sc= new Scanner(System.in);
    public static void main(String []args)
    {
        int t=sc.nextInt();
        for (int i=1;i<=t;i++)
        {
            ArrayList<ArrayList<Character>> a= new ArrayList<ArrayList<Character>>();
            int n=8;
            for(int j=0;j<n;j++)
            {
                a.add(new ArrayList<Character>());
                for(int k=0;k<n;k++)
                {
                    a.get(j).add(k,sc.next().charAt(0));
                }
            }
            for(int j=0;j<n;j++)
            {
                int c1=0,c2=0,c3=0,c4=0;
                a.add(new ArrayList<Character>());
                for(int k=0;k<n;k++)
                {
                    if(a.get(j).get(k)=='R')
                    {
                        c1++;
                    }
                    else if(a.get(j).get(k)=='B')
                    {
                        c2++;
                    }
                    else if(a.get(k).get(j)=='R')
                    {
                        c3++;
                    }
                    else if(a.get(k).get(j)=='B')
                    {
                        c4++;
                    }
                    else continue;
                }
                if(c1==n||c3==n)
                System.out.println("R");
                else if(c2==n||c4==n)
                System.out.println("B");
            }
            
        }
    }
}