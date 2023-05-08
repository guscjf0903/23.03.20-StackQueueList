package org.example;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Stack;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ListTest {
    @Test
    void listtest(){
        //리스트 입출력
        List<Integer> listinout = new List<>();
        listinout.add(1);
        listinout.addFirst(2);
        listinout.addlast(3);
        OutTest.testoutput();
       //String a = listinout.showarr();
        assertEquals(listinout.showarr(),OutTest.getoutput());

    }

}

class OutTest{
    private static final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    public static void testoutput(){
        System.setOut(new PrintStream(outContent));
        System.out.println();
        System.setOut(System.out);
    }
    public static String getoutput(){
        return outContent.toString().trim();
    }
}