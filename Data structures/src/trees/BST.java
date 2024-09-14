package trees;

public class BST {
    public class Node{
        private int value;
        private int height;
        private Node left;
        private Node right;

        public Node(int value){
            this.value=value;

        }
        public int getValue(){
            return value;
        }
    }
    public BST(){

    }
    private Node root;

    public int height(Node node) {
        if (node == null) {
            return -1;
        }
        return node.height;
    }
    public boolean isEmpty(){
        return root==null;
    }

    public Node insert(int value,Node node){
        if(node ==null){
            node=new Node(value);
            return  node;
        }
        if(value<node.value){
            node.left=insert(value,node.left);
        }
        if(value>node.value){
            node.right=insert(value,node.right);
        }
        node.height=Math.max(height(node.left),height(node.right))+1;

        return node;

    }
    public void display(){
        display(root,"root node:");
    }
    public void display(Node node,String details){
        if(node ==null){
            return ;
        }
        System.out.println(details+node.getValue());
        display(node.left,"Left child of "+node.getValue()+":");



    }
}

