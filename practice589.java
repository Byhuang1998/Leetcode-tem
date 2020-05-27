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
    public List<Integer> preorder(Node root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) return res;
        Stack<Node> s = new Stack<>();
        s.push(root);
        while (! s.isEmpty()) {
            Node cur = s.pop();
            res.add(cur.val);
            List<Node> childrenList = cur.children;
            int size = childrenList.size();
            for (int i = size - 1; i >= 0; i--) {
                s.push(childrenList.get(i));
            }
        }
        return res;
    }
}