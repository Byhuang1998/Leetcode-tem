import java.util.Arrays;

public class practice1030 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		practice1030 p = new practice1030();
		int R = 3, C = 3, r0 = 0, c0 = 2;
		int[][] res = p.allCellsDistOrder(R, C, r0, c0);
		for (int i = 0; i < R*C; i++) {
			System.out.println(Arrays.toString(res[i]));
		}
	}


	private int[][] allCellsDistOrder(int R, int C, int r0, int c0) {
		// TODO Auto-generated method stub
		int[][] res = new int[R * C][2];
		for (int i = 0; i < R; i++) {
			for (int j = 0; j < C; j++) {
				int index = i * C + j;
				res[index][0] = i;
				res[index][1] = j;
			}
		}
		Arrays.sort(res, (o1, o2) -> {
			int d1 = dist(o1[0], o1[1], r0, c0);
			int d2 = dist(o2[0], o2[1], r0, c0);
			return Integer.compare(d1, d2);
		});
		return res;
	}


	private int dist(int i, int j, int r0, int c0) {
		// TODO Auto-generated method stub
		return Math.abs(i - r0) + Math.abs(j - c0);
	}

}
