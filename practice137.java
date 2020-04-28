import java.util.HashSet;
import java.util.Set;
public class practice137 {
	

    public int singleNumber(int[] nums) {
		Set<Long> set = new HashSet<>();
		long s = 0;
		for (long num : nums) {
			set.add(num);
			s += num;
		}
		long sum = 0;
		for (long num : set) {
			sum += num;
		}
		
		return (int)((sum * 3 - s) / 2);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
