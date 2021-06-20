public class AVLTree <T extends Comparable<T>> implements Tree<T>{

    private Node<T> root;

    public AVLTree(T data){
        this.root = new Node<>(data);
    }

    public AVLTree(){}

    @Override
    public void insert(T data) {
        if(this.root==null){
            this.root = new Node<>(data);
            return;
        }
        insertUtil(this.root,data);
    }

    @Override
    public void remove(T data) {
        if(this.root==null){
            return;
        }
        removeUtil(this.root,data);
    }

    private Node<T> removeUtil(Node<T> root, T data) {
        if(root.getData().compareTo(data)==1){
         //   System.out.println("Root is greater than data = "+data+" Root val = "+root.getData());
            root.setLeft(removeUtil(root.getLeft(),data));
        }
        else if(root.getData().compareTo(data)==-1){
         //   System.out.println("Root is less than data = "+data+" Root val = "+root.getData());
            root.setRight(removeUtil(root.getRight(),data));
        }
        else{
            if(root.getLeft()==null && root.getRight()==null){
               // System.out.println("Leaf node is going to be deleted");
                return null;
            }
            else if(root.getLeft()!=null && root.getRight()==null){
              //  System.out.println("Right node is Null Node");
                return root.getLeft();
            } else if(root.getLeft()==null && root.getRight()!=null){
               // System.out.println("Left node is Null Node");
                return root.getRight();
            }
            else{
              //  System.out.println("Both child are present");
                Node<T> temp = getMaxLeftNode(root.getLeft());
                root.setData(temp.getData());
                root.setLeft(removeUtil(root.getLeft(),root.getData()));
            }
        }
        return root;
    }

    private Node<T> getMaxLeftNode(Node<T> root){
        if(root.getRight()==null){
            return root;
        }
        while(root.getRight()!=null){
            root = root.getRight();
        }
        return root;
    }

    private Node<T> insertUtil(Node<T> root,T data){
        if(root==null){
            return new Node<>(data);
        }
        else if(root.getData().compareTo(data)==1){
            root.setLeft(insertUtil(root.getLeft(),data));
        }
        else{
            root.setRight(insertUtil(root.getRight(),data));
        }
        return root;
    }

    @Override
    public void traversal() {
        inorder(this.root);
    }

    @Override
    public T getMin() {
        if(this.root==null){
            return null;
        }
        Node<T> temp = this.root;
        while(temp.getLeft()!=null){
            temp =  temp.getLeft();
        }
        return temp.getData();
    }

    @Override
    public T getMax() {
        if(this.root==null){
            return null;
        }
        Node<T> temp= this.root;
        while(temp.getRight()!=null){
            temp = temp.getRight();
        }
        return temp.getData();
    }

    private void inorder(Node<T> root){
        if(root!=null){
            inorder(root.getLeft());
            System.out.print(root.getData()+" ");
            inorder(root.getRight());
        }
    }

    private int getHeight(Node<T> root){
        if(root==null) return -1;
        return root.getHeight();
    }

    private void updateHeight(Node<T> root){
        if(root==null) return;
        root.setHeight(Math.max(getHeight(root.getLeft()),getHeight(root.getRight()))+1);
    }

    private int getBalance(Node<T> root){
        if(root==null) return 0;
        return getHeight(root.getLeft()) - getHeight(root.getRight());
    }

    private

}
