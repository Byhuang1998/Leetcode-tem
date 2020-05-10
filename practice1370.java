import java.util.Arrays;

public class practice1370 {

	public String sortString(String s) {
		char[] sc = s.toCharArray();
		boolean[] isVisit = new boolean[s.length()];
		Arrays.sort(sc);
		String res = "";
		
		while (notEnd(isVisit)) {
			int i = 0, j = sc.length - 1;
			char tem = '0';
			while (i < sc.length) {
				if (sc[i] != tem && isVisit[i] == false) {
					res += sc[i];
					isVisit[i] = true;
					tem = sc[i];
					i++;
				} else {
					i++;
				}
			}
			tem = '0';
			while (j >= 0) {
				if (sc[j] != tem && isVisit[j] == false) {
					res += sc[j];
					isVisit[j] = true;
					tem = sc[j];
					j--;
				} else {
					j--;
				}
			}
		}
		return res;
	}
	
	public boolean notEnd(boolean[] isVisit) {
		for (boolean b : isVisit) {
			if (b == false) return true;
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		practice1370 p = new practice1370();
		String s = "spo";
		String res = p.sortString(s);
		System.out.println(res);
	}

}
