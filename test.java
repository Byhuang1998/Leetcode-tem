/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
import java.util.Stack;
class Solution {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) return root;
        Stack<TreeNode> s = new Stack<>();
        s.push(root);
        while (! s.isEmpty()) {
            TreeNode node = s.pop();
            TreeNode tem = node.left;
            node.left = node.right;
            node.right = tem;
            if (node.left != null) {
                s.push(node.left);
            }
                
            if (node.right != null) {
                s.push(node.right);
            }
        }
        return root;
    }
}