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
    public int[] findMode(TreeNode root) {
        if (root == null) return new int[0];
        int maxNum = 1, curNum = 1;
        // 保存了中序遍历的结果
        List<Integer> res = helper(root);
        // 用于保存返回的结果
        List<Integer> ans = new ArrayList<>(); 
        int curValue = res.get(0); 
        for (int i = 1; i < res.size(); i++) {
            if (res.get(i) == curValue) {
                curNum++;
            } else {
                if (curNum == maxNum) {
                    ans.add(curValue);
                } else if (curNum > maxNum) {
                    maxNum = curNum;
                    ans.clear();
                    ans.add(curValue);
                }
                curNum = 1;
                curValue = res.get(i);
            }
        }
        if (curNum == maxNum) {
            ans.add(curValue);
        } else if (curNum > maxNum) {
            ans.clear();
            ans.add(curValue);
        }
        int[] aa = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            aa[i] = ans.get(i);
        }
        return aa;
    }

    private List<Integer> helper(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        // 中序遍历的结果就是由小到大
        if (root == null) return res;
        Stack<TreeNode> s = new Stack<>();
        TreeNode cur = root;
        while (cur != null || ! s.isEmpty()) {
            while (cur != null) {
                s.push(cur);
                cur = cur.left;
            }
            cur = s.pop();
            res.add(cur.val);
            cur = cur.right;
        }
        return res;
    }
}