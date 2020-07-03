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
    public TreeNode mirrorTree(TreeNode root) {
        if (root == null) return root;
        TreeNode L = root.left;
        TreeNode R = root.right;
        root.left = R;
        root.right = L;
        mirrorTree(L);
        mirrorTree(R);
        return root;
    }
}