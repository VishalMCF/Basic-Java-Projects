package HolczerGraphs.TopologicalSorting;

public class App {
    public static void main(String[] args) {
        Graph g = new Graph();
        Vertex A = new Vertex("A");
        Vertex B = new Vertex("B");
        Vertex C = new Vertex("C");
        Vertex D = new Vertex("D");
        Vertex E = new Vertex("E");
        Vertex F = new Vertex("F");
        Vertex G = new Vertex("G");
        g.addEdge(D,A);
        g.addEdge(D,E);
        g.addEdge(A,B);
        g.addEdge(B,F);
        g.addEdge(A,G);
        g.addEdge(E,B);
        g.addEdge(E,C);
        g.addEdge(C,B);
        g.addEdge(G,F);
        g.topologicalSort();
    }
}
