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
    List<Integer> res = new ArrayList<>();
    public List<Integer> preorder(Node root) {
        if (root != null) {
            res.add(root.val);
            List<Node> childrenList = root.children;
            for (Node n : childrenList) {
                preorder(n);
            }
        }
        return res;
    }
}