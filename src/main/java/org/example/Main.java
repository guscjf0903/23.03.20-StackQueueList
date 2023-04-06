package org.example;

import java.util.*;


public class Main {
    public static void main(String[] args) {
        List_m a = new List_m();
        Stack_m b = new Stack_m();
        b.push(1);
        b.push("asd");
        b.push(890);
        System.out.println(b.size());
        System.out.println(b.peek());
        b.pop();
        b.pop();
        b.show_Stack();

        //System.arraycopy();


    }
}
