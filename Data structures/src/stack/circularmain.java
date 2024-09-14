package stack;

public class circularmain {
    public static void main(String[] args) {
        circularqueue queue=new circularqueue(5);
        queue.insert(34);
        queue.insert(56);
        queue.insert(34);
        queue.insert(677);
        queue.insert(389);
        queue.display();



    }
}
