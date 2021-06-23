package HolczerGraphs.DetectCycle;

public class App {
    public static void main(String[] args) {
        Graph graph = new Graph();
        Vertex A = new Vertex("A");
        Vertex B = new Vertex("B");
        Vertex C = new Vertex("C");
        Vertex D = new Vertex("D");
        Vertex E = new Vertex("E");
        Vertex F = new Vertex("F");
        Vertex G = new Vertex("G");
        Vertex H = new Vertex("H");

        graph.addEdge(D,E);
        graph.addEdge(D,A);
        graph.addEdge(A,B);
        graph.addEdge(E,B);
        graph.addEdge(E,C);
        graph.addEdge(C,B);
        graph.addEdge(B,F);
        graph.addEdge(F,G);
        graph.addEdge(A,G);
        graph.addEdge(G,B);

        graph.detectCyle();


    }
}
