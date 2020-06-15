class RecentCounter {
    Queue<Integer> q; 
    public RecentCounter() {
        q = new LinkedList<>();
    }
    
    public int ping(int t) {
        q.offer(t);
	// 下面的while循环判断条件不需要!q.isEmpty()，因为q.peek()在空队列中会返回false
	// 而不是报错
        while (q.peek() < t - 3000) {
            q.poll();
        }
        return q.size();
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */