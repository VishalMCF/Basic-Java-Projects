package HolczerGraphs.TopologicalShortestPath;

public class Edge {

    private final Double weight;
    private final Vertex target;

    public Edge(Double weight, Vertex target) {
        this.weight = weight;
        this.target = target;
    }

    public Double getWeight() {
        return weight;
    }

    public Vertex getTarget() {
        return target;
    }

}
