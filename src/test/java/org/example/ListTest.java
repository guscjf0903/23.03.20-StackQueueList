package org.example;

import org.junit.jupiter.api.Test;

class ListTest {
    @Test
    void test(){
        //리스트 100% 만들기
        // 클래스, 메서드 커버리지
        List_m a = new List_m(10);
        a.addFirst(1);
        a.clear();
        a.add(0,1);
        a.add(1,2);
        a.addLast(3);
        a.val_remove(1);
        System.out.println(a.get(2));
        a.set(0,5);
        System.out.println(a.indexOf(5));
        System.out.println(a.contains(5));
        System.out.println(a.size());
        a.show_arr();
        System.out.println(a.indexOf(100));
        System.out.println(a.contains(23));

        //라인 커버리지
        List_m c = new List_m(10);
        c.addFirst(1);
        c.addFirst(1);
        c.addFirst(1);
        c.addFirst(1);
        c.addFirst(1);
        c.addFirst(1);
        c.addFirst(1);
        c.addFirst(1);
        c.addFirst(1);
        c.addFirst(1);
        c.addFirst(1);
        a.add(9,3);// 배열이 꽉찼을때


        //리스트 예외
        List_m d = new List_m(10);
        d.add(11,3);
        d.remove(13);
        System.out.println(d.get(123));
        d.set(123,3);



        //스택 100% 만들기
        Stack_m as = new Stack_m();
        as.push(1);
        as.push(2);
        System.out.println(as.peek());
        as.show_Stack();
        as.pop();
        as.show_Stack();

        //스택예외
        Stack_m bs = new Stack_m();
        bs.peek();
        bs.pop();


        //큐 100% 만들기
        Queue_m aq = new Queue_m();
        aq.add(3);
        aq.add(4);
        aq.poll();
        aq.add(5);
        aq.show_queue();

    }
}