package graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Graph {

    public static void depthAndHeight(ArrayList<ArrayList<Integer>> g, int[] depth, int[] height, int parent, int v) {
        // Ensure the node v is within the valid range
        if (v < 0 || v >= g.size()) {
            throw new IllegalArgumentException("Node index out of bounds: " + v);
        }

        // Process each child node
        for (int i : g.get(v)) {
            if (i == parent) // Skip the parent node to prevent revisiting
                continue;

            depth[i] = depth[v] + 1; // Increase the depth of the child node
            depthAndHeight(g, depth, height, v, i); // Recur for the child node

            // Calculate the height of the current node as the max height of its children + 1
            height[v] = Math.max(height[v], height[i] + 1);
        }

        // Handle case where v is a leaf node (no children)
        if (g.get(v).isEmpty()) {
            height[v] = 0; // Set height of a leaf node to 0
        }
    }

    public static void printAdjacencyList(ArrayList<ArrayList<Integer>> adj, int n)
    {
        for(int i=0;i<=n;i++)
        {
            System.out.print(i+": ");
            for(int v:adj.get(i))
            {
                System.out.print(v+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int N = (int)1e5 +10;
        System.out.println("Enter number of nodes:");
        int n = sc.nextInt();

        // Initialize the adjacency list for the graph
        ArrayList<ArrayList<Integer>> g = new ArrayList<>(N+1);
        for (int i = 0; i < N; i++) {
            g.add(new ArrayList<>());
        }

        System.out.println("Enter the edges (u v):");
        for (int i = 1; i <= n; i++) { // Loop should run 'm' times for 'm' edges
            int u = sc.nextInt();
            int v = sc.nextInt();

            g.get(u).add(v);
            g.get(v).add(u);
        }
        printAdjacencyList(g,n);
        // Arrays to store depth and height of each node
        int[] depth = new int[n + 1];
        int[] height = new int[n + 1];

        // Assume the root of the tree is node 1 (this can vary based on the problem)

        // Output the maximum depth and height of the tree
        depthAndHeight(g, depth, height, -1, 1);
        System.out.println("Maximum depth of the graph: "+ Arrays.stream(depth).max().getAsInt());
        System.out.println("Height of the tree: " + Arrays.stream(height).max().getAsInt());

        // Close the scanner
        sc.close();
    }
}
