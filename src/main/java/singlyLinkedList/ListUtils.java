package singlyLinkedList;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * 类的描述
 *
 * @author yanghaolei
 * @date 下午 8/2/21 14:32
 */

public class ListUtils {

    public static List<Integer> out(ListNode head) {
        List<Integer> a = Lists.newArrayList();
        ListNode post = null;
        while (head != null) {
            post = head.next;
            a.add(head.val);
            head = post;
        }
        return a;
    }

    public static int getLength(ListNode head){
        int length = 0;
        while (head !=null){
            length ++ ;
            head = head.next;
        }
        return length;
    }

}
