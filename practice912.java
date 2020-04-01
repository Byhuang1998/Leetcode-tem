import java.util.Arrays;

public class practice912 {

	public int[] bubble(int[] nums) {
		int len = nums.length;
		for (int i=0; i<len; ++i) {
			for (int j=0; j<len-1-i; ++j) {
				if (nums[j]>nums[j+1]) {
					// 交换两个数
					int tem = nums[j];
					nums[j] = nums[j+1];
					nums[j+1] = tem;
				}
			}
		}
		
		return nums;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {6,5,4,3,2,1};
		practice912 p = new practice912();
		int[] ans = p.bubble(nums);
		System.out.println(Arrays.toString(ans));

	}

}
