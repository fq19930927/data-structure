package com.example.datastructure.linklist.leetcode;

/**
 * @author fuqiang
 * @version Solution, v0.1 2018/11/12 20:12
 */
public class Solution {

    public ListNode removeElements(ListNode head, int val) {

        // 判断头结点是否为要删除的值val，用while循环是防止头结点和next节点值都为要删除的值val
        while (head != null && head.val == val) {
            ListNode delNode = head;
            head = head.next;
            delNode.next = null;
        }

        // 如果已经不存在节点，则返回
        if (head == null) {
            return head;
        }

        // 将head节点赋值给prev节点
        ListNode prev = head;
        // 当prev节点的下一个节点不为空进行循环判断
        while (prev.next != null) {
            if (prev.next.val == val) {
                // 当next节点的值等于我们要删除的值，则将引用引向下一个节点
                ListNode delNode = prev.next;
                prev.next = delNode.next;
                // 将next节点置为空方便gc回收
                delNode.next = null;
            } else {
                prev = prev.next;
            }
        }

        return head;
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 6, 3, 4, 5, 6};
        ListNode head = new ListNode(nums);
        System.out.println(head);

        ListNode res = (new Solution()).removeElements(head, 6);
        System.out.println(res);
    }
}
