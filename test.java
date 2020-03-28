
import java.util.HashMap;
class TireNode {
	int count = 0;
	TireNode[] children = new TireNode[26];
	public TireNode get(char c) {
		if (children[c-'a'] == null) {
			children[c-'a'] = new TireNode();
			count ++;
		}
		return children[c-'a'];
	}
}

public class test {
	public int minimumLengthEncoding(String[] words) {
		int ans = 0;
		HashMap<TireNode, Integer> map = new HashMap<>();
		int num = words.length;
		TireNode root = new TireNode();
		for (int i=0; i<num; ++i) {
			TireNode cur_root = root;
			String word = words[i];
			for (int j=word.length()-1; j>=0; --j) {
				cur_root = cur_root.get(word.charAt(j));
			}
			map.put(cur_root, i);
		}
		for (TireNode tn : map.keySet()) {
			if (tn.count == 0) ans += words[map.get(tn)].length() + 1;
		}
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test p = new test();

		String[] ss = {"time", "me", "bell"};
		int len = p.minimumLengthEncoding(ss);
		System.out.println(len);

	}

}
