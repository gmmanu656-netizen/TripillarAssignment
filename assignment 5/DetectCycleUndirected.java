package Package5;
import java.util.*;

public class DetectCycleUndirected {

    private int vertices;
    private LinkedList<Integer>[] adjList;

    DetectCycleUndirected(int v) {
        vertices = v;
        adjList = new LinkedList[v];

        for (int i = 0; i < v; i++) {
            adjList[i] = new LinkedList<>();
        }
    }

    void addEdge(int src, int dest) {
        adjList[src].add(dest);
        adjList[dest].add(src); // undirected
    }

    boolean dfs(int node, boolean[] visited, int parent) {
        visited[node] = true;

        for (int neighbor : adjList[node]) {
            if (!visited[neighbor]) {
                if (dfs(neighbor, visited, node))
                    return true;
            } else if (neighbor != parent) {
                return true; // cycle found
            }
        }
        return false;
    }

    boolean hasCycle() {
        boolean[] visited = new boolean[vertices];

        for (int i = 0; i < vertices; i++) {
            if (!visited[i]) {
                if (dfs(i, visited, -1))
                    return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        DetectCycleUndirected graph = new DetectCycleUndirected(5);

        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(2, 0); // cycle here

        if (graph.hasCycle())
            System.out.println("Cycle detected");
        else
            System.out.println("No cycle");
    }
}