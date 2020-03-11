
public class practice1013 {
	
	public boolean canThreePartsEqualSum(int[] A) {
		int len = A.length;
		if (len < 3) return false;
		int sum = 0;
		int part1 = 0;
		int part2 = 0;
		for (int i=0; i<len; i++) sum += A[i];
		if (sum%3 != 0) return false;
		int part = sum / 3;
		for (int i=0; i<len-2; i++) {
			part1 += A[i];
			if (part == part1) {
				for (int j=i+1; j<len-1; j++) {
					part2 += A[j]; 
					if (part2 == part) return true;
				}
			}
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {3,3,6,5,-2,2,5,1,-9,4};
		practice1013 p = new practice1013();
		boolean ans = p.canThreePartsEqualSum(A);
		System.out.println(ans);
	}

}
