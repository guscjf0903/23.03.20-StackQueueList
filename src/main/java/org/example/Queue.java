package org.example;

public class Queue<T> extends List{
    public Queue(){
        super();
    }
    public void enqueue(T value){
        super.addFirst(value);
    }
    public void dequeue(){
        super.remove(this.size - 1);
    }
    public void showqueue(){
        super.showarr();
    }
}
