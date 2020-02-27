// leetcode 第一题
import java.util.HashMap;

public class Solution {
	
    public int[] twoSum(int[] nums, int target) {
    	int[] ans = {0,0};
    	int len = nums.length;
    	HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
    	for (int i=0; i <len; i++) {
    		map.put(nums[i],i);
    	}
    	for (int i=0; i<len; i++) {
    		int dif = target - nums[i];
    		if (map.get(dif) != null && map.get(dif) != i) { //不能两个加数都是一个数，所以不能两个下标不能相同
    			ans[0] = i;
    			ans[1] = map.get(dif);
    			// 因为肯定会有重复，第一次找到的是顺序的，直接返回
    			return ans;
    		}
    	}
    	return ans;
    }

    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {2, 7, 11, 15};
		int target = 26;
		int[] ans = {0, 0};
		Solution s = new Solution();
		ans = s.twoSum(nums, target);
		for (int i=0; i<2; i++) {
			System.out.println(ans[i]);
			
		}
	}

}
