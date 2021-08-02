package com.zhsheng.rumen.addtwonumbers;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        // 递归
        //return atn(l1,l2,0);


        // 定义一个头节点和一个尾结点
        ListNode head = null;
        ListNode tail = null;
        int carry = 0;

        while (l1 != null || l2 != null ) {
            int n = null == l1 ? 0 : l1.val;  // l1的第一个值，不足的位用0填充
            int m = null == l2 ? 0 : l2.val;  // l2的第一个值，不足的位用0填充

            int sum = n + m + carry;
            if (null == head) {
                head = tail = new ListNode(sum % 10);
            } else {
                tail.next = new ListNode(sum % 10);
                tail = tail.next;
            }
            carry = sum / 10;
            if (null != l1) {
                l1 = l1.next;
            }
            if (null != l2) {
                l2 = l2.next;
            }
        }
        if (carry > 0) {
            tail.next = new ListNode(carry);
        }

        return head;
    }

    private ListNode atn(ListNode l1, ListNode l2, int i) {
        if (null == l1 && null == l2 && 0 == i) {
            return null;
        }

        // 当前位的值
        int sum = ((null == l1) ? 0 : l1.val) + (null == l2 ? 0 : l2.val) + i;

        ListNode node = new ListNode(sum % 10);
        node.next = atn(null == l1 ? null : l1.next, null == l2 ? null : l2.next, sum / 10);
        return node;
    }

    public static void main(String[] args) {



    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}