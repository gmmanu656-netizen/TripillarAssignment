package Package5;
import java.util.*;

public class BipartiteGraph {

    private int vertices;
    private LinkedList<Integer>[] adjList;

    BipartiteGraph(int v) {
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

    // Check bipartite using BFS
    boolean isBipartite() {
        int[] color = new int[vertices];
        Arrays.fill(color, -1); // -1 means uncolored

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < vertices; i++) {
            if (color[i] == -1) {

                queue.add(i);
                color[i] = 0;

                while (!queue.isEmpty()) {
                    int node = queue.poll();

                    for (int neighbor : adjList[node]) {

                        if (color[neighbor] == -1) {
                            color[neighbor] = 1 - color[node];
                            queue.add(neighbor);
                        }
                        else if (color[neighbor] == color[node]) {
                            return false; // same color → not bipartite
                        }
                    }
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {

        BipartiteGraph graph = new BipartiteGraph(5);

        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);

        if (graph.isBipartite())
            System.out.println("Graph is Bipartite");
        else
            System.out.println("Graph is NOT Bipartite");
    }
}
