
public class practice26 {

	public int removeDuplicates(int[] nums) {
		int len = nums.length;
		if (len == 0 || len == 1) return len;
		int time = 0;
		int pointer = 0;
		for (int i=0; i<len-1; i++) {
			if (nums[pointer] == nums[pointer+1]) {
				time++;
				for (int j=pointer+1; j<len-time; j++) {
					nums[j] = nums[j+1];
				}
			} else {
				pointer++;
			}
		}
		
		return len-time;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {0,0,0,0,0,0,1,2,3,3,3,3,4,4,5,5,5};
		practice26 p= new practice26();
		int ans = p.removeDuplicates(nums);
		for (int i=0; i<ans; i++) {
			System.out.println(nums[i]);
		}
	}

}
