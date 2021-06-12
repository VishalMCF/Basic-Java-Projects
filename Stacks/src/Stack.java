public class Stack <T extends Comparable<T>>{

    private Node<T> head;

    private int size;

    public T peek() throws Exception {
        if(head==null){
            throw new Exception("STack is Empty. Cannot return top's data");
        }
        return head.getData();
    }

    public void push(T data){
        if(head==null){
            head = new Node<>(data);
        }else{
            Node<T> oldHead = head;
            Node<T> head = new Node<>(data);
            head.setNext(oldHead);
        }
    }

    public T pop() throws Exception {
        if(head==null){
            throw new Exception("Stack is Empty. Cannot pop Elements!!!");
        }
        T dataToReturn = head.getData();
        head = head.getNext();
        return dataToReturn;
    }

    private int size(){
        return this.size;
    }

    private boolean isEmpty(){
        return this.size()==0;
    }
}
