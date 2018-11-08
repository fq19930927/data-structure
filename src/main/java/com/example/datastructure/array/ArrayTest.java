package com.example.datastructure.array;

/**
 * @author fuqiang
 * @version ArrayTest, v0.1 2018/11/8 21:10
 */
public class ArrayTest {

    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i<arr.length; i++) {
            arr[i] = i;
            System.out.println(arr[i]);
        }

        String[] arr2 = new String[]{"aaa", "bbb", "ccc"};
        for (String str: arr2) {
            System.out.println(str);
        }

    }
}
