package HolczerGraphs.PrimAlgorithm;
import java.util.*;

public class Vertex {

    private final String name;
    private boolean visited;
    private List<Edge> neighbors;
    private double distance;

    public Vertex(String name) {
        this.name = name;
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

    public void addNeighbor(Edge e) {
        this.neighbors.add(e);
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    @Override
    public String toString() {
        return "Vertex{" +
                "name='" + name + '\'' +
                '}';
    }
}
