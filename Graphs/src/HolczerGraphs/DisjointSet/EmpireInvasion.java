//package HolczerGraphs.DisjointSet;
//
//import java.util.*;
//
//class Node{
//    int id;
//    int rank;
//    Node parent;
//
//    Node(int id,int rank,Node parent){
//        this.id = id;
//        this.rank = rank;
//        this.parent = parent;
//    }
//}
//
//class DisjointSet {
//
//    int numberOfSet;
//    List<Node> nodes;
//
//    DisjointSet(int n) {
//        this.numberOfSet = n;
//        this.nodes = new ArrayList<>(n+1);
//    }
//
//    public Node find(Node n) {
//        Node current = n;
//        while (current.parent != null) {
//            current = current.parent;
//        }
//        Node parent = current;
//        current = n;
//        while (current != parent) {
//            Node temp = current.parent;
//            current.parent = parent;
//            current = temp;
//        }
//        return parent;
//    }
//
//    public void union(Node n1, Node n2) {
//        Node parent1 = this.find(n1);
//        Node parent2 = this.find(n2);
//        if (parent1 == parent2) return;
//
//        if (parent1.rank < parent2.rank) {
//            parent1.parent = parent2;
//        } else if (parent1.rank > parent2.rank) {
//            parent2.parent = parent1;
//        } else {
//            parent2.parent = parent1;
//            parent1.rank = parent2.rank + 1;
//        }
//        numberOfSet--;
//    }
//}
//
//public class  EmpireInvasion{
//    public static void main(String args[] ) throws Exception {
//        /* Sample code to perform I/O:
//         * Use either of these methods for input
//
//        //BufferedReader
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String name = br.readLine();                // Reading input from STDIN
//        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT
//
//
//        Scanner s = new Scanner(System.in);
//        String name = s.nextLine();                 // Reading input from STDIN
//        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT
//
//        */
//
//        // Write your code here
//
//        int N;
//        Scanner s = new Scanner(System.in);
//        N = s.nextInt();
//        DisjointSet set = new DisjointSet(N);
//        int K;
//        K = s.nextInt();
//
//        for(int i=0;i<=N;i++){
//            Node temp = new Node(i,0,null);
//            set.nodes.add(temp);
//        }
//        for(int i=0;i<K;i++){
//            int e1,e2;
//            e1 = s.nextInt();
//            e2 = s.nextInt();
//            set.union(set.nodes.get(e1),set.nodes.get(e2));
//        }
//
//        System.out.println(set.numberOfSet);
//    }
//}
//
