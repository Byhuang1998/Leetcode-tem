class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        // 考虑k比数组大小大或相等的情形，不能用下面的循环判断
        if (k >= nums.length) {
            Arrays.sort(nums);
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] == nums[i + 1]) {
                    return true;
                }
            }
            return false;
        }
        for (int i = 0; i < nums.length; i++) {
            int cur = nums[i];
            // 要考虑可能越界的情况，所以循环退出条件要仔细
            for (int j = 1; j <= k && i + j < nums.length; j++) {
                if (nums[i + j] == cur) {
                    return true;
                }
            }
        }
        return false;
    }
}