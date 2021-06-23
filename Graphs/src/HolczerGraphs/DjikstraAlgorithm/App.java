package HolczerGraphs.DjikstraAlgorithm;

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

        graph.addEdge(A,B,5);
        graph.addEdge(A,H,8);
        graph.addEdge(A,E,9);
        graph.addEdge(E,F,4);
        graph.addEdge(E,G,20);
        graph.addEdge(H,C,7);
        graph.addEdge(H,F,6);
        graph.addEdge(B,H,5);
        graph.addEdge(B,C,12);
        graph.addEdge(B,D,15);
        graph.addEdge(C,D,3);
        graph.addEdge(C,G,1);
        graph.addEdge(D,G,9);
        graph.addEdge(F,C,1);
        graph.addEdge(E,H,5);
        graph.addEdge(F,G,13);

        graph.bfsTraverse();

        Djikstra djikstra = new Djikstra();
        djikstra.getShortestPathTo(A,G);
    }
}
