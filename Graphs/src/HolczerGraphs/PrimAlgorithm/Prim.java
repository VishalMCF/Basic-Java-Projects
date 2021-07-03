package HolczerGraphs.PrimAlgorithm;

import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

public class Prim {

    List<Vertex> unvisitedVertices;
    private double fullcost;
    List<Edge> mst;
    PriorityQueue<Edge> pq;

    Prim(List<Vertex> vertices){
        this.fullcost=0;
        this.mst = new LinkedList<>();
        this.pq = new PriorityQueue<>();
        this.unvisitedVertices = vertices;
    }

    private void minSpanTree(){

        Vertex v = this.unvisitedVertices.get(0);
        unvisitedVertices.remove(v);
        while(!unvisitedVertices.isEmpty()){
            for(Edge edge: v.getNeighbors()){
                if(this.unvisitedVertices.contains(edge.getTargetVertex())){
                    pq.add(edge);
                }
            }
            Edge e = pq.remove();
            this.mst.add(e);
            this.fullcost+=e.getWeight();

            v = e.getTargetVertex();
            this.unvisitedVertices.remove(v);
        }
    }

    public void showMST(){
        this.minSpanTree();
        for(Edge edge:mst){
            System.out.println(edge.getStartVertex()+"  <------>   "+edge.getTargetVertex());
        }
    }
}
