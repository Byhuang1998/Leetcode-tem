/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (n == 1) {
            ListNode sen = new ListNode(0);
            sen.next = head;
            ListNode pre = sen, cur = head;

            while (cur.next != null) {
                pre = pre.next;
                cur = cur.next;
            }
            pre.next = null;
            return sen.next;
        }
        ListNode fast = head, slow = head;
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.val = slow.next.val;
        slow.next = slow.next.next;
        return head;
    }
}