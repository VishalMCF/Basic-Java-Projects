package HolczerGraphs.TopologicalSorting;
import java.io.*;
import java.util.*;

public class App2 {
    public static void main(String[] args) throws IOException {
        int n;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        String[] input;
        for(int i=0;i<n;i++){
            graph.add(new ArrayList<>());
            scan.nextLine();
            String jhaantu = scan.nextLine();
            input = jhaantu.split("");
            for(int j=0;j<input.length;j++){
                graph.get(i).add(Integer.parseInt(input[j]));
            }
            System.out.println(jhaantu);
        }
        System.out.println(graph);
        int ans = traverse(0,graph,graph.size()-1);
        System.out.println(ans);

    }
    public static int traverse(int node, ArrayList<ArrayList<Integer>> graph, int target){
        if(node==target){
            return 1;
        }
        int paths = 0;
        for(int i=0;i<graph.get(node).size();i++){
            paths = paths+traverse(graph.get(node).get(i),graph,target);
        }
        return paths;
    }
}
