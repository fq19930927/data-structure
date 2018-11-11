package com.example.datastructure.queue;

/**
 * @author fuqiang
 * @version Queue, v0.1 2018/11/11 12:38
 */
public interface Queue<E> {

    int getSize();
    boolean isEmpty();

    /**
     * 入队
     * @param e
     */
    void enqueue(E e);

    /**
     * 出队
     * @return
     */
    E dequeue();

    /**
     * 获得队首
     * @return
     */
    E getFront();
}
