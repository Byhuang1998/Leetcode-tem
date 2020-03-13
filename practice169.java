import java.util.ArrayList;
public class practice169 {

	public int majorityElement(int[] nums) {
		int len = nums.length;
		ArrayList<Integer> list = new ArrayList<>();
		int index = 0;
		for (int i=0; i<len; i++) {
			if (!list.contains(nums[i])) list.add(nums[i]);
		}
		int size = list.size();
		int record = 0;
		int ans = 0;
		sign: for (int i=0; i<size; i++) {
			int count = 0;
			for (int j=0; j<len; j++) {
				if (nums[j] == list.get(i)) count++;
			}
			if (count>len/2) {
				record = count;
				index = i;
				ans = list.get(i);
				break sign;
			}
		}
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		practice169 p = new practice169();
		int[] nums = {4,4,4,5,5,5,5};
		int ans = p.majorityElement(nums);
		System.out.println(ans);

	}

}
