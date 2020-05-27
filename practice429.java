/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> levelOrder(Node root) {
        if (root == null) return res;
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        while (! q.isEmpty()) {
            int size = q.size();
            List<Integer> levelNode = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                Node cur = q.poll();
                levelNode.add(cur.val);
                List<Node> childrenList = cur.children;
                int nodeCnt = childrenList.size();
                for (int j = 0; j < nodeCnt; ++j) {
                    q.offer(childrenList.get(j));
                }
            }
            res.add(levelNode);
        }
        return res;
    }
}