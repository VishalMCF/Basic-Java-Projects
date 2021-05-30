public class LinkedList<T extends Comparable<T>> extends List<T> {

    private Node<T> root;
    private int numOfItems;

    @Override
    public void insert(T data) {
        if(root==null){
            root = new Node(data);
        }else{
            insertAtBeginning(data);
        }
    }

    private void insertAtBeginning(T data) {
        Node<T> newNode = new Node<>(data);
        newNode.setNext(root);
        root = newNode;
    }

    private void insertAtEnd(T data){
        Node<T> temp = root;
        while(temp.getNext()!=null){
            temp = temp.getNext();
        }
        temp.setNext(new Node<T>(data));
    }

    @Override
    public void remove(T data) {

    }

    @Override
    public void traverse() {
        Node<T> temp = root;
        while(temp!=null){
            System.out.print(temp);
            temp=temp.getNext();
        }
    }

    @Override
    public int size() {
        return numOfItems;
    }
}
