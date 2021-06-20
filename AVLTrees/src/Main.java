public class Main {
    public static void main(String[] args) {
        AVLTree<Integer> avlTree = new AVLTree<>(50);
        avlTree.insert(45);
        avlTree.insert(60);
        avlTree.insert(70);
        avlTree.insert(68);
        avlTree.insert(55);
        avlTree.insert(25);
        avlTree.insert(90);
        avlTree.insert(48);
        avlTree.insert(28);
        avlTree.insert(125);
        avlTree.insert(21);
        avlTree.traversal();
        System.out.println("\n");
        avlTree.remove(50);
        avlTree.traversal();
        System.out.println("\n");
        avlTree.remove(25);
        avlTree.traversal();
        System.out.println("\n");
        avlTree.remove(90);
        avlTree.traversal();
        System.out.println("\n");
        avlTree.remove(60);
        avlTree.traversal();
        System.out.println("\n");
    }
}
