class LinkNode {
		int val;
		LinkNode next;
		LinkNode (int x) {val = x;};
	}
public class practice206 {
	


	public LinkNode reverseList(LinkNode head) {
		if (head == null || head.next == null) return head;
		LinkNode pre = head;
		LinkNode next = pre.next;
		LinkNode tem = null;
		LinkNode res = null;
		while (next != null) {
			tem = next.next;
			next.next = pre;
			//更新pre与next,在原始链表中，pre在next之前
			pre = next;
			res = next;
			next = tem;
		}
		head.next = null;
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkNode l = new LinkNode(1);
		l.next = new LinkNode(2);
		l.next.next = new LinkNode(3);
		practice206 p = new practice206();
		LinkNode ans = p.reverseList(l);
		int i=0;
		while(ans != null) {
			System.out.println(ans.val);
			ans = ans.next;
		}
	}

}
