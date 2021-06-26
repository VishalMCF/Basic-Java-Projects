package HolczerGraphs.BellManFord;
import java.util.*;

public class Edge{

    private final Vertex startVertex;
    private final Vertex targetVertex;
    private final double weight;

    Edge(double weight, Vertex startVertex,Vertex targetVertex){
        this.weight = weight;
        this.startVertex = startVertex;
        this.targetVertex = targetVertex;
    }

    public double getWeight() {
        return weight;
    }

    public Vertex getStartVertex() {
        return startVertex;
    }

    public Vertex getTargetVertex() {
        return targetVertex;
    }
}
