package Package5;
import java.util.*;

public class ConnectedComponents {

    private int vertices;
    private LinkedList<Integer>[] adjList;

    ConnectedComponents(int v) {
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

    // DFS
    void dfs(int node, boolean[] visited) {
        visited[node] = true;

        for (int neighbor : adjList[node]) {
            if (!visited[neighbor]) {
                dfs(neighbor, visited);
            }
        }
    }

    // Count components
    int countComponents() {
        boolean[] visited = new boolean[vertices];
        int count = 0;

        for (int i = 0; i < vertices; i++) {
            if (!visited[i]) {
                dfs(i, visited);
                count++; // new component found
            }
        }
        return count;
    }

    public static void main(String[] args) {

        ConnectedComponents graph = new ConnectedComponents(6);

        // Creating graph
        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(3, 4);

        // Node 5 is isolated

        System.out.println("Connected Components: " + graph.countComponents());
    }
}