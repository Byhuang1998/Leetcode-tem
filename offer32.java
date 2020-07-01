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
        Queue<TreeNode> q = new LinkedList<>();
        if (root == null) return res;
        int num = 1;
        q.offer(root);
        while (! q.isEmpty()) {
            List<Integer> tem = new ArrayList<>();
            int nn = 0;
            for (int i = 0; i < num; ++i) {
                TreeNode cur = q.poll();
                tem.add(cur.val);
                if (cur.left != null) {
                    q.offer(cur.left);
                    nn ++;
                }
                if (cur.right != null) {
                    q.offer(cur.right);
                    nn ++;
                }
            }
            res.add(new ArrayList(tem));
            num = nn;
        }
        for (int i = 0; i < res.size(); ++i) {
            if (i % 2 == 1) {
                Collections.reverse(res.get(i));
            }
        }
        return res;
    }
}