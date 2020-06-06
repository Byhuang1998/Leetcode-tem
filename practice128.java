class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        Arrays.sort(nums);
        int max = 1;
        int cur = 1;
        for (int i = 1; i < nums.length; ++i) {
            while (i < nums.length && nums[i] - nums[i - 1] < 2) {
                if (nums[i] - nums[i - 1] == 0) {
                    i++;
                    continue;
                }
                cur++;
                i++;
            }
            max = Math.max(max, cur);
            cur = 1;
        }
        return max;
    }
}