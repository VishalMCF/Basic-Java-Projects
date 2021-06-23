package HolczerGraphs.DjikstraAlgorithm;
import java.util.*;

public class Djikstra{

    public void computePaths(Vertex sourceVertex){
        sourceVertex.setDistance(0.0);
        PriorityQueue<Vertex> vertexQueue = new PriorityQueue<>();
        vertexQueue.add(sourceVertex);
        while(!vertexQueue.isEmpty()){
            Vertex current = vertexQueue.poll();
            for(Edge e: current.getNeighbors()){
                Vertex neighbor = e.getEndVertex();
                if(neighbor.getDistance()>e.getWeight()+ current.getDistance()){
                    vertexQueue.remove(neighbor);
                    neighbor.setDistance(e.getWeight()+ current.getDistance());
                    neighbor.setPredecessor(current);
                    vertexQueue.add(neighbor);
                }
            }
        }
    }

    public void getShortestPathTo(Vertex sourceVertex, Vertex targetVertex){
        computePaths(sourceVertex);
        List<Vertex> path = new ArrayList<>();
        Vertex temp = targetVertex;
        while(temp!=null){
            path.add(temp);
            temp = temp.getPredecessor();
        }
        Collections.sort(path);
        System.out.println(path);
    }

}
