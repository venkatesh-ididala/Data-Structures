package stack;

import java.util.LinkedList;
import java.util.Queue;



    public class Inbuiltexamples {
        public static void main(String[] args) {
         /*   Stack<Integer> stack =new Stack<>();

            stack.push(23);
            stack.push(56);
            stack.push(78);
            stack.push(2);

            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop());

          */
            Queue<Integer> queue=new LinkedList<>();
            queue.add(3);
            queue.add(13);
            queue.add(323);
            queue.add(34);
            queue.add(35);

            //System.out.println(queue.peek());  ---->the first element in the queue

            System.out.println(queue.remove());
            System.out.println(queue.remove());






        }

    }

