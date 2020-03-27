import java.util.List;
import java.util.ArrayList;
import java.util.Queue;

import java.util.LinkedList;
public class practice107 {

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) {val = x;}
		TreeNode() {
			// TODO Auto-generated constructor stub
		}
	}
	public List<List<Integer>> levelOrderBottom(TreeNode root) {
		if (root == null) return new LinkedList<>();
		LinkedList<List<Integer>> ans = new LinkedList<>();
		Queue<TreeNode> q = new LinkedList<>();
		q.offer(root);
		while (! q.isEmpty()) {
			// 精妙之处
			int size = q.size();
			List<Integer> levelList = new ArrayList<>();
			for (int i=0; i<size; ++i) {
				TreeNode cur_tree = q.poll();
				if (cur_tree.left != null) q.offer(cur_tree.left);
				if (cur_tree.right != null) q.offer(cur_tree.right);
				levelList.add(cur_tree.val);
			}
			ans.offerFirst(levelList);
		}
		return ans;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		practice107 p = new practice107();
		// 根
		TreeNode root = p.new TreeNode(1);
		// 第二层
		TreeNode l = root.left = p.new TreeNode(3);	TreeNode r = root.right = p.new TreeNode(3);
		// 第三层
		l.left = p.new TreeNode(4);	l.right = p.new TreeNode(3);
		r.left = p.new TreeNode(3);	r.right = p.new TreeNode(4);
		root = null;
		for (List<Integer> list : p.levelOrderBottom(root)) {
			for (int i : list) System.out.print(i);
			System.out.println();
		}
	}

}
