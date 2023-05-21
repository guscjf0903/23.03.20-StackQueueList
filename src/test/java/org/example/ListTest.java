package org.example;

import org.junit.jupiter.api.Test;



import static org.junit.jupiter.api.Assertions.*;

class ListTest {
    @Test
    public void testAddGet(){
        //리스트 입출력,resize테스트
        List<Integer> listinout = new List<>();
        listinout.add(1);
        assertEquals(listinout.get(0),1);
        listinout.addFirst(2);
        listinout.addlast(3);
        listinout.add(0,4);
        listinout.add(5);
        listinout.add(6);
        listinout.add(6,7);
        listinout.add(8);
        listinout.add(9);
        listinout.add(10);
        listinout.add(10,11);
        assertEquals(listinout.get(10),11);
        assertEquals(listinout.size(),11);
        listinout.showarr();
        //인덱스가 없는 부분에 추가
        assertThrows(IndexOutOfBoundsException.class,()-> listinout.add(20,1));
        //add 최대치 resize  (List 클래스 43번째 줄 테스트)
        List<Integer> listnum = new List<>(5);
        listnum.add(1);
        listnum.add(2);
        listnum.add(3);
        listnum.add(4);
        listnum.add(5);
        listnum.add(6);
        listnum.add(7);
        listnum.add(8);
        listnum.add(9);
        listnum.add(10);
        //List 클래스 54번째 줄 테스트
        List<Integer> listnum2 = new List<>();
        listnum2.add(1);
        listnum2.add(2);
        listnum2.add(3);
        listnum2.add(4);
        listnum2.add(5);
        listnum2.add(6);
        listnum2.add(7);
        listnum2.add(8);
        listnum2.add(9);
        listnum2.add(9,10);

    }
    @Test
    public void testRemoveClear(){
        List<Character> listremove = new List<>();

        listremove.add('a');
        listremove.add('b');
        listremove.add('c');
        listremove.remove(2);
        assertEquals(listremove.get(0),'a');
        assertEquals(listremove.get(1),'b');
        assertEquals(listremove.size(),2);

        //clear 테스트
        listremove.clear();
        assertNull(listremove.get(0));

        //원하는 값 삭제 테스트
        listremove.add('a');
        listremove.add('b');
        listremove.add('c');
        listremove.valremove('b');
        assertEquals(listremove.get(0),'a');
        assertEquals(listremove.get(1),'c');
        //값이 없을 때 삭제
        listremove.clear();
        assertThrows(IndexOutOfBoundsException.class,()-> listremove.remove(-1));
        assertThrows(IndexOutOfBoundsException.class,()-> listremove.remove(0));
        assertThrows(IndexOutOfBoundsException.class,()-> listremove.remove(1));
    }
    @Test
    public void testSetGet(){
        //Set
        List<Integer> listsetget = new List<>();
        listsetget.add(1);
        listsetget.add(2);
        listsetget.add(3);
        listsetget.set(0,5);
        assertEquals(listsetget.get(0),5);
        //인덱스가 없는 부분 수정
        assertThrows(IndexOutOfBoundsException.class,()-> listsetget.set(-1,5));
        assertThrows(IndexOutOfBoundsException.class,()-> listsetget.set(4,5));
        //인덱스가 없는 부분 get
        assertThrows(IndexOutOfBoundsException.class,()-> listsetget.get(4));
        assertThrows(IndexOutOfBoundsException.class,()-> listsetget.get(-1));
    }
    @Test
    public void testIndexofContain(){
        //IndexOf
        List<Integer> listindexcontain = new List<>();
        listindexcontain.add(1);
        listindexcontain.add(2);
        listindexcontain.add(3);
        assertEquals(listindexcontain.indexOf(1),0);
        assertEquals(listindexcontain.indexOf(2),1);
        assertEquals(listindexcontain.indexOf(4),-1);
        //Contain
        assertTrue(listindexcontain.contains(1));
        assertTrue(listindexcontain.contains(2));
        assertFalse(listindexcontain.contains(4));
    }
}

class StackTest{
    @Test
    void stackPushPop(){
        Stack<Integer> stackpushpop = new Stack<>();
        Stack<Integer> stackpushpopnum = new Stack<>(5);
        stackpushpop.push(1);
        stackpushpop.push(2);
        stackpushpop.push(3);
        stackpushpop.push(4);
        assertEquals(stackpushpop.get(3),4);
        assertEquals(stackpushpop.size(), 4);
        assertEquals(stackpushpop.peek(), 4);
        stackpushpop.showStack();
        stackpushpopnum.add(1);
        //pop
        stackpushpop.pop();
        stackpushpop.pop();
        assertEquals(stackpushpop.peek(), 2);
        stackpushpop.pop();
        stackpushpop.pop();
        //더이상 pop,peek할께 없을때
        assertThrows(IndexOutOfBoundsException.class,()-> stackpushpop.pop());
        assertThrows(IndexOutOfBoundsException.class,()-> stackpushpop.peek());
    }
}
class QueueTest{
    @Test
    void queueEnqDeq(){
        Queue<Character> queue = new Queue<>();
        queue.enqueue('a');
        queue.enqueue('b');
        queue.enqueue('c');
        assertEquals(queue.get(2),'a');
        assertEquals(queue.get(1),'b');
        assertEquals(queue.get(0),'c');
        queue.dequeue();
        assertEquals(queue.get(0),'c');
        assertEquals(queue.get(1),'b');
        queue.showqueue();

    }
}