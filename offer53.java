class Solution {
    public int search(int[] nums, int target) {
        int length = nums.length;
        if (length == 0) return 0;
        int start = 0, end = length - 1;
        for (int i = 0; i < length; ++i) {
            if (nums[i] == target) {
                start = i;
                break;
            }
        }
        for (int i = end; i >= 0; --i) {
            if (nums[i] == target) {
                end = i;
                break;
            }
        }
        if (start == 0 && end == length - 1 && nums[0] != target) {
            return 0;
        }
        return end - start + 1;
    }
}