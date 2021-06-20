package HolczerGraphs.BreadthFirstSearch;
import java.util.*;

public class App {
    public static void main(String[] args) {

        Vertex A = new Vertex("A");
        Vertex B = new Vertex("B");
        Vertex C = new Vertex("C");
        Vertex D = new Vertex("D");
        Vertex E = new Vertex("E");
        Vertex F = new Vertex("F");
        Vertex G = new Vertex("G");
        Vertex H = new Vertex("H");

        Graph g = new Graph();
        g.addEdge(A,B);
        g.addEdge(B,D);
        g.addEdge(D,E);
        g.addEdge(B,C);
        g.addEdge(A,F);
        g.addEdge(A,G);
        g.addEdge(G,H);
        g.dfsTraverse();
    }
}
