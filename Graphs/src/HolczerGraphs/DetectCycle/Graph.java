package HolczerGraphs.DetectCycle;
import java.util.*;

import java.util.HashSet;

public class Graph {

    Set<Vertex> vertexSet;
    List<Vertex> vertexList;

    Graph(){
        this.vertexSet = new HashSet<>();
        this.vertexList = new LinkedList<>();
    }

    public void addEdge(Vertex v1, Vertex v2){
        if(!vertexSet.contains(v1)){
            vertexSet.add(v1);
            vertexList.add(v1);
        }
        if(!vertexSet.contains(v2)){
            vertexSet.add(v2);
            vertexList.add(v2);
        }
        v1.addEdge(v2);
    }

    public void bfsTraverse(){
        Queue<Vertex> queue = new LinkedList<>();
        queue.add(vertexList.get(0));
        vertexList.get(0).setVisited(true);
        while(!queue.isEmpty()){
            Vertex temp = queue.remove();
            System.out.println(temp);
            for(Vertex v: temp.getNeighbors()){
                if(!v.isVisited()){
                    queue.add(v);
                    v.setVisited(true);
                }
            }
        }
    }

    public void dfsTraverse(){
        Stack<Vertex> stack = new Stack<>();
        stack.push(vertexList.get(0));
        vertexList.get(0).setVisited(true);
        while(!stack.isEmpty()){
            Vertex temp = stack.pop();
            System.out.println(temp);
            for(Vertex v: temp.getNeighbors()){
                if(!v.isVisited()){
                    stack.push(v);
                    v.setVisited(true);
                }
            }
        }
    }

    public void detectCyle(){
        dfsCycleUtil(this.vertexList.get(0));
    }

    private void dfsCycleUtil(Vertex v){
        System.out.println(v);
        v.setBeingVisited(true);
        for(Vertex temp: v.getNeighbors()){
            if(temp.isBeingVisited()){
                System.out.println("Current cycle node = "+temp);
                System.out.println("Cycle detected in the graph");
            }
            if(!temp.isVisited()){
                v.setVisited(true);
                dfsCycleUtil(temp);
            }
        }
        v.setBeingVisited(false);
        v.setVisited(true);
    }

}
