class BookMyShow {
    int n, m;
    int[] free;
    public BookMyShow(int n, int m) {
        this.n = n;
        this.m = m;
        free = new int[n];
        Arrays.fill(free, m);

    }
    
    public int[] gather(int k, int maxRow) {
        for (int i = 0; i <= maxRow; ++i) {
            if (free[i] >= k) {
                int tem = m - free[i];
                free[i] -= k;
                return new int[]{i, tem};
            }
        }
        return new int[]{};
    }
    
    public boolean scatter(int k, int maxRow) {
        int sum = 0;
        for (int i = 0; i <= maxRow; ++i) {
            sum += free[i];
            if (sum >= k) break;
        }
        if (sum >= k) {
            for (int j = 0; j <= maxRow; j++) {
                if (free[j] < k) {
                    k -= free[j];
                    free[j] = 0;
                } else {
                    free[j] -= k;
                    return true;
                }
            }
        }        
        return false;
    }
}

/**
 * Your BookMyShow object will be instantiated and called as such:
 * BookMyShow obj = new BookMyShow(n, m);
 * int[] param_1 = obj.gather(k,maxRow);
 * boolean param_2 = obj.scatter(k,maxRow);
 */