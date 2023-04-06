package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class List_mTest {
    @Test
    void test(){
        //리스트 100% 만들기
        List_m a = new List_m();
        //스택 100% 만들기
        Stack_m b = new Stack_m();
        b.push(1);
        b.push("asd");
        assertEquals(b.size(),2);
        System.out.println(b.peek());
        b.pop();
        b.show_Stack();
    }
}