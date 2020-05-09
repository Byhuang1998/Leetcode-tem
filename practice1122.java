import java.util.Arrays;

public class practice1122 {

	public int[] relativeSortArray(int[] arr1, int[] arr2) {
		int m = arr1.length;
		int n = arr2.length;
		int index = 0;
		for (int i=0; i<n; i++) {
			int cur = arr2[i];
			for (int j=index; j<m; j++) {
				if (arr1[j] == cur) {
					swap(arr1, index, j);
					index ++;
				}
			}
		}
		sort(arr1, m, index);
		return arr1;
	}
	
	public void swap(int[] arr1, int i, int j) {
		int cur = arr1[i];
		arr1[i] = arr1[j];
		arr1[j] = cur;
	}
	
	public void sort(int[] arr1, int m, int index) {
//		int n = m - index;
		for (int i=index; i<m; i++) {
			int k = i;
			int cur = arr1[i];
			for (int j=i; j<m; j++) {
				if (arr1[j] < cur) {
					cur = arr1[j];
					k = j;
				}
			}
			swap(arr1, i, k);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		practice1122 p = new practice1122();
		
		int[] arr1 = {2,3,1,3,2,4,6,9,2,7, 16, 8};
		int[] arr2 = {2,1,4,3,9,6};
		int [] res = p.relativeSortArray(arr1, arr2);
		System.out.println(Arrays.toString(res));
	}

}
