import java.util.Scanner;

public class Main3 {

	// —°‘Ò≈≈–Ú
	public int[] select(int[] nums) {
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
		
		return nums;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main3 m = new Main3();
		Scanner in = new Scanner(System.in);
		int n = in.nextInt(); 
		int k = in.nextInt();
		int[] arr = new int[n];
		for (int i=0; i<n; ++i) {
			arr[i] = in.nextInt();
		}
		in.close();
		arr = m.select(arr);
		int x = k/n;
		int y = k%n==0 ? n-1 : k%n-1;
		System.out.println("("+arr[x]+","+arr[y]+")");
	}
}
