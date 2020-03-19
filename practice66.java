import java.util.Arrays;

public class practice66 {

	public int[] plusOne(int[] digits) {
		if (this.isAllNine(digits)) {
			int[] ans = new int[digits.length+1];
			ans[0] = 1;
			return ans;
		}
		int len = digits.length;
		int[] ans = digits;
		int i = len-1;
		while (digits[i]==9) {
			ans[i] = 0;
			--i;
		}
		ans[i] += 1;
		return ans;
	}
	
	public boolean isAllNine(int[] digits) {
		for (int i=0; i<digits.length; ++i) {
			if (digits[i] != 9) return false;
 		}
		return true;
	}
	
	public int[] carry(int[] digits) {
		
		return null;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] digits = {9,9,9,9,8,7};
		practice66 p = new practice66();
		int[] ans = p.plusOne(digits);
		System.out.println(Arrays.toString(ans));
	}

}
