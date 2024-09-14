/*package Linkedlist;

public class linkedlist {

    private Node head;
    private Node tail;
    private int size;

    public linkedlist(){
        this.size=0;
    }
    public void insertFirst(int val){
        Node node=new Node(val);
        node.next=head;
        head=node;
        if(tail==null){
            tail=head;
        }
        size+=1;
    }
    public void insert(int val,int index){
        if(index==0){
            insertFirst(val);
            return;
        }
        if(index==size){
            insertLast(val);
            return;
        }
        Node temp=head;
        for(int i=1;i<index;i++){
            temp=temp.next;
        }
        Node node =new Node(val,temp.next);
        temp.next=node;
        size++;


    }
    public void insertLast(int val){
        if(tail==null){
            insertFirst(val);
            return ;
        }
        Node node=new Node(val);
        tail.next=node;
        tail=node;
        size++;
    }
    public void insertRec(int val,int index){
        head=insertRec(val,index,head);
    }
    private Node insertRec(int val,int index,Node node){
        if(index==0){
            Node temp=new Node(val,node);
            size++;
            return temp;
        }
        node.next=insertRec(val,index--,node.next);
        return node;

    }

    public int deleteFirst(){
        int val=head.value;
        head=head.next;
        size--;
        return val;
    }
    public int deleteLast(){
        if(size<=1){
            return deleteFirst();
        }
        Node secondLast=get(size-2);
        int val=tail.value;
        tail=secondLast;
        tail.next=null;
        return val;
    }
    public int delete(int index){
        if(index==0){
            return deleteFirst();
        }
        if(index==size-1){
            return deleteLast();
        }
        Node prev=get(index-1);
        int val=prev.next.value;
        prev.next=prev.next.next;
        return val;



    }

    //questions
    //remove duplicates
    public void removeDuplicates() {
        Node node = head;
        while (node.next != null) {
        if (node.value == node.next.value) {
            node.next = node.next.next;
            size--;
        } else {
            node = node.next;
        }
        }
        
        tail=node;
        tail.next=null;

    }
    public static linkedlist merge(linkedlist first,linkedlist second){
        Node f=first.head;
        Node s=second.head;
        linkedlist ans=new linkedlist();
        while(f!=null && s!=null){
            if(f.value<s.value){
                ans.insertLast(f.value);
                f=f.next;
            }
            else{
                ans.insertLast(s.value);
                s=s.next;
            }
        }
        while(f!=null){
            ans.insertLast(f.value);
            f=f.next;
        }
        while(s!=null){
            ans.insertLast(s.value);
            s=s.next;
        }
        return ans;
    }


    public void bubblesort(int row,int col){
        if(row==0){
            return ;
        }
        if(col<row){
            Node first=get(col);
            Node second=get(col+1);

            if(first.value>second.value){
                //swap
                if(first==head){
                    head=second;
                    first.next=second.next;
                    second.next=first;
                }
                else if(second==tail){
                    Node prev=get(col-1);
                    prev.next=second;
                    tail=first;
                    first.next=null;
                    second.next=tail;
                }
                else{
                    Node prev=get(col-1);
                    prev.next=second;
                    first.next=second.next;
                    second.next=first;


                }

            }
            bubblesort(row,col+1);
        }
        else{
            bubblesort(row-1,0);

        }
    }
    //recursive reverse of a linked list
    private void reverse(Node node){
        if(node==tail){
            head=tail;
            return;
        }
        reverse(node.next);
        tail.next=node;
        tail=node;
        tail.next=null;
    }

//reversal of the linked list ---->

    /*public void reverse(Node head){
        if(size<2){
            return;
        }
        Node prev=null;
        Node present=head;
        Node next=present.next;

        while(present !=null) {
            present.next = prev;
            prev = present;
            present = next;
            if (next != null) {
                next = next.next;
            }
        }
        head=prev;

        }

        //reverse in between of a linkedlist

    public Node reverseBetween(Node head, int left, int right) {
                if(left==right){
                    return head;

                }

                //skip the first left-1 nodes
                Node present=head;
                Node prev=null;
                for(int i=0;i<left-1 && present!=null ;i++){
                    prev=present;
                    present=present.next;

                }
                Node last=prev;
                Node newEnd=present;
                // reverse between left and right

        Node next=present.next;
        for(int i=0;present!=null && i<right-left+1 ;i++){
            present.next=prev;
            prev=present;
            present=next;
            if(next!=null){
                next=next.next;
            }
        }

        if(last!=null){
            last.next=prev;
        }
        else{
          head=prev;
        }
        newEnd.next=present;
        return head;



    }


    //reverse nodes in k group

    public ListNode reverseKGroup(ListNode head, int k) {
        if(k<=1 || head=null)
        {
            return head;
        }

        ListNode present=head;
        ListNode prev=null;

        while(true) {

            Node last = prev;
            Node newEnd = present;
            // reverse between left and right

            //can modify reversing the <k end items

            Node next = present.next;
            for (int i = 0; present != null && i < k; i++) {
                present.next = prev;
                prev = present;
                present = next;
                if (next !=  null) {
                    next = next.next;
                }
            }

            if (last != null) {
                last.next = prev;
            } else {
                head = prev;
            }
            newEnd.next = present;



        }
        return head;

        if(present==null){
            break;
        }
        prev=newEnd;

    }



    //Alternate k groups

    public ListNode reverseAlternateKGroup(ListNode head, int k) {
        if(k<=1 || head=null)
        {
            return head;
        }

        ListNode present=head;
        ListNode prev=null;

        while(present!=null) {

            Node last = prev;
            Node newEnd = present;
            // reverse between left and right

            //can modify reversing the <k end items

            Node next = present.next;
            for (int i = 0; present != null && i < k; i++) {
                present.next = prev;
                prev = present;
                present = next;
                if (next !=  null) {
                    next = next.next;
                }
            }

            if (last != null) {
                last.next = prev;
            } else {
                head = prev;
            }
            newEnd.next = present;

            //skip k nodes
            for(int i=0;current!=null&& i<k;i++){
                prev=current;
                current=current.next;
            }
        }
        return head;



    }
// rotate list

    public ListNode rotateRight(ListNode head,int k){
        if(k<=0 || head==null || head.next==null){
            return head;

        }
        ListNode last=head;
        int length=1;
        while(last.next!=null){
            last=last.next;
            length++;
        }

        last.next=head;
        int rotations =k%length;
        int skip=length-rotations;
        ListNode newLast=head;

        for(int i=0;i<skip-1;i++){
            newLast=newLast.next;
        }
        head=newLast.next;
        newLast.next=null;


        return head;
    }

    //palindrome of a linkedlist

    public boolean isPalindrome(Node head){
        Node mid=middleNode(head);
        Node headSecond=reverse(mid);
        Node rereverseHead=headSecond;

        //compare the both halves

        while(head!=null && headSecond!=null){
            if(head.value!=headSecond.value){
                break;

            }
            head=head.next;
            headSecond=headSecond.next;
        }
        reverse(rereverseHead);
        return head==null ||headSecond==null;


    }

    //reorder of the linked list ---->

    public void reorderList(ListNode head){

         if(head==null ||head.next==null){
             return;
         }

         ListNode mid=middleNode(head);
         ListNode hs=reverse(mid);
         ListNode hf=head;

         while(hf!=null && hs!=null){
             ListNode temp=hf.next;
             hf.next=hs;
             hf=temp;

             temp=hs.next;
             hs.next=hf;
             hs=temp;

         }

         //next of tail to null
         if(hf!=null){
             hf.next=null;
         }

    }





    public static void main(String[] args) {
        linkedlist first=new linkedlist();
        linkedlist second=new linkedlist();
        first.insertLast(1);
        first.insertLast(3);
        first.insertLast(6);


        second.insertLast(5);
        second.insertLast(15);
        second.insertLast(25);

        linkedlist ans=linkedlist.merge(first,second);
        ans.display();
    }
    public Node find(int val){

        Node node=head;
        while(node!=null){
            if(node.value==val){
                return node;
            }
            node=node.next;
        }
        return null;

    }
    public Node get(int index){

        Node node=head;
        for(int i=0;i<index;i++){
            node=node.next;
        }
        return node;

    }

    public Node middleNode(Node head) {
        Node fast=head;
        Node slow=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;

    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value+" -->");
            temp=temp.next;
        }
        System.out.println("END");
    }

    public void bubblesort() {
        bubblesort(size-1,0);
    }

    private class Node{
        private int value;
        private Node next;
        public Node(int value){
            this.value=value;


        }
        public Node(int value,Node next){
            this.value=value;
            this.next=next;

        }

    }

}
*/
