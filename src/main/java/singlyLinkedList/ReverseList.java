package singlyLinkedList;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * 链表
 *
 * @author yanghaolei
 * @date 下午 8/2/21 09:48
 */

public class ReverseList {

    /**
     * 206 反转链表
     *
     * @param head 头节点
     * @return newHead 新的头节点
     */
    public static ListNode reverseList(ListNode head) {
        ListNode newHead = null;
        ListNode cur = head;
        ListNode post = cur;
        while (cur != null) {
            post = cur.next;
            cur.next = newHead;
            newHead = cur;
            cur = post;
        }
        return newHead;
    }


    /**
     * 96 链表反转2
     *
     * @param head
     * @param left
     * @param right
     * @return
     */
    public static ListNode reverseBetween(ListNode head, int left, int right) {

        ListNode dummyHead = new ListNode(-1);
        dummyHead.next = head;
        ListNode superior = dummyHead;

        // 1. 遍历至m的前一个节点
        for ( int i = 1; i < left; i ++ ) {
            superior = superior.next;
        }

        ListNode prev = null;
        ListNode cur = superior.next;

        // 2. 180°旋转爆炸
        for ( int i = 0; i <= right-left; i ++ ) {
            ListNode next = cur.next;

            cur.next = prev;
            prev = cur;
            cur = next;
        }

        // 3. 修改m和n-m位置处的节点的指向
        superior.next.next = cur;
        superior.next = prev;
        return dummyHead.next;

    }


}
