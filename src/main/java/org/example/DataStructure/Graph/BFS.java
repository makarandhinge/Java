package org.example.DataStructure.Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class BFS {

    public static void main(String[] args) {

        // Number of vertices
        int v = 9;

        // Adjacency List representation of the graph
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < v; i++) {
            adj.add(new ArrayList<Integer>());
        }

        // Add edges to the graph
        addEdge(adj, 0, 1);
        addEdge(adj, 0, 2);
        addEdge(adj, 1, 3);
        addEdge(adj, 1, 4);
        addEdge(adj, 2, 4);
        addEdge(adj, 6, 7);
        addEdge(adj, 6, 8);

        // Perform the BFS traversal starting from vertex 0
        System.out.println("BFS starting from 0");
//        bfs(adj, 0);

        System.out.println();

        // Perform BFS for entire graph included disconnected graph
        bfsDisconnected(adj);
    }

    // Perform bfs for entire graph which maybe disconnected
    public static void bfsDisconnected(List<List<Integer>> adj) {
        boolean[] visited = new boolean[adj.size()]; // not visited

        for (int i = 0; i < adj.size(); i++) {
            if (!visited[i]) {
                bfs(adj, i, visited);
                System.out.println();
            }
        }
    }

    //BFS from the given source s
    public static void bfs(List<List<Integer>> adj, int s, boolean[] visited) {
        Queue<Integer> queue = new LinkedList<>();
        // Mark the source node as visited and enqueue it.
        visited[s] = true;
        queue.add(s);

        //Interate over the queue
        while (!queue.isEmpty()) {
            int current = queue.poll(); // Dequeue the vertex
            System.out.print(current + " ");

            //Get the all adjacent vertex of the current.
            for (int x : adj.get(current)) {
                if (!visited[x]) {
                    visited[x] = true;
                    queue.add(x); // Enqueue it.
                }
            }

        }


    }


    // BFS start from the given source s
    public static void bfs(List<List<Integer>> adj, int s) {
        Queue<Integer> queue = new LinkedList<Integer>();

        /*Initially mark  all the vertices as not visted When we push  a vertex  into the  queue,
         * we mark it as visited
         */

        boolean[] visited = new boolean[adj.size()];

        // Mark the source node as visited and enqueue it.
        visited[s] = true;
        queue.add(s);

        // Iterate over the queue
        while (!queue.isEmpty()) {

            //Dequeue the vertex and print it
            int current = queue.poll();
            System.out.print(current + " ");

            // Get all the adjacent vertex of the dequeued vertex
            // If an adjacent has not been visited, mark it
            // visited and enqueue it
            for (int x : adj.get(current)) {
                if (!visited[x]) {
                    visited[x] = true;
                    queue.add(x);
                }
            }

        }
    }


    // Method to add the edge in the graph
    public static void addEdge(List<List<Integer>> adj, int u, int v) {
        //undirected graph
        adj.get(u).add(v);
        adj.get(v).add(u);
    }


}
