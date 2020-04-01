import java.util.Arrays;

public class practice912 {

	// 冒泡排序
	public int[] bubble(int[] nums) {
		int len = nums.length;
		for (int i=0; i<len-1; ++i) {
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
	
	// 选择算法
	public int[] select(int[] nums) {
		int len = nums.length;
		for (int i=0; i<len; i++) {
			int flag = i;
			int cur = nums[i];
			for (int j=i; j<len; ++j) {
				if (nums[j]<cur) {
					flag = j;
					cur = nums[j];
				}
			}
			int tem = nums[flag];
			nums[flag] = nums[i];
			nums[i] = tem;
		}
		
		return nums;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {6,5,4,3,2,1,2,5,9,8,7};
		practice912 p = new practice912();
		int[] ans = p.select(nums);
		System.out.println(Arrays.toString(ans));

	}

}
