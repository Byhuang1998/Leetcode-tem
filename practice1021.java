class Solution {
    public String removeOuterParentheses(String S) {
        Stack<Character> s = new Stack<>();
        char[] sc = S.toCharArray();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < S.length(); i++) {
            if (sc[i] == '(') {
                s.push(sc[i]);
            } else {
                s.pop();
                if (s.isEmpty()) {
                    list.add(i);
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        int start = 0;
        for (int i : list) {
            sb.append(S.substring(start + 1, i));
            start = i + 1;
        }
        return sb.toString();
    }
}