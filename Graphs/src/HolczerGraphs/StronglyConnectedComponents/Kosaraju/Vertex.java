package HolczerGraphs.StronglyConnectedComponents.Kosaraju;
import java.util.*;

public class Vertex {

    private int id;
    private String name;
    private List<Vertex> edges;
    private boolean visited;

    Vertex(String name,int id){
        this.name = name;
        this.id = id;
        this.edges = new LinkedList<>();
    }

    public void addEdge(Vertex v){
        this.edges.add(v);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Vertex> getEdges() {
        return edges;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    @Override
    public String toString() {
        return "Vertex{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
