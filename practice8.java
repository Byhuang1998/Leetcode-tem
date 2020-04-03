
public class practice8 {

	public int myAtoi(String str) {
		int pointer = 0;
		// Ìø¹ý¿Õ¸ñ
		while (pointer < str.length() && str.charAt(pointer) == ' ') pointer++;
		boolean negtive = false;
		if (pointer == str.length()) return 0;
		else if (str.charAt(pointer) == '-') {
			negtive = true;
			pointer ++;
		}
		else if (str.charAt(pointer) == '+') {
			pointer ++;
		}
		else if (str.charAt(pointer) > '9' || str.charAt(pointer) < '0') return 0;
		int ans = 0;
		while (pointer < str.length() && '0' <= str.charAt(pointer) && str.charAt(pointer) <= '9') {
			int digit = str.charAt(pointer) - '0';
			if (ans > (Integer.MAX_VALUE - digit) / 10) 
				return negtive ? Integer.MIN_VALUE : Integer.MAX_VALUE;
			ans = ans * 10 + digit;
			pointer ++;
		}
		return negtive ? -ans : ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		practice8 p = new practice8();
		int ans = p.myAtoi("2147483648");
		System.out.println(ans);

	}

}
