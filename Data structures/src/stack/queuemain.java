package stack;

public class queuemain {
    public static void main(String[] args)  throws Exception{
        customQueue queue=new customQueue(5);
        queue.insert(23);
        queue.insert(5);
        queue.insert(67);
        queue.insert(98);

        queue.display();
        System.out.println(queue.pop());
        queue.display();

    }
}
