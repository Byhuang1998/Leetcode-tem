import java.util.Scanner;
import java.util.ArrayList;
public class test {
	static ArrayList<Integer> list = new ArrayList<>();
	public int getMax(int[] arr) {
		int len = arr.length;
		int tem = arr[0];
		for (int i=1; i<len; ++i) {
			if (arr[i] > tem) {
				tem = arr[i];
			}
		}
		return tem;
		
	}
	
	public void getMaxIndex(int[] arr, int max) {
		int len = arr.length;
		for (int i=0; i<len; i++) {
			if (arr[i] == max) {
				list.add(i);
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test t = new test();
		Scanner in = new Scanner(System.in);
		// n个学生， m个学科
		int n = in.nextInt();
		int m = in.nextInt();
		int[][] arr = new int[n][m];
		for (int i=0; i<n; i++) {
			for (int j=0; j<m; j++) {
				arr[i][j] = in.nextInt();
			}
		}
		in.close();
		for (int i=0; i<m; ++i) {
			int[] subjects = new int[n];
			for (int j=0; j<n; ++j) {
				subjects[j] = arr[j][i];
			}
			t.getMaxIndex(subjects, t.getMax(subjects));
		}
		int[] flag = new int[n];
		for (int num : list) {
			flag[num] = 1;
		}
		int count = 0;
		for (int k=0; k<n; ++k) {
			if (flag[k] == 1) {
				count++;
			}
		}
		System.out.println(count);
	}

}
