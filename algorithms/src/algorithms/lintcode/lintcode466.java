package algorithms.lintcode;

public class lintcode466 {
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
     * @return: The length of list.
     */
    public int countNodes(ListNode head) {
        // write your code here
        int count = 0;

        if (head == null)
            return count;
        while (head != null) {
            count++;
            head = head.next;
        }
        return count;
    }
}
