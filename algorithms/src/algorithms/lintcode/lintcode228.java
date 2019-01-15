package algorithms.lintcode;

public class lintcode228 {

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    /**
     * @param head: the head of linked list.
     * @return: a middle node of the linked list
     */
    public ListNode middleNode(ListNode head) {
        // write your code here
        int count = 1;
        ListNode temp = head;
        if (temp == null)
            return null;
        while (temp.next != null) {
            count++;
            temp = temp.next;
        }
        int result;
        if (count % 2 == 0)
            result = count / 2 - 1;
        else
            result = count / 2;
        for (int i = 0; i < result;i++){
            head = head.next;
        }
        temp = head;
        return temp;
    }
}
