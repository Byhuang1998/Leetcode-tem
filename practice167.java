
public class practice167 {
	
	public int[] twoNum(int[] numbers, int target) {
		int len = numbers.length;
		int start = 0;
		int end = len-1;
		while(start != end) {
			if (numbers[start] + numbers[end] == target) {
				return new int[] {start+1, end+1};
			}
			else if (numbers[start] + numbers[end] < target)
				start++;
			else
				end--;
		}		
		return new int[] {-1,-1};
	}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums =  {2,7,11,15};
		int target = 9;
		practice167 p = new practice167();
		int[] ans = p.twoNum(nums, target);
		for (int i=0; i<2; i++) {
			System.out.println(ans[i]);	
		}
	}
}
