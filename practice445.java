
public class practice445 {
	// 获取链表的长度
	public int getLength(ListNode head) {
		int len = 0;
		while (head != null) {
			len ++;
			head = head.next;
		}
		return len;
	}
    // 反转链表
    public ListNode reverseList(ListNode head) {
        if (head.next == null) return head;
        ListNode p1 = head;
        ListNode p2 = head.next;
        while (p2.next != null) {
            ListNode tem = p2.next;
            p2.next = p1;
            p1 = p2;
            p2 = tem;
        }
        head.next = null;
        p2.next = p1;
        return p2;
    }
    // 相加
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    	if (getLength(l1) < getLength(l2)) return addTwoNumbers(l2, l1);
        ListNode nl1 = reverseList(l1);
        ListNode nl2 = reverseList(l2);
        ListNode head = nl1;
        int flag = 0;
        int tem = 0;
        while (nl1 != null || nl2 != null) {
            if (nl1 == null) {
                tem = nl2.val + flag;
            } else if (nl2 == null) {
                tem = nl1.val + flag;
            } else {
                tem = nl1.val + nl2.val + flag;
            }
            nl1.val = tem % 10;
            flag = tem / 10;
            nl1 = nl1 == null ? null : nl1.next;
            nl2 = nl2 == null ? null : nl2.next;
        }
        ListNode ans = reverseList(head);
        if (flag == 1) {
        	ListNode res = new ListNode(1);
        	res.next = ans;
        	return res;
        }
        return ans;
    }	
    
    public static void main(String[] args) {
		// TODO Auto-generated method stub
    	practice445 p = new practice445();
    	ListNode l1 = new ListNode(0);
    	ListNode l2 = new ListNode(7);
    	l2.next = new ListNode(3);
    	ListNode ans = p.addTwoNumbers(l1, l2);
    	while (ans != null) {
    		System.out.println(ans.val);
    		ans = ans.next;
    	}
	}

}


