package HolczerGraphs.BreadthFirstSearch;
import java.util.*;

public class Graph {

    private HashSet<Vertex> vertices;
    private List<Vertex> vertexList;

    Graph(){
        this.vertices = new HashSet<>();
        this.vertexList = new LinkedList<>();
    }

    public void addEdge(Vertex v1, Vertex v2){
        // this is an undirected graph
        if(!vertices.contains(v1)){
            this.vertices.add(v1);
            this.vertexList.add(v1);
        }
        if(!vertices.contains(v2)){
            this.vertices.add(v2);
            this.vertexList.add(v2);
        }
        v1.addVertex(v2);
        v2.addVertex(v1);
    }

    public void bfsTraverse(){
        Vertex v = this.vertexList.get(0);
        Queue<Vertex> queue = new LinkedList<>();
        v.setVisited(true);
        queue.add(v);
        while(!queue.isEmpty()){
            Vertex temp = queue.remove();
            System.out.println(temp);
            for (Vertex vertex: temp.getAdjacenyList()) {
                if(!vertex.isVisited()){
                    vertex.setVisited(true);
                    queue.add(vertex);
                }
            }
        }
    }

    public void dfsTraverse(){
        Vertex v = this.vertexList.get(0);
        Stack<Vertex> stack = new Stack<>();
        stack.push(v);
        while(!stack.isEmpty()){
            Vertex temp = stack.pop();
            System.out.println(temp);
            temp.setVisited(true);
            for(Vertex vs: temp.getAdjacenyList()){
                if(!vs.isVisited())
                    stack.push(vs);
            }
        }
    }

}
