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
        Map<TreeNode, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        q.add(root);
        map.put(root, 1);
        while (! q.isEmpty()) {
            TreeNode cur = q.poll();
            if (cur.left != null) {
                q.add(cur.left);
                map.put(cur.left, map.get(cur) + 1);
            }
            if (cur.right != null) {
                q.add(cur.right);
                map.put(cur.right, map.get(cur) + 1);
            }
            list.add(cur.val);
            if (q.isEmpty()) {
                res.add(list);
            } else if (map.get(q.peek()) != map.get(cur)) {
                res.add(list);
                list = new ArrayList<>();
            }
        }
        return res;
    }
}