
public class practice365 {
	
	public int gcd(int a, int b) {
		if (a == 0) return b;
		if (a > b) return gcd(b, a);
		return gcd(a, b%a);
	}
	
    public boolean canMeasureWater(int x, int y, int z) {
    	if (z==0) return true;
    	if (z > x+y) return false;
    	return z % this.gcd(x, y) == 0;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		practice365 p = new practice365();
		boolean ans = p.canMeasureWater(4, 6, 8);
		System.out.println(ans);
	}

}
