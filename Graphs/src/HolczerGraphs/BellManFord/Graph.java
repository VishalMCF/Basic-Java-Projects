package HolczerGraphs.BellManFord;
import java.util.*;

public class Graph {

    Set<Vertex> vertexSet;
    List<Vertex> vertexList;
    List<Edge> edgeList;

    Graph(){
        this.vertexList = new LinkedList<>();
        this.vertexSet = new HashSet<>();
        this.edgeList = new LinkedList<>();
    }

    public List<Vertex> getVertexList() {
        return vertexList;
    }

    public List<Edge> getEdgeList() {
        return edgeList;
    }

    public void addEdge(Double weight, Vertex start, Vertex end){
        if(!vertexSet.contains(start)){
            vertexSet.add(start);
            vertexList.add(start);
        }
        if(!vertexSet.contains(end)){
            vertexSet.add(end);
            vertexList.add(end);
        }
        Edge e  = new Edge(weight,start,end);
        start.addNeighbor(e);
        this.edgeList.add(e);
    }

    public void bfsTraverse(){
        Queue<Vertex> queue = new LinkedList<>();
        queue.add(vertexList.get(0));
        vertexList.get(0).setVisited(true);
        while(!queue.isEmpty()){
            Vertex current = queue.remove();
            System.out.println(current);
            for(Edge e : current.getNeighbors()){
                Vertex temp = e.getTargetVertex();
                if(!temp.isVisited()){
                    temp.setVisited(true);
                    queue.add(temp);
                }
            }
        }
    }

}
