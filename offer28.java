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
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        return helper(root.left, root.right);
    }

    private boolean helper(TreeNode L, TreeNode R) {
        if (L == null && R == null) {
            return true;
        } else if (L == null || R == null){
            return false;
        }else {
            return R.val == L.val && helper(L.left, R.right) && helper(L.right, R.left);
        }
    }
}

/*
** 迭代的解法
*/
//class Solution {
//    public boolean isSymmetric(TreeNode root) {
//        if (root == null) return true;
//        Queue<TreeNode> q = new LinkedList<>();
//        q.offer(root.left);
//        q.offer(root.right);
//        while (! q.isEmpty()) {
//            TreeNode t1 = q.poll();
//            TreeNode t2 = q.poll();
//            if (t1 == null && t2 == null) {
//                continue;
//            } else if (t1 == null || t2 == null) {
//                return false;
//            } else {
//                if (t1.val != t2.val) {
//                    return false;
//                } else {
//                    q.offer(t1.left);
//                    q.offer(t2.right);
//                    q.offer(t1.right);
//                    q.offer(t2.left);
//                }
//            }
//        }
//        return true;
//    }
//}