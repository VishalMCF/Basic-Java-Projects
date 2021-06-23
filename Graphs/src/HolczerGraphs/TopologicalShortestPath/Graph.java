package HolczerGraphs.TopologicalShortestPath;
import java.util.*;

public class Graph {

    private Set<Vertex> vertexSet;
    private List<Vertex> vertexList;

    Graph(){
        this.vertexList = new LinkedList<>();
        this.vertexSet = new HashSet<>();
    }

    public void addEdge(Vertex v1, Vertex v2, Double weight){
        if(!vertexSet.contains(v1)){
            vertexSet.add(v1);
            vertexList.add(v1);
        }
        if(!vertexSet.contains(v2)){
            vertexSet.add(v2);
            vertexList.add(v2);
        }
        v1.addNeighbor(new Edge(weight,v2));
    }

    public void bfsTraverse(){
        Queue<Vertex> queue = new LinkedList<>();
        //vertexList.get(0).setVisited(true);
        queue.add(vertexList.get(0));
        while(!queue.isEmpty()){
            Vertex temp = queue.remove();
            System.out.println(temp);
            for(Edge e : temp.getNeighbors()){
                Vertex vs = e.getTarget();
                if(!vs.isVisited())
                    queue.add(vs);
                    vs.setVisited(true);
            }
        }
    }

    public void dfsTraverse(){
        Stack<Vertex> stack = new Stack<>();
        stack.add(this.vertexList.get(0));
        this.vertexList.get(0).setVisited(true);
        while(!stack.isEmpty()){
            Vertex temp = stack.pop();
            System.out.println(temp);
            for(Edge e : temp.getNeighbors()){
                if(!e.getTarget().isVisited())
                    stack.push(e.getTarget());
                    e.getTarget().setVisited(true);
            }
        }
    }

    public Stack<Vertex> topologicalOrdering(){
        Stack<Vertex> stack = new Stack<>();
        for(Vertex v: this.vertexList){
            if(!v.isVisited()){
                dfs(v,stack);
            }
        }
        System.out.println(stack);
        return stack;
    }

    private void dfs(Vertex v, Stack<Vertex> stack) {
        v.setVisited(true);
        for(Edge e: v.getNeighbors()){
            Vertex temp = e.getTarget();
            if(!temp.isVisited()){
                dfs(temp,stack);
            }
        }
        stack.push(v);
    }

    public void showTopologicalOrdering(){
        Stack<Vertex> topologicalOrder = this.topologicalOrdering();
        Iterator<Vertex> itr = topologicalOrder.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }

    public void distancesOfAll(){
        for(Vertex v: this.vertexList){
            System.out.println(v+"  "+v.getDistance());
        }
    }
}
