package algorithms.lintcode;

public class ReverseLinkedListII {
    /**
     * @param head: ListNode head is the head of the linked list
     * @param m:    An integer
     * @param n:    An integer
     * @return: The head of the reversed ListNode
     */
    
    public ListNode reverseBetween(ListNode head, int m, int n) {
        // write your code here
        /*
        新建一个链表result，用链表next节点表示head初始头结点，head再等于result，
        避免m = 1时不进行反转。
        */
        ListNode result = new ListNode(0);
        result.next = head;
        head = result;
        /*
        找到第一个开始翻转的节点
         */
        while (m > 1) {
            head = head.next;
            m--;
            n--;
        }
        ListNode start = head.next;
        ListNode temp;
        head.next = null;
        /*
        开始翻转
         */
        while (n > 0) {
            temp = start;
            start = start.next;
            temp.next = head.next;
            head.next = temp;
            n--;
        }
        /*
        找到第一个链表最后一个节点，并进行连接
         */
        while (head.next != null) {
            head = head.next;
        }
        head.next = start;
        return result.next;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}
