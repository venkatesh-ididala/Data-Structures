import org.w3c.dom.Node;



public class linkedlist{
    Node tail;

    Node head;
    public void insertFirst(int val){
        Node node=new Node(val);

        node.next=head;
        head=node;
        if(head==null) {
            head = node;
        }

    }
    public void insertLast(int val){
        if(tail==null){
            insertFirst(val);
            return ;
        }
        Node node=new Node(val);
        tail.next=node;
        tail=node;
    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+" -->");
            temp=temp.next;
        }
        System.out.println("END");
    }

    public Node oddsevens(Node head){
        Node odd=head;
        Node even=head.next;
        Node evenHead=head.next;
        while(even!=null && even.next!=null){
            odd.next=odd.next.next;
            even.next=even.next.next;

            odd=odd.next;
            even=even.next;
        }
        odd.next=evenHead;
        return head;



    }

    class Node{
        int val;
        Node next;

        Node(int val,Node next){
            this.val=val;
            this.next=next;

        }
        Node(int val){
            this.val=val;
        }
    }


}
