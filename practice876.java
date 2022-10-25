public class practice876 {
	public class ListNode {
		int val;
		ListNode next;
		ListNode(int x) {val = x;};
	}
	
	public ListNode middleNode(ListNode head) {
		ListNode l1 = head;
		ListNode l2 = head;
		ListNode cur1 = head;
		ListNode cur2 = head;
		while (l2.next != null) {
			l1 = cur1.next; cur1 = l1;
			l2 = cur2.next.next; 
			if (l2 == null) break;
			cur2 = l2;
		}
		return l1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
