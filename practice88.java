import java.util.Arrays;

public class practice88 {

	public void merge(int[] nums1, int m, int[] nums2, int n) {
		int i=m-1;
		int j=n-1;
		for (int k=m+n-1; k>=0; --k) {
			// ·ÀÖ¹Ö¸ÕëÔ½½ç
			int cur1 = i>=0 ? nums1[i] : Integer.MIN_VALUE;
			int cur2 = j>=0 ? nums2[j] : Integer.MIN_VALUE;
			if (cur1>cur2) {
				nums1[k] = cur1;
				i--;
			} else {
				nums1[k] = cur2;
				j--;
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1 = {1,2,3,0,0,0}; int m = 3;
		int[] nums2 = {2,5,6}; int n = 3;
		practice88 p = new practice88();
		p.merge(nums1, m, nums2, n);
		System.out.println(Arrays.toString(nums1));
	}

}
