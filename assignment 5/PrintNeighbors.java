package Package5;
import java.util.*;

public class PrintNeighbors {

    private int vertices;
    private LinkedList<Integer>[] adjList;

    // Constructor
    PrintNeighbors(int v) {
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

    // Print neighbors of a given node
    void printNeighbors(int node) {
        if (node < 0 || node >= vertices) {
            System.out.println("Invalid node");
            return;
        }

        System.out.print("Neighbors of " + node + ": ");
        for (int neighbor : adjList[node]) {
            System.out.print(neighbor + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        PrintNeighbors graph = new PrintNeighbors(5);

        // Creating graph
        graph.addEdge(0, 1);
        graph.addEdge(0, 4);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(3, 4);

        // Print neighbors of node 1
        graph.printNeighbors(1);
    }
}