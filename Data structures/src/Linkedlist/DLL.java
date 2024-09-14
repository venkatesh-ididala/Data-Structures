package Linkedlist;

public class DLL {
    Node head;
    public void insertFirst(int val){
        Node node=new Node(val);
        node.next=head;
        node.prev=null;
        if(head!=null){
            head.prev=node;
        }
        head=node;

    }
    public void display(){
        Node node=head;
        Node last=null;
        while(node!=null){
            System.out.print(node.val+"-->");
            last=node;

            node=node.next;
        }
        System.out.println("end");

        System.out.println("print in reverse order");
        while(last!=null){
            System.out.print(last.val+"->");
            last=last.prev;

        }
        System.out.println("start");


    }
    public void insertLast(int val){
        Node node=new Node(val);
        Node last=head;

        node.next=null;
        if(head==null){
            node.prev=null;
            head=node;

        }
        while(last.next!=null){
            last=last.next;
        }
        last.next=node;
        node.prev=last;

    }
    public Node find(int val){

        Node node=head;
        while(node!=null){
            if(node.val==val){
                return node;
            }
            node=node.next;
        }
        return null;

    }
    public void insert(int after,int val){
        Node p=find(after);
        if(p==null){
            System.out.println("Does not exist");
            return;
        }
        Node node=new Node(val);
        node.next=p.next;
        p.next=node;
        node.prev=p;
        if(node.next!=null){
            node.next.prev=node;
        }




    }

    private class Node{
        int val;
        Node prev;
        Node next;
        public Node(int val){
            this.val=val;

        }
        public Node(int val,Node prev,Node next){
            this.val=val;
            this.prev=prev;
            this.next=next;

        }

    }
}
