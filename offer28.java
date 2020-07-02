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
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        return helper(root.left, root.right);
    }

    private boolean helper(TreeNode L, TreeNode R) {
        if (L == null && R == null) {
            return true;
        } else if (L == null || R == null){
            return false;
        }else {
            return R.val == L.val && helper(L.left, R.right) && helper(L.right, R.left);
        }
    }
}