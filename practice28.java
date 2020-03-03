
public class practice28 {
	
	public int strStr(String haystack, String needle) {
		int lenH = haystack.length();
		int lenN = needle.length();
		if (lenN==0) return 0;
		int pH = 0;
		int pN = 0;
		while (pH <= lenH-lenN) {
			if (haystack.charAt(pH) == needle.charAt(pN)) {
				for (int i=0; i<lenN; i++) {
					if (haystack.charAt(pH+i) == needle.charAt(pN+i)) {
						if (i == lenN-1) return pH;
						continue;
					} else {
						pH++;
						break;
					}					
				}
			} else {
				pH++;
			}
		}
		
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		practice28 p = new practice28();
		String haystack = "mississippi";
		String needle = "issip";
		int ans = p.strStr(haystack, needle);
		System.out.println(ans);
	}

}
