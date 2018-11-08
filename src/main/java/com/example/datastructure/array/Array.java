package com.example.datastructure.array;

/**
 * @author fuqiang
 * @version Array, v0.1 2018/11/8 21:13
 */
public class Array {

    private int[] data;
    private int size;

    public Array(int capacity) {
        data = new int[capacity];
        size = 0;
    }

    // 无参数的构造函数, 默认数组的容量capacity=10
    public Array() {
        this(10);
    }

    // 获取数组中元素个数
    public int getSize() {
        return size;
    }

    // 获取数组的容量
    public int getCapacity() {
        return data.length;
    }

    // 返回数组是否为空
    public boolean isEmpty() {
        return size == 0;
    }
}
