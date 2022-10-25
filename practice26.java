
public class practice26 {
	public int removeDuplicates(int[] nums) {
		int len = nums.length;
		int i=0;
		for (int j=1; j<len; j++) {
			if (nums[j] != nums[i]) {
				i++;
				nums[i] = nums[j];
			}
		}
		return i+1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {0,0,1,2,3,3,3,3,4,4,5,5,5,6,6};
		practice26 p= new practice26();
		int ans = p.removeDuplicates(nums);
		for (int i=0; i<ans; i++) {
			System.out.println(nums[i]);
		}
	}

}
