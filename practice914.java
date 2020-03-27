import java.util.HashMap;
import java.util.ArrayList;
public class practice914 {

	public boolean hasGroupSizeX(int[] deck) {
		int len = deck.length;
		if (len<2) return false;
		
		int min = Integer.MAX_VALUE; // map键值对中最小的值
		HashMap<Integer, Integer> map = new HashMap<>();
		// 将所有数出现的次数存入HashMap中
		for (int i=0; i<len; ++i) {
			int cur = deck[i];
			if (! map.containsKey(cur)) map.put(cur, 1);
			else map.put(cur, map.get(cur)+1);
		}
		// 找出出现次数最小的数，那么X的取值一定是这个数的约数
		for (int v : map.values()) min = Math.min(min, v);
		if (min < 2) return false;
		// 求出min的所有约数，然后逐个代入尝试
		ArrayList<Integer> list = new ArrayList<>();
		list.add(min); // 自身也是约数，先放入
		for (int v=2; v<=min/2; ++v) {
			if (min % v == 0) list.add(v);
		} 
		for (int value : list) {
			int flag = 0;
			for (int v : map.values()) {
				if (v % value != 0) break;
				flag ++;
			}
			if (flag == map.size()) return true;
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		practice914 p = new practice914();
		int[] deck = {1,1,1,1,2,2,2,2,2,2};
		boolean b = p.hasGroupSizeX(deck);
		System.out.println(b);
	}

}
