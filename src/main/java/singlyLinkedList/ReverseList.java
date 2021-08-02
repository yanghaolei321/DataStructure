package singlyLinkedList;

/**
 * 类的描述
 *
 * @author yanghaolei
 * @date 下午 8/2/21 09:48
 */

public class ReverseList {

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

}
