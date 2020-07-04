import java.util.Stack;
public class offer54 {

    public int kthLargest(TreeNode root, int k) {
        Stack<TreeNode> s = new Stack<>();
        int index = 0;
        TreeNode cur = root;
        int ans = 0;
        while (index < k && (cur != null || ! s.isEmpty())) {
            while (cur != null) {
                s.push(cur);
                cur = cur.right;
            }
            cur = s.pop();
            ans = cur.val;
            index++;
            cur = cur.left;
        }
        return ans;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(3);
		TreeNode a = root.left = new TreeNode(1);
		root.right = new TreeNode(4);
		a.right = new TreeNode(2);
		offer54 oo = new offer54();
		int ans = oo.kthLargest(root, 1);
		System.out.println(ans);
	}

}
