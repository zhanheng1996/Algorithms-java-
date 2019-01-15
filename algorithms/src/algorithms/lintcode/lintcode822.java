package algorithms.lintcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class lintcode822 {

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    /**
     * @param head: the given linked list
     * @return: the array that store the values in reverse order
     */
    public List<Integer> reverseStore(ListNode head) {
        // write your code here
        if (head == null)
            return null;
        List<Integer> result = new ArrayList<>();
        while (head != null) {
            result.add(head.val);
            head = head.next;
        }
        Collections.reverse(result);
        return result;
    }
}
