import java.util.Stack;
import java.util.HashMap;
public class practice104 {

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x;}
	}
	public int maxDepth(TreeNode root) {
		if (root == null) return 0;
		int max = 0;
		HashMap<TreeNode, Integer> map = new HashMap<>();
		Stack<TreeNode> s = new Stack<>();
		TreeNode cur = root;
		s.push(cur);
		map.put(cur, 1);
		while (! s.isEmpty()) {
			cur = s.pop();
			int depth = map.get(cur);
			max = Math.max(max, depth);
			if (cur.right != null) {
				s.push(cur.right);
				map.put(cur.right, depth+1);
			}
			if (cur.left != null) {
				s.push(cur.left);
				map.put(cur.left, depth+1);
			}
		}
		return max;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		practice104 p = new practice104();
		// 根
		TreeNode root = p.new TreeNode(1);
		// 第二层
		TreeNode l = root.left = p.new TreeNode(3);	TreeNode r = root.right = p.new TreeNode(3);
		// 第三层
		l.left = p.new TreeNode(4);	l.right = p.new TreeNode(3);
		r.left = p.new TreeNode(3);	r.right = p.new TreeNode(4);
		System.out.println(p.maxDepth(root));

	}

}
