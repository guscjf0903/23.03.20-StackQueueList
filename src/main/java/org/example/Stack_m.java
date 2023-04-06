package org.example;

class Stack_m extends List_m {
    int top;

    //private static final int DEFAULT_NUM = 10;
    public Stack_m() {
        super.array = new Object[DEFAULT_NUM];
        super.size = 0;
        this.top = 0;
    }

    public void push(Object value) {
        super.addLast(value);
    }

    public void pop() {
        if (size <= 0) {
            throw new IndexOutOfBoundsException();
        }
        array[size - 1] = null;
        size--;
        super.resize();
    }

    public Object peek() {
        if (size <= 0) {
            throw new IndexOutOfBoundsException();
        }
        return array[size - 1];
    }

    public void show_Stack() {
        super.show_arr();
    }

}
