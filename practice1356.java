import java.util.Arrays;

public class practice1356 {

	public int[] sortByBits(int[] arr) {
		int index = 0;
		String[] ss = new String[arr.length];
		for (int num : arr) {
			ss[index++] = Integer.toBinaryString(num);
		}
		Arrays.sort(ss, (s1, s2) -> {
			int n1 = numOfOne(s1);
			int n2 = numOfOne(s2);
			if (n1 == n2) return Integer.compare(Integer.parseInt(s1, 2), Integer.parseInt(s2, 2));
			return Integer.compare(n1, n2);
		});
		System.out.println(Arrays.toString(ss));
		int[] res = new int[arr.length];
		int i = 0;
		for (String s : ss) {
			res[i++] = Integer.parseInt(s, 2);
		}
		return res;
		
	}
	private int numOfOne(String s1) {
		// TODO Auto-generated method stub
		char[] sc = s1.toCharArray();
		int cnt = 0;
		for (char c : sc) {
			if (c == '1') {
				cnt ++;
			}
		}
		return cnt;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		practice1356 p = new practice1356();
		int[] arr = {1024,512,256,128,64,32,16,8,4,2,1};
		System.out.println(Arrays.toString(p.sortByBits(arr)));
	}

}
