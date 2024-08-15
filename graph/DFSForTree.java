package graph;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class DFSForTree {
    private static int N = (int) 1e5 + 10;
    private static int[] par;
    private static int[] depth;
    private static boolean firstDFS;
    public static void dfsForTree(ArrayList<ArrayList<Integer>> graph, int v, int parent) {
        if(!firstDFS)
            par[v] = parent;
        for (int i : graph.get(v)) {
            if (i != parent) {
                depth[i] = 1 + depth[v];
                dfsForTree(graph, i, v);
            }
        }
    }
    public static ArrayList<Integer> path(int v) {
        ArrayList<Integer> res = new ArrayList<>();
        while (v != -1) {
            res.add(v);
            v = par[v];
        }
        Collections.reverse(res);
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        par = new int[n+1];
        depth = new int[n+1];

        // Initialize graph
        for (int i = 1; i <= N; i++) {
            graph.add(new ArrayList<>());
        }

        System.out.println("Enter the edges: ");
        for (int i = 1; i <= n ; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        // First DFS to find the farthest node from node 0
        dfsForTree(graph, 0, -1);
        int mxDep = -1;
        int mxDepNode = 0;
        for (int i = 0; i <= n; i++) {
            if (mxDep < depth[i]) {
                mxDep = depth[i];
                mxDepNode = i;
            }
            depth[i] = 0;  // Reset depth for next DFS
        }
        // Second DFS from the farthest node found
        firstDFS = true;
        dfsForTree(graph, mxDepNode,-1);
        mxDep = 0;
        for (int i = 0; i <= n; i++) {
            if (mxDep < depth[i]) {
                mxDep = depth[i];
            }
        }

        // Output the maximum depth found
        System.out.println("Diameter of the tree: " + mxDep);

        int a = sc.nextInt();
        int b = sc.nextInt();

        // Find paths from a and b to the root
        ArrayList<Integer> pathA = path(a);
        ArrayList<Integer> pathB = path(b);
        // Find the LCA by comparing paths
        int lca = -1;
        int minLength = Math.min(pathA.size(), pathB.size());
        for (int i = 0; i < minLength; i++) {
            if (pathA.get(i).equals(pathB.get(i))) {
                lca = pathA.get(i);
            } else {
                break;
            }
        }

        // Output the LCA
        System.out.println("LCA of " + a + " and " + b + " : " + lca);
    }
}
