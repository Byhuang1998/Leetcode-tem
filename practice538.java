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
    public TreeNode convertBST(TreeNode root) {
        TreeNode cur = root;
        Stack<TreeNode> s = new Stack<>();
        int sum = 0;
        while (cur != null || !s.isEmpty()) {
            while (cur != null) {
                s.push(cur);
                cur = cur.right;
            }
            cur = s.pop();
            int tem = cur.val;
            cur.val += sum;
            sum += tem;
            cur = cur.left;
        }
        return root;
    }
}