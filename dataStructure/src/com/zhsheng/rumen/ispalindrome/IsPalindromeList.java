package com.zhsheng.rumen.ispalindrome;

/**
 * @program: Data-Structure
 * @className: IsPalindrome
 * @description: 回文链表
 * @author: zhangsheng
 * @date: 2021年08月16日 21:09
 **/
public class IsPalindromeList {

    public static boolean isPalindrome(ListNode head) {
        // 定义慢节点，一次走一步
        ListNode slow = head;
        // 定义快节点，一次走两步
        ListNode fast = head;

        // 定义一个翻转链表
        ListNode pre = head;
        // 定义一个 临时节点 listNode
        ListNode prepre = null;

        while (fast != null && fast.next != null) {
            pre = slow;

            slow = slow.next;
            fast = fast.next.next;

            pre.next = prepre;
            prepre = pre;
        }

        if (null != fast) {
            // 当快的节点走到尾部的时候，慢节点在中心位置
            slow = slow.next;
        }

        while (pre!= null && slow != null) {
            if (pre.val != slow.val) {
                return false;
            }
            pre = pre.next;
            slow = slow.next;
        }
        return true;
    }


    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
//        listNode.next.next = new ListNode(2);
//        listNode.next.next.next = new ListNode(1);
        System.out.println(IsPalindromeList.isPalindrome(listNode));
    }



    public static class ListNode {
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
}
