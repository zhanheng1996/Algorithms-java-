package algorithms.lintcode;

public class lintcode219 {

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    /**
     * @param head: The head of linked list.
     * @param val:  An integer.
     * @return: The head of new linked list.
     */
    public ListNode insertNode(ListNode head, int val) {
        // write your code here
        ListNode temp = new ListNode(val);
        ListNode result = head;

        if (head == null)
            return temp;
        if (val <= head.val) {
            temp.next = head;
            return temp;
        }
        if (head.next == null) {
            head.next = temp;
            return head;
        }
        while (head.next != null) {
            if (val <= head.next.val) {
                temp.next = head.next;
                head.next = temp;
                return result;
            }
            head = head.next;
        }
        head.next = temp;
        return result;
    }
}
