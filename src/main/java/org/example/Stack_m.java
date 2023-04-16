package org.example;

class Stack_m extends List_m {
    int top;

    //private static final int DEFAULT_NUM = 10;
    public Stack_m() {
        super();
        super.size = 0;
        this.top = 0;
    }

    public void push(Object value) {
        super.addLast(value);
    }

    public void pop() {
        if (size <= 0) {
            System.out.println("인덱스 벗어남");
            return;
        }
        array[size - 1] = null;
        size--;
        super.resize();
    }

    public Object peek() {
        if (size <= 0) {
            System.out.println("인덱스 벗어남");
            return -1;
        }
        return array[size - 1];
    }

    public void show_Stack() {
        super.show_arr();
    }

}
