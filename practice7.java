
public class practice7 {

	public int reverse(int x) {
		int ans = 0;
		while (x != 0) {
			int num = x % 10;
			x = x / 10;
			if (ans > Integer.MAX_VALUE / 10 || (ans == Integer.MAX_VALUE && num == 7)) return 0;
			if (ans < Integer.MIN_VALUE / 10 || (ans == Integer.MIN_VALUE && num == -8)) return 0;
			ans = ans*10 + num;
		}
		return ans;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		practice7 p = new practice7();
		System.out.println(p.reverse(-123456));
	}

}
