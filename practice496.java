import java.util.HashMap;
import java.util.Map;

public class practice496 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums2.length; i++) {
            map.put(nums2[i], i);
        
        }
        int[] res = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            res[i] = getIndex(nums2, map, nums1[i]);
        }
        return res;
    }
    private int getIndex(int[] nums2, Map<Integer, Integer> map, int target) {
        for (int i = map.get(target) + 1; i < nums2.length; i++) {
            if (nums2[i] > target) {
                return nums2[i];
            }
        }
        return -1;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
