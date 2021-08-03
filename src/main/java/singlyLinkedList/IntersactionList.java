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


    /**
     * 142 求环
     *
     * @param head
     * @return
     */
    public static ListNode detectCycle(ListNode head) {

        ListNode fast = head.next.next;
        ListNode slow = head.next;
        while (fast!=null & slow!=null &fast!=slow){
            fast = fast.next.next;
            slow = slow.next;
        }

        if(fast!=null){
            ListNode backup = head;
            while(backup!=slow){
                backup = backup.next;
                slow = slow.next;
            }
            return backup;
        }

        return null;

    }


    /**
     * 46 链表分区
     *
     * @param head
     * @param x
     * @return
     */
    public static ListNode partition(ListNode head, int x) {


        ListNode phead = new ListNode();
        ListNode nhead =  new ListNode();
        ListNode pcur = phead;
        ListNode ncur = nhead;
        while (head!=null){
            if(head.val<x){
                pcur.next = head;
                pcur =  pcur.next;
            }else {
                ncur.next = head;
                ncur = ncur.next;
            }
            head = head.next;
        }

        pcur.next = null;
        ncur.next = phead.next;
        return nhead.next;
    }


    /**
     * 21 合并有序列表
     *
     * @param l1
     * @param l2
     * @return
     */
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {


        ListNode dummy = new ListNode();
        ListNode dummyCur = dummy;
        while(l1!=null&l2!=null){
            if(l1.val<=l2.val){
                dummyCur.next = l1;
                dummyCur = dummyCur.next;
                l1 = l1.next;
            } else{
                dummyCur.next = l2;
                dummyCur = dummyCur.next;
                l2 = l2.next;
            }
        }

        while(l1!=null){
            dummyCur.next = l1;
            dummyCur = dummyCur.next;
            l1 = l1.next;
        }

        while(l2!=null){
            dummyCur.next = l2;
            dummyCur = dummyCur.next;
            l2 = l2.next;
        }

        return dummy.next;
    }


    private static ListNode forward(ListNode head, int gap){
        for(int i = 0;i<gap;i++){
            head = head.next;
        }
        return head;

    }

}
