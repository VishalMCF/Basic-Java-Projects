package HolczerGraphs.KruskalAlgortihm;
import java.util.*;

public class Kruskal {

    public void spanningTree(List<Vertex> vertexList, List<Edge> edgeList){
        List<Edge> mst = new ArrayList<>();
        DisjointSet set = new DisjointSet(vertexList);

        Collections.sort(edgeList);

        for(Edge e: edgeList){
            Vertex start = e.getStartVertex();
            Vertex target = e.getTargetVertex();
            if(set.find(start.getNode())!=set.find(target.getNode())){
                mst.add(e);
                set.union(start.getNode(),target.getNode());
            }
        }

        for(Edge e : mst){
            System.out.println(e.getStartVertex()+"  "+e.getTargetVertex()+" ---- ");
        }
    }
}
