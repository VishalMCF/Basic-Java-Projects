package HolczerGraphs.StronglyConnectedComponents.Kosaraju;
import java.util.*;

public class Kosaraju {

    private Stack<Vertex> stack;
    private Graph transpose;
    int count;
    int[] ids;

    Kosaraju(Graph g){
        this.stack = g.getTopologicalOrder();
        System.out.println(this.stack);
        this.transpose = g.getTranspose();
        ids = new int[g.getVertices().size()];
    }

    public void connectedComponents(){
        for(Vertex v: this.transpose.getVertices()){
            if(!v.isVisited()) {
                dfsUtil(this.transpose.getVertices().get(v.getId()));
                System.out.println("Hey its called");
                count++;
            }
        }
    }

    private void dfsUtil(Vertex v){
        //System.out.println(v);
        v.setVisited(true);
        this.ids[v.getId()] = count;
        for(Vertex temp: v.getEdges()){
            if(!temp.isVisited()){
                dfsUtil(temp);
            }
        }
    }

    public int[] getConnectId(){
        this.connectedComponents();
        return this.ids;
    }
}
