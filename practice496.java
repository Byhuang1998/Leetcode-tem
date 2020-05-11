
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class practice496 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
    	Stack<Integer> s = new Stack<>();
    	Map<Integer, Integer> map = new HashMap<>();
    	for (int i = 0; i < nums2.length; i++) {
			while (! s.isEmpty() && nums2[i] > s.peek()) {
				map.put(s.pop(), nums2[i]);
			}
			s.push(nums2[i]);
		}
    	while (! s.isEmpty()) {
    		map.put(s.pop(), -1);
    	}
    	int[] res = new int[nums1.length];
    	for (int i = 0; i < nums1.length; i++) {
			res[i] = map.get(nums1[i]);
		}
    	return res;    	
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
