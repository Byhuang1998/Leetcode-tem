import java.util.Arrays;
public class practice350 {

	public int[] intersect(int[] nums1, int[] nums2) {
		int n1 = nums1.length;
		int n2 = nums2.length;
		if (n1 == 0 || n2 == 0) return new int[0];
		Arrays.sort(nums1);
		Arrays.sort(nums2);
		int i=0, j=0, k=0;
		int[] res = new int[n1];
		while (i < n1 && j < n2) {
			if (nums1[i] == nums2[j]) {
				res[k++] = nums1[i];
				i ++;
				j ++;
			} else if (nums1[i] < nums2[j]) {
				i++;
			} else {
				j++;
			}
		}
		return Arrays.copyOfRange(res, 0, k);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1 = {4,9,5};
		int[] nums2 = {9,4,9,8,4};
		practice350 p = new practice350();
		System.out.println(Arrays.toString(p.intersect(nums1, nums2)));
	}

}
