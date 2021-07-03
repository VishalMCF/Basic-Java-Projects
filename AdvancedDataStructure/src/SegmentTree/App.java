package SegmentTree;
import java.util.*;

public class App {
    public static void main(String[] args) {

        int[] arr = {1,3,5,7,9,11};
        SegmentTree sTree = new SegmentTree(arr);
        System.out.println(sTree);
        Scanner scan = new Scanner(System.in);
        System.out.println(sTree.getSum(1,3));
        sTree.updateValue(4,20);
        System.out.println(sTree.getSum(0,2));
        //sTree.updateValue(1,-3);
        System.out.println(sTree.getSum(4,5));
        //sTree.updateValue(3,100);
        System.out.println(sTree.getSum(0,5));
    }
}
