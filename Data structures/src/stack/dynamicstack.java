package stack;

public class dynamicstack extends Customstack{
    public dynamicstack(){
        super(); //it will call customstack()
    }
    public dynamicstack(int size){
        super(size); //it will call customstack(int size)
    }
    @Override
    public boolean push(int item) {
        if (this.isFull()) {

            int[] temp = new int[data.length * 2];
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];

            }
            data = temp;
        }
        //insert item at this point
        return super.push(item);
    }
}
