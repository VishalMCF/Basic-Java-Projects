package HolczerGraphs.TopologicalSorting;
import java.util.*;

class Graph {

    private HashSet<Vertex> verticesSet = new HashSet<>();
    private LinkedList<Vertex> verticesList = new LinkedList<>();;

    public void addEdge(Vertex v1, Vertex v2){
        if(!verticesSet.contains(v1)){
            verticesSet.add(v1);
            verticesList.add(v1);
        }
        if(!verticesSet.contains(v2)){
            verticesSet.add(v2);
            verticesList.add(v2);
        }
        v1.addNeighbour(v2);
    }

    public void bsfTraverse(){
        Queue<Vertex> queue = new LinkedList<>();
        queue.add(this.verticesList.get(0));
        while(!queue.isEmpty()){
            Vertex temp = queue.remove();
            temp.setVisited(true);
            System.out.println(temp);
            for (Vertex vs: temp.getNeighbours()) {
                if(!vs.isVisited()){
                    queue.add(vs);
                }
            }
        }
    }

    public void dfsTraverse(){
        Stack<Vertex> stack = new Stack<>();
        Vertex v = this.verticesList.get(0);
        stack.push(v);
        while(!stack.isEmpty()){
            Vertex temp = stack.pop();
            temp.setVisited(true);
            System.out.println(temp);
            for (Vertex vs:temp.getNeighbours()) {
                if(!vs.isVisited()){
                    stack.push(vs);
                }
            }
        }
    }

    public void dfsUtil(Vertex v,Stack<Vertex> stack){
        v.setVisited(true);
        for (Vertex vs: v.getNeighbours()) {
            if(!vs.isVisited()){
                dfsUtil(vs,stack);
            }
        }
        stack.push(v);
    }

    public void topologicalSort(){
        Stack<Vertex> stack =  new Stack<>();
        for(Vertex v: this.verticesList){
            if(!v.isVisited())
                dfsUtil(v,stack);
        }
        showTopologicalOrder(stack);
    }

    public void showTopologicalOrder(Stack<Vertex> stack){
        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }


}
