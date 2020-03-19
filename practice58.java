
public class practice58 {

	public int lengthOfLastWord(String s) {
		if (s.length()==0) return 0;
		int i = s.length()-1;
		while (i>=0 && s.charAt(i) == ' ') {
			i--;
		}
		int j = i;
		while (j>=0 && s.charAt(j) != ' ') {
			--j;
		}
		return i-j;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = " ";
		System.out.println(new practice58().lengthOfLastWord(s));

	}

}
