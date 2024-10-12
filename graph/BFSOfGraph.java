package graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BFSOfGraph {
    static boolean[] vis;
    static int[] level;

    // BFS implementation
    public static void bfs(ArrayList<ArrayList<Integer>> g, ArrayList<Integer> result, int source) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(source);
        vis[source] = true;
        level[source] = 1;

        while (!q.isEmpty()) {
            int v = q.poll();
            result.add(v);
            vis[v]=true;
            for (int n : g.get(v)) {
                if (!vis[n]) {
                    vis[n] = true;
                    level[n] = level[v] + 1;
                    q.offer(n); // Offer the neighbor to the queue
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of nodes: ");
        int n = sc.nextInt();

        System.out.print("Enter the number of edges: ");
        int m = sc.nextInt();  // Number of edges

        level = new int[n + 1];
        vis = new boolean[n + 1];

        // Initialize the adjacency list
        ArrayList<ArrayList<Integer>> g = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            g.add(new ArrayList<>());
        }

        System.out.println("Enter the edges (u v): ");
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            g.get(a).add(b);
            g.get(b).add(a);  // Since the graph is undirected
        }

        System.out.print("Enter the source node: ");
        int source = sc.nextInt();

        ArrayList<Integer> bfsOfGraph = new ArrayList<>();
        bfs(g, bfsOfGraph, source);

        System.out.println("BFS Traversal:");
        for (int node : bfsOfGraph) {
            System.out.print(node + " ");
        }
        System.out.println();
        for(int i=1;i<=n;i++)
            System.out.println("Level of node "+i+": "+level[i]);

        sc.close();  // Close the scanner
    }
}
