package Package5;
import java.util.*;

public class ShortestPathBFS {

    private int vertices;
    private LinkedList<Integer>[] adjList;

    ShortestPathBFS(int v) {
        vertices = v;
        adjList = new LinkedList[v];

        for (int i = 0; i < v; i++) {
            adjList[i] = new LinkedList<>();
        }
    }

    // Add edge (undirected graph)
    void addEdge(int src, int dest) {
        adjList[src].add(dest);
        adjList[dest].add(src);
    }

    // BFS for shortest path
    void shortestPath(int start) {
        boolean[] visited = new boolean[vertices];
        int[] distance = new int[vertices];
        int[] parent = new int[vertices];

        Arrays.fill(distance, -1);

        Queue<Integer> queue = new LinkedList<>();

        visited[start] = true;
        distance[start] = 0;
        parent[start] = -1;

        queue.add(start);

        while (!queue.isEmpty()) {
            int node = queue.poll();

            for (int neighbor : adjList[node]) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    distance[neighbor] = distance[node] + 1;
                    parent[neighbor] = node;
                    queue.add(neighbor);
                }
            }
        }

        // Print shortest distances
        System.out.println("Vertex\tDistance from Source");
        for (int i = 0; i < vertices; i++) {
            System.out.println(i + "\t\t" + distance[i]);
        }
    }

    public static void main(String[] args) {

        ShortestPathBFS graph = new ShortestPathBFS(6);

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);
        graph.addEdge(4, 5);

        graph.shortestPath(0);
    }
}