
public class practice58 {

	public int lengthOfLastWord(String s) {
		String[] ss = s.split(" ");
		if (ss.length==0) return 0;
		System.out.println(ss[ss.length-1].toString());
		return ss[ss.length-1].length();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Hello World";
		System.out.println(new practice58().lengthOfLastWord(s));

	}

}
