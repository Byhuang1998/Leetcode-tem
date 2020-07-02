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
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int num = 1;
        int depth = 0;
        while (! q.isEmpty()) {
            int nn = 0;
            for (int i = 0 ; i < num; ++i) {
                TreeNode cur = q.poll();
                if (cur.left != null) {
                    q.offer(cur.left);
                    nn++;
                }
                if (cur.right != null) {
                    q.offer(cur.right);
                    nn++;
                }
            }
            num = nn;
            depth++;
        }
        return depth;
    }
}