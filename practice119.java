import java.util.ArrayList;
import java.util.List;
public class practice119 {

	public List<Integer> getRow(int rowIndex) {
		List<Integer> list = new ArrayList<>();
 		list.add(1);
 		if (rowIndex == 0) return list;
		list.add(1);
		if (rowIndex == 1) return list;
		for (int i=2; i<=rowIndex; ++i) {
			// 是偶数列，意味着这一行有奇数个数
			int size = list.size();
			int j = 0;
			if (i % 2 == 0) {
				for (j=1; j<i/2; ++j) {
					list.set(j, list.get(i-j) + list.get(i-j-1)); 
				}
				list.set(i/2, 2 * list.get(i/2));
				for (j=i/2+1; j<=i; ++j) {
					size = list.size();
					if (j >= size) list.add(0);
					list.set(j, list.get(i-j)); 
				}
			}
			// 奇数列，意味着这一行有偶数个数
			else {
				for (j=1; j<=i/2; ++j) {
					list.set(j, list.get(i-j) + list.get(i-j-1)); 
				}
				for (j=i/2+1; j<=i; ++j) {
					size = list.size();
					if (j >= size) list.add(0);
					list.set(j, list.get(i-j)); 
				}
			}
		}
		return list;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		practice119 p = new practice119();
		List<Integer> ans = p.getRow(6);
		System.out.println(ans);
	}

}
