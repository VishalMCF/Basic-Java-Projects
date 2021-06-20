package HolczerGraphs.TopologicalSorting;
import java.util.*;

public class Vertex {

    private String data;
    private boolean visited;
    private List<Vertex> neighbours;

    Vertex(String data){
        this.data  = data;
        this.neighbours = new LinkedList<>();
    }

    public void addNeighbour(Vertex neighbour) {
        this.neighbours.add(neighbour);
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public List<Vertex> getNeighbours() {
        return neighbours;
    }

    @Override
    public String toString() {
        return "Vertex{" +
                "data='" + data + '\'' +
                '}';
    }
}
