import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

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
		int[][] res = new int[R * C][];
		boolean[][] isVisit = new boolean[R][C];
		int index = 0;
		res[index++] = new int[] {r0,c0};
		isVisit[r0][c0] = true;
		Queue<Integer> x = new LinkedList<>();
		Queue<Integer> y = new LinkedList<>();
		int[] ii = {-1,1,0,0}, jj = {0,0,-1,1};
		x.offer(r0);
		y.offer(c0);
		while (! x.isEmpty()) {
			int cur_x = x.poll();
			int cur_y = y.poll();
			for (int i = 0; i < 4; i++) {
				int nx = cur_x + ii[i];
				int ny = cur_y + jj[i];
				if (nx >= 0 && nx < R && ny >= 0 && ny < C && isVisit[nx][ny] == false) {
					res[index++] = new int[] {nx, ny};
					isVisit[nx][ny] = true;
					x.offer(nx);
					y.offer(ny);
				}
			}
		}
		return res;
	}

}
