/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) return head;
	// 哨兵
        ListNode Pre = new  ListNode(0);
        Pre.next = head;
        ListNode pre = Pre, cur = head;    
        while (cur != null) {
            if (cur.val != val) {
                pre = cur;
                cur = cur.next;
            } else {
                pre.next = cur.next;
                cur = cur.next;
            }
        }
        return Pre.next;
    }
}