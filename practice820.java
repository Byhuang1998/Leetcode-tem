
import java.util.LinkedList;
import java.util.List;
import java.util.HashMap;
public class practice820 {

	public int minimumLengthEncoding(String[] words) {
		// 去除空字符串
		words = this.deleteBlank(words);
		int num = words.length;
		if (num == 0) return 0;
		// 将字符串按长度从大到小排序
		words = this.sort(words);
		// 定义一个HashMap，记录字符串之间的包含情况
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i=0; i<num-1; ++i) {
			for (int j=i+1; j<num; ++j) {
				// 如果words[i]包含words[j]，将i,j置入map中，且只保留最大包含的
				if (this.isContain(words[i], words[j])) {
				map.put(i, j);
				break;
				}
			}
		}
		String ans = words[0] + "#";
		int[] flag = new int[num];
		for (int i=1; i<num; i++) {
			if (map.containsValue(i)) {
				// 意味着words[i]包含于此前的某个字符串
				flag[i] = 1;
			} else {
				// 未被包含，那么需要将这个字符串加入ans
				ans += words[i] + "#";
			}
		}
		System.out.println(ans);
		return ans.length();
	}
	// 将字符串数组按照其长度由大到小排序
	private String[] sort(String[] words) {
		int num = words.length;
		for (int i=0; i<num; ++i) {
			int curLen = words[i].length();
			int flag = i;
			for (int j=i; j<num; ++j) {
				if (words[j].length() > curLen) {
					curLen = words[j].length();
					flag = j;
				}
			}
			String tem = words[i];
			words[i] = words[flag];
			words[flag] = tem;
		}
		return words;
	}
	
	// 默认a的长度大于b的长度，且都不为0
	private boolean isContain(String a, String b) {
		int len1 = a.length();
		int len2 = b.length();
		for (int i=len2-1; i>=0; --i) {
			if (b.charAt(i) != a.charAt(i+len1-len2)) return false;
		}
		return true;
	}
	
	// 去除空的字符串
	private String[] deleteBlank(String[] words) {
		int num = words.length;
		if (num == 0) return new String[0];
		List<String> list = new LinkedList<>();
		for (int i=0; i<num; ++i) {
			if (words[i] != "") list.add(words[i]);
		}
		String[] ans = (String[]) (list.toArray(new String[list.size()]));
		return ans;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] ss = {"abcde","bcde","cde","de"};
		practice820 p = new practice820();
		int len = p.minimumLengthEncoding(ss);
		System.out.println(len);
	}
}
