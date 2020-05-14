/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null) return head;
        ListNode cur = head;
        int len = 1;
        while (cur.next != null) {
            len++;
            cur = cur.next;
        }
        cur.next = head;
        cur = head;
	k = k % len; // 加上这一句后速度加快超多
        int r = len - k - 1;
        while (r < 0) {
            r += len;
        }
        for (int i = 0; i < r; i++) {
            cur = cur.next;
        }
        ListNode res = cur.next;
        cur.next = null;
        return res;
    }
}