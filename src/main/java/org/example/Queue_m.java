package org.example;

public class Queue_m extends List_m{
    public Queue_m(){
        super();
    }

    public void add(int value){
        super.addFirst(value);
    }
    public void poll(){
        super.remove(this.size);
    }
    public void show_queue(){
        super.show_arr();
    }
}
