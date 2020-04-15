class LinkNode {
		int val;
		LinkNode next;
		LinkNode (int x) {val = x;};
	}

//·´×ªÁ´±í
public class practice206 {
	


	public LinkNode reverseList(LinkNode head) {
		if (head == null || head.next == null) return head;
		LinkNode ans = reverseList(head.next);
		head.next.next = head;
		head.next = null;
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkNode l = new LinkNode(1);
		l.next = new LinkNode(2);
		l.next.next = new LinkNode(3);
		practice206 p = new practice206();
		LinkNode ans = p.reverseList(l);
		while(ans != null) {
			System.out.println(ans.val);
			ans = ans.next;
		}
	}

}
