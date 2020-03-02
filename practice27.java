
public class practice27 {
	
	public void sort(int[] nums) {
		int len = nums.length;
		for (int i=0; i<len-1; i++) {
			int index = i;
			int tem = nums[i];
			for (int j=i+1; j<len; j++) {
				if (nums[j] < tem) {
					index = j;
					tem = nums[j];
				}
			}
			tem = nums[i];
			nums[i] = nums[index];
			nums[index] = tem;
		}

	}
	
	public int removeElement(int[] nums, int val) {
		int len = nums.length;
		if (len == 0) return 0;
		sort(nums);
		int left = -1;
		int right=-1;
		for (int i=0; i<len; i++) {
			if (nums[i] == val) {
				left = i;
				break;
			}
		}
		for (int i=0; i<len; i++) {
			if (nums[i] == val)	right = i;
		}
		if (left<0) return len;
		int ans = len - (right-left+1);
		for (int i=0; i<len-right-1; i++) {
			nums[left+i] = nums[right+1+i];
		}
		return ans;
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		practice27 p = new practice27();
		int[] nums = {2};
		int val = 3;
		int res = p.removeElement(nums, val);
		for (int i=0; i<res; i++) {
			System.out.print(nums[i]+" ");
		}
	}

}
