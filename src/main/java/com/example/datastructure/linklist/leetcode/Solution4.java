package com.example.datastructure.linklist.leetcode;

/**
 * @author fuqiang
 * @version Solution4, v0.1 2018/11/12 20:35
 */
public class Solution4 {
    public ListNode removeElements(ListNode head, int val) {

        if(head == null)
            return head;

        head.next = removeElements(head.next, val);
        return head.val == val ? head.next : head;
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 6, 3, 4, 5, 6};
        ListNode head = new ListNode(nums);
        System.out.println(head);

        ListNode res = (new Solution4()).removeElements(head, 6);
        System.out.println(res);
    }

}
