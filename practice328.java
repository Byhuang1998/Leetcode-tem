class Solution {
    public int[] productExceptSelf(int[] nums) {
        int m = 1;
        int[] res = new int[nums.length];
        int tem = 1;
        for (int i = 0; i < nums.length; ++i) {
            int x = i == 0 ? 1 : nums[i-1];
            tem *= x;
            res[i] = tem;
        }
        tem = 1;
        for (int i = nums.length - 1; i >= 0; --i) {
            int x = i == nums.length - 1 ? 1 : nums[i+1];
            tem *= x;
            res[i] *= tem;
        }
        return res;
    }
}