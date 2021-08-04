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


    /**
     * 2 两数之和
     *
     * @param l1
     * @param l2
     * @return
     */
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        int length1 = getLength(l1);
        int length2 = getLength(l2);
        if(length1>length2){
            increList(l2,length1-length2);
        }else{
            increList(l1,length2-length1);
        }

        ListNode head = new ListNode();
        ListNode tail = head;
        ListNode cur1 = l1;
        ListNode cur2 = l2;


        int carry = 0 ;

        while(cur1!=null){
            int n1 = (l1!=null)?cur1.val:0;
            int n2 = (l2!=null)?cur2.val:0;
            tail.next = new ListNode( (n1 + n2 + carry)%10);
            tail = tail.next;

            if(n1+ n2 >= 10){
                carry = 1 ;
            } else {
                carry = 0;
            }
            cur1 = cur1.next;
            cur2 = cur2.next;
        }

        if(carry!=0){
            tail.next = new ListNode(0);
        }
        return head.next;
    }

    private static ListNode reverseListNode(ListNode head){
        ListNode newHead = new ListNode();
        ListNode post;
        ListNode cur = head;
        while (cur!=null){
           post = cur.next;
           cur.next = newHead;
           newHead = newHead.next;
           cur = cur.next;
        }
        return cur;
    }


    /**
     * 19 删除链表的倒数第N个结点快慢指针
     *
     * @param head
     * @param n
     * @return
     */
    public static ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode dummy = head;
        ListNode fast = dummy;
        ListNode slow = dummy;

        if(head == null) return head;

        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }

        while(fast.next!=null) {

            fast = fast.next;
            slow = slow.next;

        }

        slow.next = slow.next.next;
        return dummy.next;

    }


    private static int getLength(ListNode head){
        int length = 0;
        while(head!=null){
            head = head.next;
            length++;
        }
        return length;
    }

    private static void increList(ListNode head,int diff){
        while(head.next!=null){
            head = head.next;
        }
        for(int i = 0;i<diff;i++){
            head.next = new ListNode(0);
            head = head.next;
        }

    }

}
