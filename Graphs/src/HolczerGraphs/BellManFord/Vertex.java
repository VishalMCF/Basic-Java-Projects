package HolczerGraphs.BellManFord;
import java.util.*;

public class Vertex implements Comparable<Vertex>{

    private final String name;
    private boolean visited;
    private List<Edge> neighbors;
    private double distance;
    private Vertex predecessor;

    public Vertex(String name) {
        this.name = name;
        neighbors = new LinkedList<>();
        distance = Double.MAX_VALUE;
    }

    public Vertex getPredecessor() {
        return predecessor;
    }

    public void setPredecessor(Vertex predecessor) {
        this.predecessor = predecessor;
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

    @Override
    public int compareTo(Vertex otherVertex) {
        return Double.compare(this.getDistance(),otherVertex.getDistance());
    }
}
