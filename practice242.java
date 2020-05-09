
public class practice242 {

	public boolean isAnagram(String s, String t) {
		int l1 = s.length();
		int l2 = t.length();
		if (l1 != l2) return false;
		char[] sc = s.toCharArray();
		char[] tc = t.toCharArray();
		sortString(sc, l1);
		sortString(tc, l2);
		for (int i=0; i<l1; i++) {
			if (sc[i] != tc[i]) {
				return false;
			}
		}
		return true;
	}
	
	public void sortString(char[] sc, int l1) {
		for (int i=0; i<l1; i++) {
			char cur = sc[i];
			int index = i;
			for (int j=i; j<l1; j++) {
				if (sc[j] < cur) {
					cur = sc[j];
					index = j;
				}
			}
			swap(sc, i, index);
		}
	}

	private void swap(char[] sc, int i, int index) {
		// TODO Auto-generated method stub
		char tem = sc[i];
		sc[i] = sc[index];
		sc[index] = tem;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abcd";
		String t = "bcad";
		practice242 p = new practice242();
		System.out.println(p.isAnagram(s, t));
	}

}
