import java.util.HashMap;
public class practice914 {

	public boolean hasGroupSizeX(int[] deck) {
		int len = deck.length;
		if (len<2) return false;
		
		HashMap<Integer, Integer> map = new HashMap<>();
		// 将所有数出现的次数存入HashMap中
		for (int i=0; i<len; ++i) {
			int cur = deck[i];
			if (! map.containsKey(cur)) map.put(cur, 1);
			else map.put(cur, map.get(cur)+1);
		}
		int gcd = 0;
		for (int value : map.values()) {
			if (gcd == 0) {
				gcd = value;
			}
			gcd = this.gcd(gcd, value);
		}
		return gcd>1;
	}
	public int gcd(int a, int b) {
		if (b == 0) return a;
		if (a<b) return gcd(b, a);
		return gcd(b, a%b);
	} 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		practice914 p = new practice914();
		int[] deck = {1,1,1,1,2,2,2,2,2,2};
		boolean b = p.hasGroupSizeX(deck);
		System.out.println(b);
	}

}
