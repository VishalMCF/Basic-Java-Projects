package HolczerGraphs.PrimAlgorithm;
import java.util.*;

public class Graph {

    Set<Vertex> vertexSet;
    List<Vertex> vertexList;

    Graph(){
        this.vertexList = new LinkedList<>();
        this.vertexSet = new HashSet<>();
    }

    public void addEdge(Vertex v1, Vertex v2,Double weight){
        if(!this.vertexSet.contains(v1)){
            this.vertexSet.add(v1);
            this.vertexList.add(v1);
        }
        if(!this.vertexSet.contains(v2)){
            this.vertexSet.add(v2);
            this.vertexList.add(v2);
        }
        Edge e = new Edge(weight,v1,v2);
        v1.addNeighbor(e);
    }

    public List<Vertex> getVertexList() {
        return vertexList;
    }

    public void bfsTraverse(){
        Queue<Vertex> queue = new LinkedList<>();
        queue.add(this.vertexList.get(0));
        this.vertexList.get(0).setVisited(true);
        while(!queue.isEmpty()){
            Vertex v = queue.remove();
            for(Edge e : v.getNeighbors()){
                Vertex target = e.getTargetVertex();
                if(!target.isVisited()){
                    target.setVisited(true);
                    queue.add(target);
                }
            }
        }
    }
}

