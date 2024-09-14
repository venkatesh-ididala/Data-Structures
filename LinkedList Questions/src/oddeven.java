public class oddeven {
    Node head;
    Node tail;


        public static void main(String[] args) {
            linkedlist ll=new linkedlist();
            ll.insertFirst(10);
            ll.display();
            ll.insertLast(20);
            ll.insertLast(30);
            ll.insertLast(40);
            ll.insertLast(50);
            ll.display();
            


        }

    class Node{
        int val;
        Node next;

        Node(int val, linkedlist.Node next){
            this.val=val;

        }
        Node(int val){
            this.val=val;
        }
    }

}

