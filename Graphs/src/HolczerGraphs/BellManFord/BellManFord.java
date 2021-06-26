package HolczerGraphs.BellManFord;
import java.util.*;

public class BellManFord {

    public void compute(Graph g,Vertex source){
        source.setDistance(0);
        List<Vertex> listVertex = g.getVertexList();
        List<Edge> listEdges = g.getEdgeList();

        for(int i=0;i<listVertex.size()-1;i++){
            for(Edge temp : listEdges){
                Vertex start = temp.getStartVertex();
                Vertex end = temp.getTargetVertex();
                if(start.getDistance()==Double.MAX_VALUE) continue;
                double newDistance = start.getDistance()+temp.getWeight();
                if(end.getDistance() > newDistance){
                    end.setDistance(newDistance);
                    end.setPredecessor(start);
                }
            }
        }

        for(Edge e: listEdges){
            if(e.getStartVertex().getDistance()!=Double.MAX_VALUE)
                if(hasCycle(e)){
                    System.out.println("Negative Cycle has been detected");
                    return;
                }
        }

    }

    private boolean hasCycle(Edge e) {
        return e.getStartVertex().getDistance()+e.getWeight() < e.getTargetVertex().getDistance();
    }

    public void getShortestPathTo(Graph g,Vertex sourceVertex, Vertex targetVertex){
        compute(g,sourceVertex);
        List<Vertex> path = new ArrayList<>();
        Vertex temp = targetVertex;
        while(temp!=null){
            path.add(temp);
            temp = temp.getPredecessor();
        }
        Collections.reverse(path);
        System.out.println(path);
    }

}
