import java.util.HashMap;
public class practice70 {
	public int climbStairs(int n) {
		HashMap<Integer, Integer> map = new HashMap<>();
		map.put(1,1); map.put(2, 2);
		for (int i=3; i<100; ++i) map.put(i, map.get(i-1)+map.get(i-2));
		return map.get(n);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		practice70 p = new practice70();
		System.out.println(p.climbStairs(45));
	}

}
