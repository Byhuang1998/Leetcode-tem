import java.util.Arrays;

public class practice1122 {

	public int[] relativeSortArray(int[] arr1, int[] arr2) {
		int m = arr1.length;
		int n = arr2.length;
		int[] count = new int[1001];
		// ¼ÆÊý
		for (int i=0; i<m; i++) {
			count[arr1[i]] ++;
		}
		int index = 0;
		for (int i=0; i<n; i++) {
			int cur = arr2[i];
			for (int j=0; j<count[cur]; j++) {
				arr1[index++] = cur;
			}
			count[cur] = 0;
		}
		for (int i=0; i<1001; i++) {
			if (count[i] != 0) {
				for (int j=0; j<count[i]; j++) {
					arr1[index++] = i;
				}
			}
		}
		return arr1;	
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
