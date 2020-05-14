/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return head;
        ListNode sen = new ListNode(head.val + 1);
        sen.next = head;
        ListNode pre = sen, first = head, second = head.next;
        while (second != null) {
            if (second.val == first.val) {
                while (second != null && second.val == first.val) {
                    second = second.next;
                }
                pre.next = second;
                first = second;
                second = first == null ? null : first.next;
            } else {
                pre = first;
                first = second;
                second = second.next;
            }
        }
        return sen.next;
    }
}