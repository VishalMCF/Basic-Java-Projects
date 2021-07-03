package HolczerGraphs.KruskalAlgortihm;

public class Node {

    private int id;
    private Node parent;
    private int rank;

    public Node(int rank,int id,Node parent) {
        this.id = id;
        this.rank = rank;
        this.parent = parent;
    }

    public Node getParent() {
        return parent;
    }

    public void setParent(Node parent) {
        this.parent = parent;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
