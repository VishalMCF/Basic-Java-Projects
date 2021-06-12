public class Main {
    public static void main(String[] args) {
        BST<Integer> bTree = new BST<>(20);
        bTree.insert(100);
        bTree.insert(12);
        bTree.insert(24);
        bTree.insert(7);
        bTree.insert(15);
        bTree.insert(100);
        bTree.insert(42);
        bTree.insert(-100);
        bTree.insert(21);
        bTree.insert(60);
        bTree.insert(35);
        bTree.insert(2);
        bTree.traversal();
        System.out.println("\n");
        System.out.println("Minimum element = "+bTree.getMin());
        System.out.println("Maximum element = "+bTree.getMax());
         bTree.remove(21);
        bTree.traversal();
        System.out.println("\n");
        bTree.remove(24);
        bTree.traversal();
        System.out.println("\n");
        bTree.remove(20);
        bTree.traversal();
        System.out.println("\n");
        bTree.remove(100);
        bTree.traversal();
        bTree.remove(12);
        bTree.traversal();
        System.out.println("\n");
        bTree.remove(2);
        bTree.traversal();
        System.out.println("\n");
        bTree.remove(-100);
        bTree.traversal();
//        System.out.println("\n");
    }
}
