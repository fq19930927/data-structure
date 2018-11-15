package com.example.datastructure.bst;

import com.alibaba.fastjson.JSON;

/**
 * @author fuqiang
 * @version BST, v0.1 2018/11/14 21:49
 */
public class BST<E extends Comparable<E>> {

    private class Node {

        private E e;
        private Node left, right;

        public Node(E e) {
            this.e = e;
            left = null;
            right = null;
        }

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

    /**
     * 二分搜索树添加节点
     */
    public void add(E e) {
        if (root == null) {
            root = new Node(e);
            size ++;
        }
        root = add(root, e);

    }

    /**
     * 向以node为根的二叉树中添加元素,递归算法
     * @param node
     * @param e
     */
    private Node add(Node node, E e) {
        if(node == null){
            size ++;
            return new Node(e);
        }

        if(e.compareTo(node.e) < 0)
            node.left = add(node.left, e);
        else if(e.compareTo(node.e) > 0)
            node.right = add(node.right, e);

        return node;
    }
}
