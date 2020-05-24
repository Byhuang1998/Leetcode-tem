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
    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) return 0;
        Map<TreeNode, Boolean> map = new HashMap<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        map.put(root, false);
        int sum = 0;
        while (! q.isEmpty()) {
            TreeNode cur = q.poll();
            if (cur.left == null && cur.right == null && map.get(cur)) {
                sum += cur.val;
            }
            if (cur.left != null) {
                q.offer(cur.left);
                map.put(cur.left, true);
            }
            if (cur.right != null) {
                q.offer(cur.right);
                map.put(cur.right, false);
            }
        }
        return sum;
    }
}