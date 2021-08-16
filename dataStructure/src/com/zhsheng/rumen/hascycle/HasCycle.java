package com.zhsheng.rumen.hascycle;


import java.util.List;

/**
 * @program: Data-Structure
 * @className: HasCycle
 * @description: 环形链表
 * @author: zhangsheng
 * @date: 2021年08月16日 10:17
 **/
public class HasCycle {

    public static boolean hasCycle(ListNode head) {
        if (null == head || null == head.next) {
            return false;
        }
        ListNode s = head;
        ListNode f = head.next;
        while (s != f) {
            if (null == f || null == f.next) {
                return false;
            }
            s = s.next;
            f = f.next.next;

        }
        return true;
    }

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public static void main(String[] args) {

    }
}


