package HolczerGraphs.DetectCycle;
import java.util.*;

public class Vertex {

    private final String name;
    private boolean beingVisited;
    private boolean isVisited;
    private List<Vertex> neighbors;

    Vertex(String name){
        this.name = name;
        this.neighbors = new LinkedList<>();
    }

    public String getName() {
        return name;
    }

    public boolean isBeingVisited() {
        return beingVisited;
    }

    public void setBeingVisited(boolean beingVisited) {
        this.beingVisited = beingVisited;
    }

    public boolean isVisited() {
        return isVisited;
    }

    public void setVisited(boolean visited) {
        this.isVisited = visited;
    }

    public List<Vertex> getNeighbors() {
        return neighbors;
    }

    public void addEdge(Vertex neighbor) {
        this.neighbors.add(neighbor);
    }

    @Override
    public String toString() {
        return "Vertex{" +
                "name='" + name + '\'' +
                '}';
    }
}
