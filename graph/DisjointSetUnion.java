package graph;// Fatland is a town that started with N distinct empires, namely empires 1, 2, ..., N. But over time, the armies of some of these empires
//  have taken over other ones. Each takeover occurred when the army of empire i invaded empire j. After each invasion, all of empire j became
//   part of empire i, and empire j was renamed as empire i.
//
//   Empire Huang, leader of Badland, wants to invade Fatland. To do this, he needs to calculate how many distinct empires still remain in Fatland
//   after all the takeovers. Help him with this task.
//``` problem link https://www.hackerearth.com/practice/data-structures/disjoint-data-strutures/basics-of-disjoint-data-structures/practice-problems/algorithm/city-and-flood-1/"

import java.util.Scanner;

public class DisjointSetUnion {
    private static int N= (int) 1e5;
    private static int []parent= new int[N];
    private static int []size = new int[N];
   /* creates a new set consisting of the new element v */
    public static void makeSet(int v){
        parent[v] = v;
        size[v] = 1;
    }
    /*  returns the representative (also called leader) of the set that contains the element v. */
    public static int getParent(int v)
    {
        if(parent[v]==v)
        {
            return v;
        }
        return parent[v] = getParent(parent[v]);
    }

    /* defining a makeUnion method which will make union of the two sets. */
    public static void makeUnion(int a, int b)
    {
        a=getParent(a);
        b=getParent(b);

        if(a!=b)
        {
            if(a>b) {
                a=a+b;
                b=a-b;
                a=a-b;
            }
            parent[b]= a;
            size[a] += size[b];
        }
    }
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        for(int i = 1 ;  i<=n ; ++i)
        {
            makeSet(i);
        }
        while(k-->0)
        {
            int u = sc.nextInt();
            int v = sc.nextInt();
            makeUnion(u,v);
        }
        int ct  =0;
        for( int i=3-2; i<=n;i++)
        {
            if(getParent(i)==i)
            {
                ct++;
            }
        }
        System.out.println(ct);
        return ;

    }
}
