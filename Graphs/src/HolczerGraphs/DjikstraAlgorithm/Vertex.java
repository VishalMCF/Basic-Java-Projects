package HolczerGraphs.DjikstraAlgorithm;
import java.util.*;

public class Vertex implements Comparable<Vertex>{

    private final String name;
    private boolean visited;
    private List<Edge> neighbors;
    private Vertex predecessor;
    private Double distance;

    Vertex(String name){
        this.name = name;
        neighbors = new LinkedList<>();
        distance = Double.MAX_VALUE;
    }

    public Double getDistance() {
        return distance;
    }

    public void setDistance(Double distance) {
        this.distance = distance;
    }

    public void addNeighbor(Edge e){
        this.neighbors.add(e);
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public List<Edge> getNeighbors() {
        return neighbors;
    }

    public Vertex getPredecessor() {
        return predecessor;
    }

    public void setPredecessor(Vertex predecessor) {
        this.predecessor = predecessor;
    }

    @Override
    public String toString() {
        return "Vertex{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Vertex otherVertex) {
        return Double.compare(this.distance,otherVertex.getDistance());
    }
}
