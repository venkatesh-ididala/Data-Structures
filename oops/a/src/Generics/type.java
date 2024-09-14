package Generics;
import java.lang.*;
import java.lang.Object;

import interfaces.nested.A;

import java.util.Arrays;

//here T either should be num or subclass of Number
public class type <T extends Number>{

    //wildcards --> type<? extends Number > list=new type<>();
        Object[] data;
        private static int DEFAULT_SIZE=10;
        private int size=0;
        public type(){
            this.data=new  Object[DEFAULT_SIZE];
        }
        void add(T num){
            if(isFull()){
                resize();

            }
            data[size++]=num;

        }
        private boolean isFull(){
            return size==data.length;

        }
        private void resize(){
            Object[] temp=new Object[data.length *2];
            for(int i=0;i<data.length;i++){
                temp[i]= data[i];
            }
            data=temp;
        }
        public T remove(){
            T removed=(T)(data[--size]);  //type casting is provided
            return removed;
        }
        public T get(int index){
            return (T)(data[index]);
        }
        public int size(){
            return size;
        }
        public void set(int index,T value){
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
            type<Integer>  t=new type<Integer>();

            for(int i=0;i<15;i++){
                t.add(2*i);
            }

            System.out.println(t);
        }



    }
