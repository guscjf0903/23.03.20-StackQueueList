package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class List_mTest {
    @Test
    void test(){
        //리스트 100% 만들기
        // 예외없음
        List_m a = new List_m();
        List_m b = new List_m(15);
        a.addFirst(1);
        a.clear();
        a.add(0,1);
        a.add(1,2);
        a.addLast(3);
        a.val_remove(1);
        a.get(2);
        a.set(2,5);
        a.indexOf(5);
        a.contains(5);
        a.size();
        a.show_arr();
        //예외
        List_m c = new List_m(3);
        c.addFirst(1);
        c.addFirst(1);
        c.get(1);
        c.indexOf(1);
        c.contains(1);
        b.add(0,3);




        //스택 100% 만들기
        Stack_m d = new Stack_m();
        //d.pop(); 여기 기준으로 밑에는 안돌아가는 듯함
        //d.push(1);
        d.push("asd");
        assertEquals(d.size(),2);
        System.out.println(d.peek());
        d.pop();
        d.show_Stack();
        //예외
    }
}