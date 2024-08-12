package graph;

import java.util.ArrayList;
import java.util.Scanner;

public class Graph {

    private static int[] subTreeSum;
    private static int[] evenCnt;

    public static void subTreeSumAndEvenCnt(ArrayList<ArrayList<Integer>> adj, int V, int parent) {
        if (V % 2 == 0) {
            evenCnt[V]++;
        }
        subTreeSum[V] = V;

        for (int i : adj.get(V)) {
            if (i != parent) {
                subTreeSumAndEvenCnt(adj, i, V);
                subTreeSum[V] += subTreeSum[i];
                evenCnt[V] += evenCnt[i];
            }
        }
    }

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

    public static void printAdjacencyList(ArrayList<ArrayList<Integer>> adj, int n) {
        System.out.println();
        for (int i = 1; i <= n; i++) { // Start from 1 if nodes are 1-indexed
            System.out.print(i + ": ");
            for (int v : adj.get(i)) {
                System.out.print(v + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int N = (int) 1e5 + 10;
        System.out.println("Enter number of nodes:");
        int n = sc.nextInt();

        // Initialize the adjacency list for the graph
        ArrayList<ArrayList<Integer>> g = new ArrayList<>(N + 1);
        for (int i = 0; i <= N; i++) {
            g.add(new ArrayList<>());
        }

        System.out.println("Enter the edges (u v):");
        for (int i = 1; i < n; i++) { // For a tree with n nodes, there are n-1 edges
            int u = sc.nextInt();
            int v = sc.nextInt();

            g.get(u).add(v);
            g.get(v).add(u);
        }
        printAdjacencyList(g, n);

        // Initialize the arrays
        subTreeSum = new int[n + 1];
        evenCnt = new int[n + 1];

        // Root the tree at node 1 (assuming 1-based index)
        subTreeSumAndEvenCnt(g, 1, -1);

        // Uncomment the following lines if needed
        // Arrays to store depth and height of each node
        // int[] depth = new int[n + 1];
        // int[] height = new int[n + 1];

        // Assume the root of the tree is node 1 (this can vary based on the problem)
        // Output the maximum depth and height of the tree
        // depthAndHeight(g, depth, height, -1, 1);
        // System.out.println("Maximum depth of the graph: "+ Arrays.stream(depth).max().getAsInt());
        // System.out.println("Height of the tree: " + Arrays.stream(height).max().getAsInt());

        // SubQueries for sum of the subtree and even number value count in the tree using DFS.
        for (int i = 1; i <= n; i++) {
            System.out.println("SubTree sum for node " + i + ": " + subTreeSum[i]);
            System.out.println("Even Count for node " + i + ": " + evenCnt[i]);
        }

        // Close the scanner
        sc.close();
    }
}
