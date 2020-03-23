
public class practice83 {
	public class ListNode {
		int val;
		ListNode next;
		ListNode(int x) {val = x;}		
	}
	public ListNode deleteDuplicates(ListNode head) {
		if (head == null) return head;
		ListNode l1 = head;
		if (l1.next == null) return head;
		ListNode l2 = head;
		int cur = l1.val;
		while (l2.next != null) {
			cur = l1.val;
			if (l2.next.val == cur) {
				l2 = l2.next;
				continue;
			}
			l1.next = l2.next;
			l1 = l2.next;
			l2 = l1;
		}
		l1.next = l2.next;
		return head;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
