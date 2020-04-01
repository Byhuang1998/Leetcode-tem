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
	
	// 归并算法
	public int[] merge(int[] nums) {
		int len = nums.length;
		
		
		return nums;
	}
	
	// 计数排序
	public int[] count(int[] nums) {
		int[] count = new int[1000];
		int len = nums.length;
		for (int i=0; i<len; ++i) {
			count[nums[i]] ++;
		}
		int pointer = 0;
		for (int i=0; i<1000; ++i) {
			if (count[i] != 0) {
				int n = count[i];
				for (int j=0; j<n; ++j) {
					nums[pointer] = i;
					pointer ++;
				}
			}
		}
		return nums;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {6,5,4,3,2,1,2,5,9,8,7};
		practice912 p = new practice912();
		int[] ans = p.count(nums);
		System.out.println(Arrays.toString(ans));
	}

}
