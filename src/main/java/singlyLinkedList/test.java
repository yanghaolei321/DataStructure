package singlyLinkedList;

/**
 * 类的描述
 *
 * @author yanghaolei
 * @date 下午 8/2/21 09:48
 */

public class test {

    public static void main(String[] args) {


        ListNode e = new ListNode(5);
        ListNode d = new ListNode(4,e);
        ListNode c = new ListNode(3,d);
        ListNode b = new ListNode(2,c);
        ListNode a = new ListNode(1,b);






        //e.next = b;


//        ListNode result = ReverseList.reverseList(a);
//        System.out.println(result);

//        ListNode result = ReverseList.reverseBetween(a,2,4);
//        System.out.println(ListUtils.out(result));

//        ListNode result = IntersactionList.getIntersectionNode(a,g);
//        System.out.println(result);

//        ListNode ret = IntersactionList.detectCycle(a);

//        ListNode ret = IntersactionList.partition(a,3);
//        System.out.println(ret);


        ListNode ret =  ReverseList.removeNthFromEnd(a,2);
        System.out.println(ListUtils.out(ReverseList.addTwoNumbers(a,d)));
    }
}
