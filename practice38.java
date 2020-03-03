
public class practice38 {

	public String countAndSay(int n) {
		if (n==1) return "1";
		String tem = "1";
		for (int i=1; i<n; i++) {
			tem = change(tem);
		}
		return tem;
	}
	
	public String change(String s) {
		int len = s.length();
		if (len == 1) return "11";
		int i=0;
		int j=0;
		int x=0;
		String res = "";
		while (true) {
			i = x;
			if (i == len-1) return res+ 1 + s.charAt(i);
			j = x+1;
			while (true) {
				if (j!=len && s.charAt(i) == s.charAt(j)) {
					j++;
					continue;
				} else {
					res = res + (j-i) + s.charAt(i);
					if (j==len) return res;
					x = j;
					break;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		practice38 p = new practice38();
		int n = 5;
		String res = p.countAndSay(n);
		int len = res.length();
		for (int i=0; i<len; i++) {
			System.out.println(res.charAt(i));
		}
	}

}
