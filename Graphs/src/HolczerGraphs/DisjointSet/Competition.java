package HolczerGraphs.DisjointSet;

import java.util.*;

class Node{
    int id;
    int rank;
    boolean visited;
    List<Node> edges;

    Node(int id){
        this.id = id;
        edges = new LinkedList<>();
    }

    @Override
    public String toString() {
        return "Node{" +
                "id=" + id +
                '}';
    }
}

class Graph {

    List<Node> nodes;

    Graph(int n) {
        this.nodes = new ArrayList<>(n+1);
        makeNodes(n);
    }

    private void makeNodes(int N) {
        for(int i=0;i<=N;i++){
            this.nodes.add(new Node(i));
        }
    }

    public void addEdge(Node l,Node r){
        l.edges.add(r);
        r.edges.add(l);
    }

    public int bfs(Node v){
        int count = 0;
        Queue<Node> queue = new LinkedList<>();
        queue.add(v);
        v.visited = true;
        while(!queue.isEmpty()){
            Node current = queue.remove();
            count++;
            for(Node neighbor: current.edges){
                if(!neighbor.visited){
                    neighbor.visited=true;
                    queue.add(neighbor);
                }
            }
        }
        return count;
    }
}

public class Competition{
    public static void main(String args[] ) throws Exception {

        Scanner s = new Scanner(System.in);
        int T;
        T = s.nextInt();
        Graph g;
        for(int i=0;i<T;i++){
            int N,M;
            N = s.nextInt();
            g = new Graph(N);
            M = s.nextInt();
            //System.out.println("Nodes initially => " +g.nodes);
            for(int j=0;j<M;j++){
                int L,R;
                L = s.nextInt();
                R = s.nextInt();
                Node l = g.nodes.get(L);
                Node r = g.nodes.get(R);
                //System.out.println(l+" <-----> "+r);
                g.addEdge(l,r);
            }

            int countV = 0;
            LinkedList<Integer> counts = new LinkedList<>();
            for(int a=1;a<N;a++){
                if(g.nodes.get(a).visited==false){
                    countV = g.bfs(g.nodes.get(a));
                    counts.add(countV);
                }
            }

            int answer = 1;
            for(int c: counts){
                answer = answer*c;
            }
            System.out.println(answer*comb(counts.size())*2);
        }
    }

    public static int fact(int num){
        int ans = 1;
        for(int i=1;i<=num;i++){
            ans*=i;
        }
        return ans;
    }

    public static int comb(int n){
        int N = fact(n);
        int NR = fact(n-2);
        return ((N/NR)/2);
    }
}
