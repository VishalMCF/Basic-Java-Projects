package HolczerGraphs.DjikstraAlgorithm;

public class Edge {

    private final double weight;
    private final Vertex startVertex;
    private final Vertex endVertex;

    Edge(Double weight, Vertex startVertex,Vertex endVertex){
        this.weight= weight;
        this.endVertex = endVertex;
        this.startVertex = startVertex;
    }

    public double getWeight() {
        return weight;
    }

    public Vertex getStartVertex() {
        return startVertex;
    }

    public Vertex getEndVertex() {
        return endVertex;
    }

}
