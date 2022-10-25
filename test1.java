
import java.util.Arrays;

public class test1 {

	public static void main(String[] args) {
			 test1 tt = new test1();
			 int[] nums = {5,4,3,2,1};
			 tt.quick(nums, 0, nums.length-1);
			 System.out.println(Arrays.toString(nums));

		 }

	public int[] sortArray(int[] nums) {
		// bubble(nums);
		// select(nums);
		// insert(nums);
		quick(nums, 0, nums.length - 1);
		return nums;
	}

	// 改进后的冒泡排序 超时
	public void bubble(int[] nums) {
		int len = nums.length;
		int cir = len - 1;
		for (int i = 0; i < len - 1; i++) {
			int curcir = 0;
			for (int j = 0; j < cir; j++) {
				if (nums[j] > nums[j + 1]) {
					swap(nums, j, j + 1);
					curcir = j;
				}
			}
			cir = curcir;
			if (cir == 0)
				break;
		}
	}

	// 选择排序
	public void select(int[] nums) {
		int len = nums.length;
		for (int i = 0; i < len - 1; ++i) {
			int curmin = nums[i];
			int curminidx = i;
			for (int j = i + 1; j < len; j++) {
				if (nums[j] < curmin) {
					curminidx = j;
					curmin = nums[j];
				}
			}
			if (i != curminidx)
				swap(nums, curminidx, i);
		}
	}

	// 插入排序
	public void insert(int[] nums) {
		int len = nums.length;
		for (int i = 1; i < len; i++) {
			int cur = nums[i];
			int j = i - 1;
			while (j >= 0) {
				if (nums[j] > cur) {
					nums[j + 1] = nums[j];
					j--;
				} else {
					break;
				}
			}
			nums[j + 1] = cur;
		}
	}

	// 快速排序 单边循环
	public void quick(int[] nums, int left, int right) {
		if (left >= right)
			return;
		int mid = partition(nums, left, right);
		quick(nums, 0, mid - 1);
		quick(nums, mid + 1, right);
	}

	// 快速排序 单边循环 分组
	public int partition(int[] nums, int left, int right) {
		int pv = nums[right];
		int i = left, j = left;
		while (j < right) {
			if (nums[j] < pv) {
				if (i != j)
					swap(nums, j, i);
				i++;
			}
			j++;
		}
		if (right != i)
			swap(nums, right, i);
		return i;
	}

	public void swap(int[] nums, int i, int j) {
		int tem = nums[i];
		nums[i] = nums[j];
		nums[j] = tem;
	}

}
