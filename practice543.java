
class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x) {val = x;};
}


public class practice543 {
	int ans = 1;

	public int diameterOfBinaryTree(TreeNode root) {
		if (root == null) return 0;		
		depth(root);
		return ans - 1;
	}
	
	public int depth(TreeNode root) {
		if (root == null) return 0;
		int L = depth(root.left);
		int R = depth(root.right);
		ans = Math.max(ans, L+R+1);
		return Math.max(L, R) + 1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		practice543 p = new practice543();
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		int ans = p.diameterOfBinaryTree(root);
		System.out.println(ans);
	}

}
