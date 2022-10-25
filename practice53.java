
public class practice53 {

	public int maxSubArray(int[] nums) {
		int len = nums.length;
		int res = nums[0];
		int current = nums[0];
		for (int i=1; i<len; i++) {
			if (current<0) current = nums[i];
			else current+=nums[i];
			if (current>res) res = current;
		}
		return res;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		practice53 p = new practice53();
		int[] nums = {-2,-3,-4};
		int ans = p.maxSubArray(nums);
		System.out.println(ans);
	}

}
