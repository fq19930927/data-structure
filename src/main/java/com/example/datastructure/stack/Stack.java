package com.example.datastructure.stack;

/**
 * @author fuqiang
 * @version Stack, v0.1 2018/11/10 21:33
 */
public interface Stack<E> {

    int getSize();
    boolean isEmpty();
    void push(E e);
    E pop();
    E peek();
}
