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
        Queue<Pair<TreeNode, Integer>> q = new LinkedList<>();
        int ans = 0;
        if (root != null) {
            q.offer(new Pair(root, 1));
        }
        while (! q.isEmpty()) {
            Pair<TreeNode, Integer> cur = q.poll();
            int curDepth = cur.getValue();
            TreeNode curNode = cur.getKey();
            ans = Math.max(ans, curDepth);
            if (curNode.left != null) {
                q.offer(new Pair(curNode.left, curDepth + 1));
            }
            if (curNode.right != null) {
                q.offer(new Pair(curNode.right, curDepth + 1));
            }
        }
        return ans;
    }
}