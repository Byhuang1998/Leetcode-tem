
public class practice69 {

	public int mySqrt(int x) {
		if (x < 2) return x;
		int left = 2;
		int right = x/2;
		int mid;
		int flag=0;
		while (left<right) {
			flag = left + right;
			mid = (left+right)/2;
			long num = mid * mid;
			if (num<x) left = mid;
			else if (num > x) right = mid-1;
			else return mid;
			if (flag == left + right) break; // ×óÓÒÎ´¸üĞÂ
		}
		return left;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		practice69 p = new practice69();
		int ans = p.mySqrt(17);
		System.out.println(ans);
		
	}

}
