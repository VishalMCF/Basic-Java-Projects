package HolczerGraphs.BreadthFirstSearch;
import java.util.*;

public class Vertex {

    private String id;
    private List<Vertex> adjacenyList;
    private boolean visited;

    Vertex(String id){
        this.id = id;
        this.adjacenyList = new LinkedList<>();
    }

    public boolean isVisited(){
        return this.visited;
    }

    public void setVisited(boolean visited){
        this.visited = visited;
    }

    public String getId(){
        return id;
    }

    public void addVertex(Vertex v){
        this.adjacenyList.add(v);
    }

    public List<Vertex> getAdjacenyList(){
        return this.adjacenyList;
    }

    @Override
    public String toString() {
        return "Vertex {" +
                "id='" + id + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vertex vertex = (Vertex) o;
        return id.equals(vertex.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
