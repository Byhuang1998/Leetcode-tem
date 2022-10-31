class Solution {
    public int totalStrength(int[] strength) {
        int MOD = (int)1e9 + 7;
        int n = strength.length;
        int[] left = new int[n]; int[] right = new int[n];
        int[] psum = new int[n + 1];
        int[] ppsum = new int[n + 2];
        Deque<Integer> stack = new LinkedList<>();
        // 前缀和及对left right数组的初始化
        for (int i = 1; i < n + 1; i++) {
            left[i - 1] = i - 1; right[i - 1] = i - 1;
            psum[i] = (psum[i - 1] + strength[i - 1]) % MOD;
        }
        for (int i = 2; i < n + 2; i++) ppsum[i] = (ppsum[i - 1] + psum[i - 1]) % MOD;
        // 构造left数组
        for (int i = 0; i < n; i++) {
            while (! stack.isEmpty() && strength[i] <= strength[stack.peekLast()]) {
                left[i] = left[stack.removeLast()];
            }
            stack.addLast(i);
        }
        // 构造right数组
        stack.clear();
        for (int i = n - 1; i >= 0; i--) {
            while (! stack.isEmpty() && strength[i] < strength[stack.peekLast()]) {
                right[i] = right[stack.removeLast()];
            }
            stack.addLast(i);
        }
        // System.out.println(Arrays.toString(left));
        // System.out.println(Arrays.toString(right));
        // System.out.println(Arrays.toString(psum));
        // System.out.println(Arrays.toString(ppsum));
        long sum = 0;
        for (int i = 0; i < n; i++) {
            int l = left[i], r = right[i];
            // System.out.println(l);
            // System.out.println(r);
            long cur = ((long)(i - l + 1) * (ppsum[r + 2] - ppsum[i + 1]) - (long)(r - i + 1) * (ppsum[i + 1] - ppsum[l])) % MOD;
            // System.out.println("cur is "  + cur);
            // System.out.println(ppsum[r + 2]);
            // System.out.println(ppsum[i + 1]);
            // System.out.println(ppsum[l]);
            sum = (sum + cur * strength[i]) % MOD;
        }
        return (int)(sum + MOD) % MOD;
    }
}
