import java.util.Stack;
public class practice100 {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) {val = x;}
	}
	
	public boolean isSameTree(TreeNode p, TreeNode q) {
		if (p==null && q==null) return true;
		Stack<TreeNode> s1 = new Stack<>();
		Stack<TreeNode> s2 = new Stack<>();
		s1.push(p); s2.push(q);
		while (! s1.isEmpty()) {
			TreeNode cur1 = s1.pop();
			TreeNode cur2 = s2.pop();
            if (cur1==null&&cur2!=null || cur2==null&&cur1!=null) return false;
            else if (cur1==null && cur2==null) continue;
            else if (cur1.val != cur2.val) return false;
			s1.push(cur1.right); s1.push(cur1.left);
			s2.push(cur2.right); s2.push(cur2.left);
		}
		return s2.isEmpty();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
