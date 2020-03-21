
public class practice69 {

	public int mySqrt(int x) {
		if (x < 2) return x;
		for (long i=1; i<=x/2; ++i) {
			// 这样会有溢出,i用long型
			if (i*i<=x && (i+1)*(i+1)>x) return (int)i;
		}
		return 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		practice69 p = new practice69();
		int ans = p.mySqrt(2147395600);
		System.out.println(ans);
		
	}

}
