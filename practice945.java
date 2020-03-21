import java.util.Arrays;

public class practice945 {

	public int minIncrementForUnique(int[] A) {
		int len = A.length;
		if (len<2) return 0;
		int count = 0;
		Arrays.parallelSort(A);
		for (int i=1; i<len; ++i) {
			while (A[i]<=A[i-1]) {
				A[i]++;
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		practice945 p = new practice945();
		int[] A = {1,2,2};
		int ans = p.minIncrementForUnique(A);
		System.out.println(ans);
				
	}

}
