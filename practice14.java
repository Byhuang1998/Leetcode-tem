
public class practice14 {

	public String longestCommonPrefix(String[] strs) {
		String str = "";
		if (strs == null || strs.length == 0) return "";
		for(int j=0; j<strs[0].length(); j++) {
			char c = strs[0].charAt(j);
			for (int i=1; i<strs.length; i++) {
				if (strs[i].length() == j || strs[i].charAt(j) != c)
					return str;
			}
			str = str + strs[0].charAt(j);
		}
		// 当第一个字符串就是公共前缀时
		return strs[0];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		practice14 p = new practice14();
		String[] strs = {"flower","flight","flow"};
		System.out.println(p.longestCommonPrefix(strs));
	}
}