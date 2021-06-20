package HolczerGraphs.TopologicalSorting;

public class App {
    public static void main(String[] args) {
        Graph g = new Graph();
        Vertex A = new Vertex("0");
        Vertex B = new Vertex("1");
        Vertex C = new Vertex("2");
        Vertex D = new Vertex("3");
        Vertex E = new Vertex("5");
        Vertex F = new Vertex("4");
        g.addEdge(F,A);
        g.addEdge(E,A);
        g.addEdge(E,B);
        g.addEdge(D,B);
        g.addEdge(C,D);
        g.addEdge(F,C);
        g.topologicalSort();
    }
}
