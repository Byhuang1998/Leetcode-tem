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
	
	// 归并排序
	public void merge(int[] nums, int left, int right) {
		
		return;
		
		
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
	
	// 快速排序
	public void quick(int[] nums, int left, int right) {
		if (left >= right) return;
		int pivot = nums[left];
		int i = left;
		int j = right;
		while (i != j) {
			while (j > i) {
				if (nums[j] >= pivot) {
					j--;
				}else {
					nums[i] = nums[j];
					break;
				}
			}
			while (i < j) {
				if (nums[i] <= pivot) {
					i ++;
				} else {
					nums[j] = nums[i];
					break;
				}
			}
		}
		nums[i] = pivot;
		this.quick(nums, left, i-1);
		this.quick(nums, i+1, right);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] nums = {6,5,4,3,2,1,2,5,9,8,7};
		int[] test = {6,5,4,3,2,1,2,5,9,8,7};
		practice912 p = new practice912();
		p.quick(test, 0, test.length-1);
		System.out.println(Arrays.toString(test));
	}
}
