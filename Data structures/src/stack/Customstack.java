package stack;

public class Customstack {
    protected int[] data;
    private static final int DEFAULT_SIZE=10;
    int ptr=-1;


    public Customstack(){
        this(DEFAULT_SIZE);
    }
    public Customstack(int size){
        this.data=new int[size];
    }
    public boolean push(int item){
        if(isFull()){
            System.out.println("stack is full");
            return false;
        }
        ptr++;
        data[ptr]=item;
        return true;
    }
    public boolean isFull(){
        return ptr==data.length-1;  //ptr is at last index

    }
    public int pop() throws StackException{
        if(isEmpty()){
            throw new StackException("cannot remove from empty stack");
        }
       // int removed=data[ptr];
        //ptr--;
        //return removed;
        return data[ptr--];
    }
    public int peek() throws StackException{
        if(isEmpty()){
            throw new StackException("cannot peek from the empty Stack");
        }
        return data[ptr];
    }
    private boolean isEmpty(){
        return ptr==-1;
    }

}
