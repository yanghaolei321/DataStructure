package singlyLinkedList;

/**
 * 类的描述
 *
 * @author yanghaolei
 * @date 下午 8/2/21 09:46
 */

public class ListNode {

    int val;
    ListNode next;
    ListNode(){};
    ListNode(int val,ListNode next){
        this.val = val;
        this.next = next;
    }
    ListNode(int val){
        this.val = val;
    }

    @Override
    public String toString() {
        return "cur " + this.val + "post " + this.next.val;
    }
}
