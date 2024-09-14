package Generics;

import java.util.Arrays;

public class customArrayList {
    int[] data;
    private static int DEFAULT_SIZE=10;
    private int size=0;
    public customArrayList(){
        this.data=new  int[DEFAULT_SIZE];
    }
    void add(int num){
        if(isFull()){
            resize();
            
        }
        data[size++]=num;
        
    }
    private boolean isFull(){
        return size==data.length;

    }
    private void resize(){
        int[] temp=new int[data.length *2];
        for(int i=0;i<data.length;i++){
            temp[i]=data[i];
        }
        data=temp;
    }
    public int remove(){
        int removed=data[--size];
        return removed;
    }
    public int get(int index){
        return data[index];
    }
    public int size(){
        return size;
    }
    public void set(int index,int value){
        data[index]=value;
    }
    @Override
    public String toString(){
        return "customArrayList{"+
                "data="+ Arrays.toString(data)+
                "size="+size+
                "}";
    }

    public static void main(String[] args) {
        customArrayList list=new customArrayList();
        list.add(2);
        list.add(5);
        list.add(6);

        System.out.println(list);
    }



}
