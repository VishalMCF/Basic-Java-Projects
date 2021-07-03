package HolczerGraphs.KruskalAlgortihm;
import java.util.*;

public class Vertex {

    private String name;
    private boolean visited;
    private List<Edge> neighbors;
    private Node node;

    public Vertex(String name) {
        this.name = name;
        this.neighbors = new LinkedList<>();
    }

    public Node getNode() {
        return node;
    }

    public void setNode(Node node) {
        this.node = node;
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

    public void addNeighbor(Edge neighbor) {
        this.neighbors.add(neighbor);
    }

}
