package HolczerGraphs.TopologicalShortestPath;
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

        Graph graph = new Graph();

        graph.addEdge(D,E,2.0);
        graph.addEdge(D,A,3.0);
        graph.addEdge(A,B,2.0);
        graph.addEdge(E,B,4.0);
        graph.addEdge(E,C,2.0);
        graph.addEdge(C,B,1.0);
        graph.addEdge(B,F,4.0);
        graph.addEdge(G,F,2.0);
        graph.addEdge(A,G,3.0);

        Stack<Vertex> stack  = graph.topologicalOrdering();
        //System.out.println(stack);


        ShortestPath sPath = new ShortestPath(C,graph);
        sPath.printShortest(stack);

    }
}
