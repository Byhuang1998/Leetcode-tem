class Solution {
    public long maximumImportance(int n, int[][] roads) {
        int[] cnt = new int[n];
        for (int[] road : roads) {
            cnt[road[0]]++;
            cnt[road[1]]++;
        }
        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            arr[i][0] = i;
            arr[i][1] = cnt[i];
        }
        long ans = 0;
        Arrays.sort(arr, (a, b) -> a[1] - b[1]);
        for (int i = 0; i < n; i++) {
            ans = ans + (long)(i + 1) * arr[i][1];
        }
        return ans;
    }
}