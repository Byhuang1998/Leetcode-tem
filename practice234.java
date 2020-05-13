/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode l = head;
        List<Integer> list = new ArrayList<>();
        while (l != null) {
            list.add(l.val);
            l = l.next;
        }
        Stack<Integer> s = new Stack<>();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (size % 2 == 0) {
                if (i < size / 2) {
                    s.push(list.get(i));
                } else if (i >= size / 2) {
                    if (list.get(i).equals(s.peek())) {
                        s.pop();
                    }
                }
            } else {
                if (i < size / 2) {
                    s.push(list.get(i));
                } else if (i > size / 2) {
                    if (list.get(i).equals(s.peek())) {
                        s.pop();
                    }
                }

            }
        }
        return s.isEmpty();
    }
}