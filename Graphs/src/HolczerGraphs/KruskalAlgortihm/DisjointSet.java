package HolczerGraphs.KruskalAlgortihm;
import java.util.*;

public class DisjointSet {

    private int setCount = 0;
    private int nodeCount = 0;
    private List<Node> rootNodes;

    public DisjointSet(List<Vertex> vertexList) {
        this.rootNodes = new ArrayList<>(vertexList.size());
        makeSets(vertexList);
    }

    private void makeSets(List<Vertex> vertexList) {
        for(Vertex vertex: vertexList)
            makeSet(vertex);
    }

    private void makeSet(Vertex vertex){
        Node n = new Node(0,rootNodes.size(),null);
        vertex.setNode(n);
        this.rootNodes.add(n);
        this.nodeCount++;
        this.setCount++;
    }

    public int find(Node n){
        if(n.getParent()==null){
            return n.getId();
        }
        Node current  = n;
        while(current.getParent()!=null){
            current = current.getParent();
        }
        Node parent = current;
        current = n;
        while(current!=parent){
            Node temp = current.getParent();
            current.setParent(parent);
            current = temp;
        }
        return parent.getId();
    }

    public void union(Node n1,Node n2){
        int index1 = this.find(n1);
        int index2 = this.find(n2);

        if(index1==index2) return;

        Node root1 = this.rootNodes.get(index1);
        Node root2 = this.rootNodes.get(index2);

        if(root1.getRank()<root2.getRank()){
            root1.setParent(root2);
        }else if(root1.getRank()<root2.getRank()){
            root2.setParent(root1);
        }else{
            root2.setParent(root1);
            root1.setRank(root2.getRank()+1);
        }

        this.setCount--;
    }


}
