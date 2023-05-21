package org.example;

class Stack<T> extends List {
    int top;

    public Stack() {
        super();
        this.top = 0;
    }
    public Stack(int l_size) {
        super(l_size);
        this.top = 0;
    }

    public void push(T value) {
        super.addlast(value);
        top++;
    }

    public void pop() {
        if (size <= 0) {
            throw new IndexOutOfBoundsException();
        }
        array[top - 1] = null;
        top--;
        size--;
        super.resize();
    }

    public Object peek() {
        if (size <= 0) {
            throw new IndexOutOfBoundsException();
        }
        return array[top - 1];
    }

    public void showStack() {
        super.showarr();
    }

}
