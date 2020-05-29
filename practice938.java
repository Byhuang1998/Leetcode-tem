/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    List<Integer> nums = new ArrayList<>();
    public int rangeSumBST(TreeNode root, int L, int R) {
        inorderSearch(root);
        int sum = 0;
        for (int i = 0; i < nums.size(); ++i) {
            int n = nums.get(i);
            if (L <= n && n <= R) {
                sum += n;
            }
        }
        return sum;
    }

    private void inorderSearch(TreeNode root) {
        if (root == null) return;
        Stack<TreeNode> s = new Stack<>();
        TreeNode cur = root;
        while (cur != null || !s.isEmpty()) {
            while (cur != null) {
                s.push(cur);
                cur = cur.left;
            }
            cur = s.pop();
            nums.add(cur.val);
            cur = cur.right;
        }

    }
}