package com.example.datastructure.segmenttree;

/**
 * @author fuqiang
 * @version Merger, v0.1 2018/11/25 15:18
 */
public interface Merger<E> {
    E merge(E a, E b);
}
