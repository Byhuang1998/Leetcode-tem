
public class practice242 {

	public boolean isAnagram(String s, String t) {
		int l1 = s.length();
		int l2 = t.length();
		if (l1 != l2) return false;
		int[] ss = new int[26];
		int[] tt = new int[26];
		for (int i=0; i<l1; i++) {
			ss[s.charAt(i) - 'a'] ++;
			tt[t.charAt(i) - 'a'] ++;
		}
		for (int i=0; i<26; i++) {
			if (ss[i] != tt[i]) {
				return false;
			}
		}
		return true;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abcd";
		String t = "bcad";
		practice242 p = new practice242();
		System.out.println(p.isAnagram(s, t));
	}

}
