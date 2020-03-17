import java.util.Stack;
public class practice1160 {

	public int countCharacters(String[] words, String chars) {
		int len = words.length;
		if (len==0) return 0;
		int res = 0;
		int num = chars.length();
		for (int i=0; i<len; ++i) {
			Stack<Character> s = new Stack<>();
			for (int j=0; j<num; ++j) s.push(chars.charAt(j));//将所有字母都压入栈中
			String cur = words[i];
			int cur_len = cur.length();
			int count= 0;
			for (int k=0; k<num; ++k) {				
				String tem = s.pop()+"";
				if (cur.contains(tem)) {
					cur = cur.replaceFirst(tem, "");
					count++;
					
				}
				if (s.isEmpty() && !cur.isEmpty()) {
					count = 0;
					break;
				}
			}
			res += count;
		}
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		practice1160 p = new practice1160();
		String[] words = {"hello","world","leetcode"};
		String chars = "welldonehoneyr";
		int res = p.countCharacters(words, chars);
	    System.out.println(res);
		
	}

}
