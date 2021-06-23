package HolczerGraphs.TopologicalShortestPath;
import java.util.*;
import java.util.LinkedList;

public class Vertex {

    private final String name;
    private double distance;
    private List<Edge> neighbors;
    private boolean visited;
    private Vertex predecessor;

    Vertex(String name){
        this.name = name;
        this.distance = Double.MAX_VALUE;
        this.neighbors  = new LinkedList<>();
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public List<Edge> getNeighbors() {
        return neighbors;
    }

    public void addNeighbor(Edge neighbor) {
        this.neighbors.add(neighbor);
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public Vertex getPredecessor() {
        return predecessor;
    }

    public void setPredecessor(Vertex predecessor) {
        this.predecessor = predecessor;
    }

    @Override
    public String toString() {
        return "Vertex{ " +
                " name = '" + name + '\'' +
                '}';
    }
}
