package HolczerGraphs.StronglyConnectedComponents.Kosaraju;
import java.util.*;

public class App {
    public static void main(String[] args) {

        Graph g = new Graph();

        g.getVertices().add(new Vertex("a",0));
        g.getVertices().add(new Vertex("b",1));
        g.getVertices().add(new Vertex("c",2));
        g.getVertices().add(new Vertex("d",3));
        g.getVertices().add(new Vertex("e",4));
        g.getVertices().add(new Vertex("f",5));
        g.getVertices().add(new Vertex("g",6));
        g.getVertices().add(new Vertex("h",7));

        g.addEdge(g.getVertices().get(0),g.getVertices().get(1));
        g.addEdge(g.getVertices().get(0),g.getVertices().get(2));
        g.addEdge(g.getVertices().get(2),g.getVertices().get(0));
        g.addEdge(g.getVertices().get(1),g.getVertices().get(4));
        g.addEdge(g.getVertices().get(1),g.getVertices().get(3));
        g.addEdge(g.getVertices().get(4),g.getVertices().get(3));
        g.addEdge(g.getVertices().get(3),g.getVertices().get(7));
        g.addEdge(g.getVertices().get(7),g.getVertices().get(4));
        g.addEdge(g.getVertices().get(4),g.getVertices().get(5));
        g.addEdge(g.getVertices().get(5),g.getVertices().get(6));
        g.addEdge(g.getVertices().get(6),g.getVertices().get(7));
        //g.addEdge(g.getVertices().get(4),g.getVertices().get(2));
        //g.addEdge(g.getVertices().get(2),g.getVertices().get(5));


        //g.dfs();

        //Stack<Vertex> stack = g.getTopologicalOrder();
        //System.out.println(stack);

        //Graph transpose = g.getTranspose();

        //System.out.println(transpose.getVertices());

//        for(Vertex v: transpose.getVertices() ){
//            System.out.println(v + " The children are:-->");
//            System.out.println(v.getEdges());
//        }

        //System.out.println(" DFS on transpose .......");
        //transpose.dfs();

        Kosaraju k = new Kosaraju(g);
        int[] ids = k.getConnectId();

        for(int i: ids){
            System.out.print(i+" ");
        }



    }
}
