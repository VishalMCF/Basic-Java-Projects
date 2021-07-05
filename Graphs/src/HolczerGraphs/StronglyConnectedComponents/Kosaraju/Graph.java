package HolczerGraphs.StronglyConnectedComponents.Kosaraju;
import java.util.*;

public class Graph {

    private List<Vertex> vertices;

    Graph(){
        this.vertices = new LinkedList<>();
    }

    public void addEdge(Vertex v1,Vertex v2){
        v1.addEdge(v2);
    }

    public List<Vertex> getVertices() {
        return vertices;
    }

    public void setVertices(List<Vertex> vertices) {
        this.vertices = vertices;
    }

    public void dfs(){
        for(Vertex v: this.vertices){
            if(!v.isVisited()){
                dfsUtil(v);
            }
        }
    }

    private void dfsUtil(Vertex v){
        System.out.println(v);
        v.setVisited(true);
        for(Vertex temp:v.getEdges()){
            if(!temp.isVisited()){
                dfsUtil(temp);
            }
        }
    }

    public Stack<Vertex> getTopologicalOrder(){
        Stack<Vertex> stack = new Stack<>();
        for(Vertex v:this.vertices){
            if(!v.isVisited()){
                System.out.println(v.getName());
                topologicalUtil(v,stack);
            }
        }
        return stack;
    }

    private void topologicalUtil(Vertex v,Stack<Vertex> stack){
        v.setVisited(true);
        for(Vertex temp: v.getEdges()){
            if(!temp.isVisited()){
                topologicalUtil(temp,stack);
            }
        }
        System.out.println(v.getName());
        stack.push(v);
    }

    public Graph getTranspose(){
        Graph transpose = new Graph();
        for(Vertex v: this.vertices){
            transpose.getVertices().add(new Vertex(v.getName(),v.getId()));
        }
        for(Vertex v: this.vertices){
            for(Vertex temp: v.getEdges()){
                int id = temp.getId();
                transpose.getVertices().get(id).addEdge(transpose.getVertices().get(v.getId()));
            }
        }
        return transpose;
    }
}
