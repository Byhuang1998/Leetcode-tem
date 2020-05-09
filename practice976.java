import java.util.Arrays;

public class practice976 {

	public int largestPerimeter(int[] A) {
		Arrays.sort(A);
		for (int l = A.length - 3; l >= 0; l--) {
			if (A[l+2] < A[l+1] + A[l]) {
				return A[l+2] + A[l+1] + A[l];
			}
		}
		
		return 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
