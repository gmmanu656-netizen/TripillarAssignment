package Package5;
import java.util.*;

// Graph using Adjacency List
public class GraphAdjList {

    private int vertices;
    private LinkedList<Integer>[] adjList;

    // Constructor
    GraphAdjList(int v) {
        vertices = v;
        adjList = new LinkedList[v];

        for (int i = 0; i < v; i++) {
            adjList[i] = new LinkedList<>();
        }
    }

    // Add edge
    void addEdge(int src, int dest) {
        adjList[src].add(dest);   // for directed graph

        // Uncomment below for undirected graph
        // adjList[dest].add(src);
    }

    // Print graph
    void printGraph() {
        for (int i = 0; i < vertices; i++) {
            System.out.print("Vertex " + i + ": ");
            for (Integer node : adjList[i]) {
                System.out.print(node + " -> ");
            }
            System.out.println("null");
        }
    }

    public static void main(String[] args) {

        GraphAdjList graph = new GraphAdjList(5);

        // Adding edges
        graph.addEdge(0, 1);
        graph.addEdge(0, 4);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);

        graph.printGraph();
    }
}