package Package5;
import java.util.*;

// Graph DFS Traversal
public class GraphDFS {

    private int vertices;
    private LinkedList<Integer>[] adjList;

    // Constructor
    GraphDFS(int v) {
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

    // DFS Traversal
    void dfs(int start) {
        boolean[] visited = new boolean[vertices];
        dfsHelper(start, visited);
    }

    // Recursive DFS
    void dfsHelper(int node, boolean[] visited) {
        visited[node] = true;
        System.out.print(node + " ");

        for (int neighbor : adjList[node]) {
            if (!visited[neighbor]) {
                dfsHelper(neighbor, visited);
            }
        }
    }

    public static void main(String[] args) {

        GraphDFS graph = new GraphDFS(5);

        // Adding edges
        graph.addEdge(0, 1);
        graph.addEdge(0, 4);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);

        System.out.print("DFS Traversal: ");
        graph.dfs(0);
    }
}