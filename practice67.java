
public class practice67 {

	public String addBinary(String a, String b) {
		int len1 = a.length();
		int len2 = b.length();
		int len = Math.max(a.length(), b.length());
		String ans = "";
		int flag = 0;
		for (int i=0; i<len; i++) {
			int cur1 = i<len1 ? a.charAt(len1-1-i)-48 : 0;
			int cur2 = i<len2 ? b.charAt(len2-1-i)-48 : 0;
			int cur = cur1 + cur2 + flag;
			flag = cur / 2;
			ans = cur%2 + ans;
		}
		if (flag==1) ans = 1+ans;
		return ans;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = "1010";
		String b = "1011";
		practice67 p = new practice67();
		String ans = p.addBinary(a, b);
		System.out.println(ans);
	}

}
