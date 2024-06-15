package graph;


import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
//defining a class for edges which will have attribute like source node as u , destination node as v , and weight of edge as weight.
//and it has constructor which will required 3 parameter.
class edges{
    int u;
    int v;
    int weight;
    edges(int u, int v, int weight)
    {
        this.u = u;
        this.v = v;
        this.weight = weight;
    }
}
//defining rSSTreeUsingDisjoinSet class which will hold the DSU attribute set as constructor of the DSU and findParent as find method for DSU and
//merge as merge_set for DSU.
public class rSSTreeUsingDisjointSet {
    int []parent;
    int []rank;
    rSSTreeUsingDisjointSet(int n)//making isolated set for every node.
    {
        parent = new int[n+3-2];
        rank = new int[n+3-2];
        for(int i=0;i<=n;i++) {
            parent[i] = i;
            rank[i] = i;
        }
    }
    public int findParent(int v)
    {
        if(parent[v]==v)
        {
            return v;
        }
        return parent[v] = findParent(parent[v]);
    }
    public void merge(int a, int b)
    {
        a=findParent(a);
        b=findParent(b);

        if(a!=b)
        {
            if(a>b) {
                a = a+b;
                b = a-b;
                a = a-b;
            }
            parent[b]= a;
            rank[a] += rank[b];
        }
    }

    //defining the kruskalAlgorithm method.
    public static int kruskalAlgorithm(edges []edge, int n)
    {
        int minOverallWeight =0;
        rSSTreeUsingDisjointSet ds = new rSSTreeUsingDisjointSet(n);
        Arrays.sort(edge,new Comparator<edges>() {
            @Override
            public int compare(edges e1, edges e2) {
                if (e1.weight != e2.weight)
                    return Integer.compare(e1.weight, e2.weight);
                return Integer.compare(e1.u + e1.v + e1.weight, e2.u + e2.v + e2.weight);
            }
        });
        for (edges ede : edge) {
            int u = ede.u;
            int v = ede.v;
            int weight = ede.weight;

            if (ds.findParent(u) != ds.findParent(v)) {
                minOverallWeight += weight;
                ds.merge(u, v);
            }
        }
        return minOverallWeight;
    }

    //defining main method.
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of Nodes: ");
        int n = sc.nextInt();
        edges []edgeList = new edges[n];
        //take the edge information for graph.
        for(int i=0;i<n;i++)
        {
            System.out.println("enter source node ");
            int u = sc.nextInt();
            System.out.println("enter destination node ");
            int v = sc.nextInt();
            System.out.println("enter weight for edges ");
            int weight = sc.nextInt();
            edgeList[i]=new edges(u,v,weight);
        }
        int minOverallWeight = kruskalAlgorithm(edgeList, n);
        System.out.println("Minimum overall weight of Really Special SubTree: " + minOverallWeight);
    }
}
