
public class practice14 {

	public String longestCommonPrefix(String[] strs) {
		   if (strs.length == 0) return "";
		   String prefix = strs[0];
		   for (int i = 1; i < strs.length; i++)
		       while (strs[i].indexOf(prefix) != 0) {
		           prefix = prefix.substring(0, prefix.length() - 1);
		           if (prefix.isEmpty()) return "";
		       }        
		   return prefix;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		practice14 p = new practice14();
		String[] strs = {"flower","flight","flow"};
		System.out.println(p.longestCommonPrefix(strs));
	}
}