import java.util.Scanner;

public class Main4 {

	// 已排好序的数组
	public int[] getPos(int[] arr, int n, int k) {
		int[] pos = new int[2];
		for (int i=0; i<n; i++) {
			if(arr[i] == k) {
				pos[0] = i;
				int j = i;
				while (true) {
					if (j == n || arr[j] != k) {
						pos[1] = j-1;
						break;
					}
					j++;
				}
			}
		}
		return pos;
	}
	// 选择排序
	public void select(int[] nums) {
		int len = nums.length;
		for (int i=0; i<len; i++) {
			int flag = i;
			int cur = nums[i];
			for (int j=i; j<len; ++j) {
				if (nums[j]<cur) {
					flag = j;
					cur = nums[j];
				}
			}
			int tem = nums[flag];
			nums[flag] = nums[i];
			nums[i] = tem;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main4 m = new Main4();
		Scanner in = new Scanner(System.in);
		int n = in.nextInt(); 
		int k = in.nextInt();
		int[] arr = new int[n];
		for (int i=0; i<n; ++i) {
			arr[i] = in.nextInt();
		}
		in.close();
		m.select(arr);
		for (int i=0; i<n; i++) {
			if (arr[i] == k) {
				break;
			}
		}
		int[] pos = m.getPos(arr, n, k);
		int start = pos[0];
		int end = pos[1];
		int count = 0;
		
		int tem = (n + 1) / 2;
		if (start <= tem && tem <= end) {
			count = 0;
		} else if (end < tem) {
			while (true) {
				if ((n+count+1) / 2 == start +1 +count) {
					break;
				}
				count++;
			}
		} else {
			while (true) {
				if ((n+count+1) / 2 == end + 1) {
					break;
				}
				count++;
			}
		}
		
		System.out.println(count);
	}
}
