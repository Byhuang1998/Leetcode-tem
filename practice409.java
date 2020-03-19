
public class practice409 {

	public int longestParlindrome(String s) {
		int len = s.length();
		if (len==0 || len==1) return len;
		int res = 0;
		int flag = 0;
		int[] map = new int[123];
		for (char cur : s.toCharArray()) map[cur]++;
		for (int num : map) {
			// ÆæÊý
			if (num%2 != 0) {
				res += num-1;
				flag =1;
			} else res += num; // Å¼Êý
		}
		return res+flag;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		practice409 p = new practice409();
		String s = "abccccdd";
		int res = p.longestParlindrome(s);
		System.out.println(res);
	}

}
