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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) return res;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (! q.isEmpty()) {
            List<Integer> list = new ArrayList<>();
            int size = q.size();
            for (int i = 0; i < size; ++i) {
                TreeNode cur = q.poll();
                if (cur == null) {
                    continue;
                }
                list.add(cur.val);
                q.offer(cur.left);
                q.offer(cur.right);

            }
            if (list.size() > 0) {
                res.add(list);
            }
        }
        return res;
    }
}