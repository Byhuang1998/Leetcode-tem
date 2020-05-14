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
        ListNode l = head;
        int len = 0, flag = Integer.MAX_VALUE / 2;
        boolean found = false;
        List<Integer> list = new ArrayList<>();
        while (l != null) {
            list.add(l.val);
            if (l.val >= x && found == false) {
                flag = len;
                found = true;
            }
            l = l.next;
            len++;
        }
        for (int i = flag + 1; i < len; i++) {
            if (list.get(i) < x) {
                int tem = list.get(i);
                list.remove(i);
                list.add(flag, tem);
                flag++;
            }
        }
        ListNode sentry = new ListNode(0);
        ListNode pre = sentry;
        for (int n : list) {
            ListNode ln = new ListNode(n);
            pre.next = ln;
            pre = ln;
        }
        pre.next = null;
        return sentry.next;
    }
}