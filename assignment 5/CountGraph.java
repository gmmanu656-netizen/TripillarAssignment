package Package5;
import java.util.*;

public class CountGraph {

    private int vertices;
    private LinkedList<Integer>[] adjList;

    // Constructor
    CountGraph(int v) {
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

    // Count vertices
    int countVertices() {
        return vertices;
    }

    // Count edges
    int countEdges() {
        int count = 0;

        for (int i = 0; i < vertices; i++) {
            count += adjList[i].size();
        }

        return count / 2; // divide by 2 (undirected graph)
    }

    public static void main(String[] args) {

        CountGraph graph = new CountGraph(5);

        // Create graph
        graph.addEdge(0, 1);
        graph.addEdge(0, 4);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(3, 4);

        System.out.println("Number of vertices: " + graph.countVertices());
        System.out.println("Number of edges: " + graph.countEdges());
    }
}