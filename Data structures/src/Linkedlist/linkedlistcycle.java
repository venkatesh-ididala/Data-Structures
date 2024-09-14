package Linkedlist;

public class linkedlistcycle {


     class ListNode {
         int val;
         ListNode next;

         ListNode(int x) {
             val = x;
             next = null;
         }
     }
    public ListNode detectCycle(ListNode head) {
         int length=0;
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                length=cyclelength(slow);
                break;
            }
        }
        if(length==0){
            return null;
        }
        ListNode f=head;
        ListNode s=head;
        while(length>0){
            s=s.next;
            length--;
        }
        while(f!=s){
            f=f.next;
            s=s.next;
        }
        return s;

    }

        public int cyclelength(ListNode head) {
            ListNode fast=head;
            ListNode slow=head;
            while(fast!=null && fast.next!=null){
                fast=fast.next.next;
                slow=slow.next;
                if(fast==slow){
                    ListNode temp=slow;
                    int length=0;
                    do{
                        temp=temp.next;
                        length++;
                    }while(temp!=slow);
                    return length;
                }
            }
            return 0;

        }
        // happy number question --->
        public boolean isHappy(int n) {
            int slow = n;
            int fast = n;

            do {
                slow = findSquare(n);
                fast = findSquare(findSquare(n));


            } while (slow != fast);
            if (slow == 1) {
                return true;
            }
            return false;
        }
        public int findSquare(int number){
         int ans=0;
         while(number>0){
             int rem=number%10;
             ans+=rem*rem;
             number=number/10;


         }

         return ans;

        }

        //middle of the linked list ---->
        public ListNode middleNode(ListNode head) {
         ListNode fast=head;
         ListNode slow=head;

         while(fast!=null && fast.next!=null){
             slow=slow.next;
             fast=fast.next.next;
         }
         return slow;

        }

    }

