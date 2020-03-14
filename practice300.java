
public class practice300 {

	public int lengthOfLIS(int[] nums) {
		int len = nums.length;
		if (len == 0) return 0;
		int max = 1;
		int[] dp = new int[len];
		dp[0] = 1;
		for (int i=1; i<len; i++) {
			int tem = 0;
			dp[i] = 1;
			for (int j=0; j<i; j++) {
				if (nums[i]>nums[j]) {
					tem = dp[j]+1;
					if (tem>dp[i]) dp[i] = tem;
				}
			}
			if (dp[i]>max) max = dp[i];
		}
		return max;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {0};
		practice300 p = new practice300();
		int ans = p.lengthOfLIS(nums);
		System.out.println(ans);
	}

}
