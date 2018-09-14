package algorithms.lintcode;

public class ReverseLinkedList {
    //迭代
//    public ListNode reverse(ListNode head) {
//        ListNode prev = null;
//        while (head != null) {
//            ListNode temp = head.next;
//            head.next = prev;
//            prev = head;
//            head = temp;
//        }
//        return prev;
//    }
    //递归
    public ListNode reverse(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode prev =  reverse(head.next);
        head.next.next = head;
        head.next = null;
        return prev;
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
