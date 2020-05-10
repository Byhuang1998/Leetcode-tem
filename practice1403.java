class Solution {
    public List<Integer> minSubsequence(int[] nums) {
        int[] bucket = new int[101];
        int sum = 0;
        for (int n : nums) {
            sum += n;
            bucket[n] ++;
        }
        int curSum = 0;
        List<Integer> list = new ArrayList<>();
        for (int i=100; i>=0 && curSum <= sum - curSum; i--) {
            if (bucket[i] > 0) {
                while (bucket[i] > 0 && curSum <= sum - curSum) {
                    list.add(i);
                    curSum += i;
                    bucket[i] --;
                }
            }
        } 
        return list;
    }
}