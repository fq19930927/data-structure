package com.example.datastructure.array;

/**
 * @author fuqiang
 * @version ArrayTest, v0.1 2018/11/8 21:10
 */
public class ArrayTest {

    public static void main(String[] args) {

        Array<Integer> array = new Array();
        for (int i = 0; i < array.getCapacity(); i++) {
            array.addLast(i);
        }
        System.out.println(array);

        array.add(1, 100);
        System.out.println(array);

        array.addFirst(-1);
        System.out.println(array);

        array.remove(2);
        System.out.println(array);

        array.removeFirst();
        System.out.println(array);

        /*int[] arr = new int[10];
        for (int i = 0; i<arr.length; i++) {
            arr[i] = i;
            System.out.println(arr[i]);
        }

        String[] arr2 = new String[]{"aaa", "bbb", "ccc"};
        for (String str: arr2) {
            System.out.println(str);
        }*/

    }
}
