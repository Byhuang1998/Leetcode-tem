import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;

class practice349 {
	
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
			s1.add(nums1[i]);
		}
        for (int i = 0; i < nums2.length; i++) {
			s2.add(nums2[i]);
		}
        int[] res = new int[nums1.length];
        int index = 0;
        for (int i : s2) {
			if (s1.contains(i)) {
				res[index++] = i;
			}
		}
        return Arrays.copyOf(res, index);
    }
    
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1 = {1,2,2,1};
		int[] nums2 = {1,2};
		practice349 p = new practice349();
		System.out.println(Arrays.toString(p.intersection(nums1, nums2)));
    	
    }
    
}