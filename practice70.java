
public class practice70 {
	public int climbStairs(int n) {
		if (n < 3) return n;
		int[] map = new int[n+1];
		map[1] = 1; map[2] = 2;
		for (int i=3; i<=n; ++i) map[i] = map[i-1] +map[i-2];
		return map[n];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		practice70 p = new practice70();
		System.out.println(p.climbStairs(1));
	}

}
