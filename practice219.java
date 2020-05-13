class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; ++i) {
            // map.put的方法返回值：
            // 若map的Key集中没有nums[i]，那么返回的是null
            // 若已有，那么此时put时需要更新Value值，put函数返回的值是之间的Value值
            Integer Old = map.put(nums[i], i);
            if (Old != null && i - Old <= k) {
                return true;
            }
        }
        return false;
    }
}