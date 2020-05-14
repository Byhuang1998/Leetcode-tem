/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode partition(ListNode head, int x) {
        if (head == null || head.next == null) return head;
        ListNode sentry1 = new ListNode(0);
        ListNode sentry2 = new ListNode(0);
        ListNode l = head, first = sentry1, second = sentry2;
        while (l != null) {
            if (l.val < x) {
                first.next = new ListNode(l.val);
                first = first.next;
            } else {
                second.next = new ListNode(l.val);
                second = second.next;
            }
            l = l.next;
        }
        first.next = sentry2.next;
        second.next = null;
        return sentry1.next;
    }
}