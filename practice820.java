
import java.util.LinkedList;
import java.util.List;
import java.util.HashMap;
public class practice820 {

	public int minimumLengthEncoding(String[] words) {
		// ȥ�����ַ���
		words = this.deleteBlank(words);
		int num = words.length;
		if (num == 0) return 0;
		// ���ַ��������ȴӴ�С����
		words = this.sort(words);
		// ����һ��HashMap����¼�ַ���֮��İ������
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i=0; i<num-1; ++i) {
			for (int j=i+1; j<num; ++j) {
				// ���words[i]����words[j]����i,j����map�У���ֻ������������
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
				// ��ζ��words[i]�����ڴ�ǰ��ĳ���ַ���
				flag[i] = 1;
			} else {
				// δ����������ô��Ҫ������ַ�������ans
				ans += words[i] + "#";
			}
		}
		System.out.println(ans);
		return ans.length();
	}
	// ���ַ������鰴���䳤���ɴ�С����
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
	
	// Ĭ��a�ĳ��ȴ���b�ĳ��ȣ��Ҷ���Ϊ0
	private boolean isContain(String a, String b) {
		int len1 = a.length();
		int len2 = b.length();
		for (int i=len2-1; i>=0; --i) {
			if (b.charAt(i) != a.charAt(i+len1-len2)) return false;
		}
		return true;
	}
	
	// ȥ���յ��ַ���
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
