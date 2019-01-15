package algorithms.lintcode;

public class lintcode1664 {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    /**
     * @param head:
     * @return: nothing
     */
    public int countNodesII(ListNode head) {
        int count = 0;

        if (head == null)
            return count;
        while (head != null) {
            if (head.val > 0 && head.val % 2 == 1)
                count++;
            head = head.next;
        }
        return count;
    }
}
