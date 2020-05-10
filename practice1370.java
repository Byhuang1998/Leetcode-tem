import java.util.Arrays;

public class practice1370 {

	public String sortString(String s) {
		int len = s.length();
		char[] sc = s.toCharArray();
		int[] letter = new int[26];
		for (char c : sc) {
			letter[c - 'a']++;
		}
		char[] ans = new char[len];
		int index = 0;
		while (index < len) {
			for (int i=0; i<26; ++i) {
				if (letter[i] != 0) {
					ans[index++]= (char)(i + 'a');
					letter[i]--;
				}
			}
			for (int i=25; i>=0; i--) {
				if (letter[i] != 0) {
					ans[index++] = (char)(i + 'a');
					letter[i]--;
				}
				
			}
		}
		return new String(ans);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		practice1370 p = new practice1370();
		String s = "spo";
		String res = p.sortString(s);
		System.out.println(res);
	}

}
