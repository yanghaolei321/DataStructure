package singlyLinkedList;

import java.util.List;

/**
 * 类的描述
 *
 * @author yanghaolei
 * @date 下午 8/2/21 14:31
 */

public class IntersactionList {


    /**
     * 160 链表相交
     *
     * @param headA
     * @param headB
     * @return
     */
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        int alength = ListUtils.getLength(headA);
        int blength = ListUtils.getLength(headB);

        if(alength>blength){
            headA = forward(headA,alength-blength);
        }else {
            headB = forward(headB,blength-alength);
        }

        while (headA!=headB){
            headA = headA.next;
            headB = headB.next;
        }

        return headA;
    }

    private static ListNode forward(ListNode head, int gap){
        for(int i = 0;i<gap;i++){
            head = head.next;
        }
        return head;

    }

}
