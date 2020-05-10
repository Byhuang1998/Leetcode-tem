class Solution {
    public List<Integer> minSubsequence(int[] nums) {
        Arrays.sort(nums);
        List<Integer> list = new ArrayList<>();
        int sum = 0;
        for (int n : nums) {
            sum += n;
        }
        int index = nums.length - 1;
        int temSum = nums[index--];
        while (temSum <= sum - temSum) {
            temSum += nums[index--];
        }
        for (int i = nums.length - 1; i > index; --i) {
            list.add(nums[i]);
        }
        return list;
    }
}