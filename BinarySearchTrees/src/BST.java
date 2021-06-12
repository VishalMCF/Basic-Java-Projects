public class BST<T extends Comparable<T>> implements Tree<T>{

    public Node<T> root;

    BST(T data){
        this.root = new Node<>(data);
    }

    BST(){}

    private Node<T> insert(Node<T> root, T data){
        if(root==null){
            return new Node<>(data);
        }
        else if(data.compareTo(root.getData())==-1){
            root.setLeft(insert(root.getLeft(),data));
        }
        else if(data.compareTo(root.getData())==1){
            root.setRight(insert(root.getRight(),data));
        }
        return root;

    }

    private void inorderUtil(Node<T> root){
        if(root!=null){
            inorderUtil(root.getLeft());
            System.out.print(root.getData()+" ");
            inorderUtil(root.getRight());
        }
    }

    @Override
    public void insert(T data) {
        if (this.root == null) {
            this.root = new Node<>(data);
        } else {
            insert(this.root, data);
        }
    }

    private Node<T> remove(Node<T> root,T data){
        if(root.getData().compareTo(data)==0){
            if(root.getLeft()==null && root.getRight()==null){
                System.out.println("Leaf Node detected = "+root.getData());
                return null;
            }
            else if(root.getLeft()!=null && root.getRight()==null){
                System.out.println("Only right Node is Null = "+root.getData());
                return root.getLeft();
            }
            else if(root.getLeft()==null && root.getRight()==null){
                System.out.println("Only left Node is null = "+root.getData());
                return root.getRight();
            }
            else{
                root.setData((T) getMinRightNode(root.getRight()).getData());
                root.setRight(remove(root.getRight(),root.getData()));
            }
            return root;
        }
        else if(root.getData().compareTo(data)==1){
            root.setLeft(remove(root.getLeft(),data));
            return root;
        }
        else{
            root.setRight(remove(root.getRight(),data));
            return root;
        }
    }

    @Override
    public void remove(T data) {
        remove(this.root,data);
    }

    @Override
    public void traversal() {
        inorderUtil(this.root);
    }

    @Override
    public T getMin() {
        Node<T> temp = this.root;
        while(temp.getLeft()!=null){
            temp = temp.getLeft();
        }
        return temp.getData();
    }

    @Override
    public T getMax() {
        Node<T> temp = this.root;
        while(temp.getRight()!=null){
            temp = temp.getRight();
        }
        return temp.getData();
    }

    private Node<T> getMaxLeftNode(Node<T> root){
        if(root==null){
            return (Node<T>) new Node<Integer>(-4000);
        }
        while(root.getRight()!=null){
            root = root.getRight();
        }
        return root;
    }

    private Node<T> getMinRightNode(Node<T> root){
        if(root==null){
            return (Node<T>) new Node<Integer>(-4000);
        }
        while(root.getLeft()!=null){
            root = root.getLeft();
        }
        return root;
    }

}
