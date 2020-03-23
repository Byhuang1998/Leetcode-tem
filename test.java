import java.util.Stack;
import java.util.HashMap;
public class test {

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x;}
	}
	public int maxDepth(TreeNode root) {
		if (root == null) return 0;
		return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test p = new test();
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
