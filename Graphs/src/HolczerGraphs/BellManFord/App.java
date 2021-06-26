package HolczerGraphs.BellManFord;

import java.util.*;

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

        graph.addEdge(5.0,A,B);
        graph.addEdge(8.0,A,H);
        graph.addEdge(9.0,A,E);
        graph.addEdge(4.0,E,F);
        graph.addEdge(20.0,E,G);
        graph.addEdge(-7.0,H,C);
        graph.addEdge(6.0,H,F);
        graph.addEdge(5.0,B,H);
        graph.addEdge(12.0,B,C);
        graph.addEdge(15.0,B,D);
        graph.addEdge(3.0,C,D);
        graph.addEdge(1.0,C,G);
        graph.addEdge(9.0,D,G);
        graph.addEdge(1.0,F,C);
        graph.addEdge(5.0,E,H);
        graph.addEdge(13.0,F,G);

        graph.bfsTraverse();
        BellManFord spath = new BellManFord();
        spath.getShortestPathTo(graph,A,G);

    }
}
