import java.util.HashMap;
public class practice409 {

	public int longestParlindrome(String s) {
		int len = s.length();
		if (len==0 || len==1) return len;
		int flag = 0;
		HashMap<Character, Integer> map = new HashMap<>();
		int res = 0;
		for (int i=0; i<len; ++i) {
			char cur = s.charAt(i);
			if (!map.containsKey(cur)) map.put(cur, 1);
			else map.put(cur, map.get(cur)+1);
		}
		for (char cur: map.keySet()) {
			// 奇数
			if (map.get(cur)%2!=0) {
				res+=map.get(cur)-1;
				flag = 1; // 如果存在奇数，则最后必定要加上一个数，作为最中间的数
			}
			else res+=map.get(cur);
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
