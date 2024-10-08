package stack;

public class circularqueue {
    protected int[] data;
    private static final int DEFAULT_SIZE=10;
   protected int end=0;
    protected int front=0;
    private int size=0;


    public circularqueue(){
        this(DEFAULT_SIZE);
    }
    public circularqueue(int size){
        this.data=new int[size];
    }
    public boolean isFull(){
        return size==data.length;  //ptr is at last index

    }
    private boolean isEmpty(){
        return size==0;
    }
    public boolean insert(int item){
        if(isFull()){
            return false;

        }


        data[end++]=item;
        end=end%data.length;
        size++;
        return true;
    }
    public int remove() throws Exception{
        if(isEmpty()){
            throw new Exception("queue is empty");
        }
        int removed=data[front++];
        front=front%data.length;
        size--;


        return removed;
    }
    public void display(){
        if(isEmpty()){
            System.out.println("empty");
        }
        int i=front;
        do{
            System.out.print(data[i]+" ");
            i++;
            i%=data.length;

        }while(i!=end);

        System.out.println("END");
    }
    public int front() throws Exception {
        if (isEmpty()) {
            throw new Exception("queue is empty");
        }
        return data[front];
    }

}
