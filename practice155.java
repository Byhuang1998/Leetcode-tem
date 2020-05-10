class MinStack {
    List<Integer> list = new ArrayList<>();

    /** initialize your data structure here. */
    public MinStack() {
    }
    
    public void push(int x) {
        list.add(x);
    }
    
    public void pop() {
        list.remove(list.size() - 1);
    }
    
    public int top() {
        return list.get(list.size() - 1);
    }
    
    public int getMin() {
        int tem = Integer.MAX_VALUE;
        for (int x : list) {
            if (x < tem) {
                tem = x;
            }
        }
        return tem;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */