
public class practice35 {

	public int searchInsert(int[] nums, int target) {
		int len = nums.length;
		if (len==0 || target<=nums[0]) return 0;
		if (target>nums[len-1]) return len;
		int i=0;
		int j=len-1;
		int pointer = -1;
		while(j-i != 1) {
			pointer = (i+j)/2;
			if (nums[pointer] == target) return pointer;
			else if (nums[pointer]>target) {
				j = pointer;
			} else {
				i = pointer;
			}
		}
		return j;
	}
 	public static void main(String[] args) {
		// TODO Auto-generated method stub
 		int[] nums = {1,2,3};
 		int target = 2;
 		practice35 p = new practice35();
 		int res = p.searchInsert(nums, target);
 		System.out.println(res);
	}

}
