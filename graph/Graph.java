package graph;
import java.util.ArrayList;
import java.util.Scanner;

public class Graph  {
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        int m =sc.nextInt();
        ArrayList<ArrayList<Pair<Integer,Integer>>> g= new ArrayList<>(m+1);
        System.out.println("Enter yes if directed else no");
        String s=sc.next();
        for(int i=1;i<=m;i++)
        {
            int x=0;
            int a;
            a=sc.nextInt();
            System.out.println("Enter the weight if weighted else enter 0");
            int w=sc.nextInt();
            if(s.equalsIgnoreCase("Yes"))
            {
                g.get(i).add(new Pair<>(a,w));
                continue;
            }
            g.get(i).add(new Pair<>(a,w));
            g.get(a).add(new Pair<>(i,w));

        }
        for(int i=1;i<=m;i++)
        {
            for(int j=0;j<g.get(i).size();j++) {
                System.out.println("(" + g.get(i).get(j).getFirst() + ", " + g.get(i).get(j).getSecond() + ") ");
            }
        }

    }
}
