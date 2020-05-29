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
    List<Integer> res = new ArrayList<>();
    public int minDiffInBST(TreeNode root) {
        if (root == null || (root.left == null && root.right == null)) return 0;
        inOrderSearch(root);
        int min = Integer.MAX_VALUE;
        for (int i = 1; i < res.size(); ++i) {
            if (res.get(i) - res.get(i - 1) < min) {
                min = res.get(i) - res.get(i - 1);
            }
        }
        return min;
    }
    private void inOrderSearch(TreeNode root) {
        if (root != null) {
            Stack<TreeNode> s = new Stack<>();
            TreeNode cur = root;
            while (cur != null || !s.isEmpty()) {
                while (cur != null) {
                    s.push(cur);
                    cur = cur.left;
                }
                cur = s.pop();
                res.add(cur.val);
                cur = cur.right;
            }
        }
    }
}