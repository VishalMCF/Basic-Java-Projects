package HolczerGraphs.PrimAlgorithm;

public class Edge implements Comparable<Edge> {

    private final double weight;
    private final Vertex startVertex;
    private final Vertex targetVertex;

    public Edge(double weight, Vertex startVertex, Vertex targetVertex) {
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

    @Override
    public int compareTo(Edge other) {
        return Double.compare(this.weight, other.getWeight());
    }
}
