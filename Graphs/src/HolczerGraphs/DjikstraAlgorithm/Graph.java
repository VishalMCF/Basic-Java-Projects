package HolczerGraphs.DjikstraAlgorithm;
import java.util.*;

public class Graph {
    Set<Vertex> vertexSet;
    List<Vertex> vertexList;

    Graph(){
        vertexSet = new HashSet<>();
        vertexList = new LinkedList<>();
    }

    public void addEdge(Vertex v1, Vertex v2,double weight){

        if(!vertexSet.contains(v1)){
            vertexSet.add(v1);
            vertexList.add(v1);
        }

        if(!vertexSet.contains(v2)){
            vertexSet.add(v2);
            vertexSet.add(v2);
        }

        Edge e = new Edge(weight,v1,v2);
        v1.addNeighbor(e);
    }

    public void bfsTraverse(){
        Queue<Vertex> queue = new LinkedList<>();
        queue.add(vertexList.get(0));
        vertexList.get(0).setVisited(true);
        while(!queue.isEmpty()){
            Vertex temp = queue.remove();
            System.out.println(temp);
            for(Edge e : temp.getNeighbors()){
                Vertex vs = e.getEndVertex();
                if(!vs.isVisited()){
                    vs.setVisited(true);
                    queue.add(vs);
                }
            }
        }
    }

}
