package com.example.datastructure.bst;

/**
 * @author fuqiang
 * @version BST, v0.1 2018/11/14 21:49
 */
public class BST<E extends Comparable<E>> {

    private class Node {

        private E e;
        private Node left, right;

    }

    private Node root;
    private int size;

    public BST() {
        root = null;
        size = 0;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }
}
