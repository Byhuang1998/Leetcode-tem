
public class practice9 {

	public boolean isPalindrome(int x) {
		if (x<0 || (x!=0 && x%10 ==0)) return false;
				
		int revertedNumber = 0;
		while (x>revertedNumber) {
			revertedNumber = 10 * revertedNumber + x%10;
			x = x/10;
		}
		
		return x==revertedNumber || x==revertedNumber/10;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		practice9 p = new practice9();
		System.out.println(p.isPalindrome(12321));
		System.out.println(p.isPalindrome(12345));
	}

}
