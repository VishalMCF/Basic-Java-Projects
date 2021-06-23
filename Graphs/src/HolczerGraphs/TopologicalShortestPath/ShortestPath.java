package HolczerGraphs.TopologicalShortestPath;

import java.util.Stack;

public class ShortestPath {
    Stack<Vertex> topologicalOrder;
    Vertex origin;
    Graph g;
    ShortestPath(Vertex v, Graph g){
        this.origin = v;
        this.origin.setDistance(0);
        this.g = g;
    }

    private void compute(Stack<Vertex > topologicalOrder){
        while(!topologicalOrder.isEmpty()){
            Vertex temp = topologicalOrder.pop();
            System.out.println("Vertex popped  =  "+temp);
            for(Edge e : temp.getNeighbors()){
                Vertex neighbour = e.getTarget();
                System.out.println("Neighbor Vertex  =  "+neighbour);
                if(neighbour.getDistance()>e.getWeight()+ temp.getDistance()){
                    neighbour.setDistance(e.getWeight()+ temp.getDistance());
                    neighbour.setPredecessor(temp);
                }
            }
        }
    }

    public void printShortest(Stack<Vertex> stack){
        this.compute(stack);
        this.g.distancesOfAll();
    }
}
