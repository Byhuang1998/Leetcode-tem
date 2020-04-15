// small test for practice 445
import java.util.Stack;


public class test {
	class LinkNode {
		int val;
		LinkNode next;
		LinkNode(int x) {
			val = x;
		}
	}
	
	
	public LinkNode addTwoNumbers(LinkNode l1, LinkNode l2) {
		Stack<LinkNode> s1 = new Stack<>();
		Stack<LinkNode> s2 = new Stack<>();
		while (l1 != null) {
			s1.push(l1);
			l1 = l1.next;
		}
		while (l2 != null) {
			s2.push(l2);
			l2 = l2.next;
		}
		int carry = 0;
		LinkNode tail = null;
		while (! s1.isEmpty() || ! s2.isEmpty() || carry != 0) {
			int sum = carry;
			sum += s1.isEmpty() ? 0 : s1.pop().val;
			sum += s2.isEmpty() ? 0 : s2.pop().val;
			LinkNode nLN = new LinkNode(sum % 10);
			carry = sum / 10;
			nLN.next = tail;
			tail = nLN;
		}
		
		return tail;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test t = new test();
    	LinkNode l1 = t.new LinkNode(0);
    	LinkNode l2 = t.new LinkNode(7);
    	l2.next = t.new LinkNode(3);
    	LinkNode ans = t.addTwoNumbers(l1, l2);
    	while (ans != null) {
    		System.out.println(ans.val);
    		ans = ans.next;
    	}

	}

}
