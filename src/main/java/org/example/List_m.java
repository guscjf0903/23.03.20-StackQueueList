package org.example;

import java.util.Arrays;

public class List_m {
    protected static final int DEFAULT_NUM = 10;
    //private static final Object[] EMPTY_ARR = {};
    int size;
    Object[] array;

    public List_m() { // 초반에 할당범위가 없을때
        this.size = 0;
        this.array = new Object[DEFAULT_NUM];
    }

    public List_m(int l_size) { //원하는 할당범위가 있을때
        this.size = 0;
        this.array = new Object[l_size];
    }

    public void resize() { //사이즈가 범위를 넘어서 커지거나 작아지면 조정하는 메서드
        int array_size = array.length;
        if (size == array_size) {  // 배열이 전부 꽉차면
            int new_arrsize = array_size * 2;
            array = Arrays.copyOf(array, new_arrsize);
            return;
        }
        if (size < (array_size / 2)) {
            int new_arrsize = array_size / 2;
            array = Arrays.copyOf(array, Math.max(new_arrsize, DEFAULT_NUM)); //디폴트 10 보단 커야한다.
            return;
        }
        return;
    }

    // 추가 메서드.. 끝에추가, 처음에추가, 중간에 추가 3가지로 나뉘어서 만듬
    public void addLast(Object value) { //끝에 추가
        if (size == array.length) { // 크기확인
            resize();
        }
        array[size] = value;
        size++;
    }

    public void add(int idx, Object value) { // 중간에 추가
        if (idx > size || idx < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (idx == size) {
            addLast(value);
        } else {
            if (size == array.length) {
                resize();
            }

            for (int i = size; i > idx; i--) { //원하는 인덱스부분에 add
                array[i] = array[i - 1];
            }
            array[idx] = value;
            size++;
        }
    }

    public void addFirst(Object value) {// 맨처음에 추가
        add(0, value);
    }

    //삭제구현 삭제는 맨뒤에 있는 값삭제,특정값삭제, 특정인덱스삭제로 나뉜다

    public void remove(int idx) {
        if (idx >= size || idx < 0) {
            throw new IndexOutOfBoundsException();
        }
        for (int i = idx; i < size - 1; i++) {
            array[i] = array[i + 1];
            array[i + 1] = null;
        }
        size--;
        resize();
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            array[i] = null;
        }
    }

    public void val_remove(Object value) {
        int idx;
        for (int i = 0; i < size; i++) {
            if (array[i] == value) {
                idx = i;
                remove(idx);
            }
        }
    }

    public Object get(int idx) {
        if (idx >= size || idx < 0) {
            throw new IndexOutOfBoundsException();
        }
        return array[idx];
    }

    public void set(int idx, Object value) {
        if (idx >= size || idx < 0) {
            throw new IndexOutOfBoundsException();
        }
        array[idx] = value;
    }

    public int indexOf(Object value) {
        for (int i = 0; i < size; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public boolean contains(Object value) {
        for (int i = 0; i < size; i++) {
            if (array[i] == value) {
                return true;
            }
        }
        return false;
    }

    public int size() {
        return size;
    }

    public void show_arr() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

}