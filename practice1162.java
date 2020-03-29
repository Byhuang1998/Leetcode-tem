
import java.util.Arrays;
import java.util.Queue;
import java.util.LinkedList;
public class practice1162 {

	public int maxDistance(int[][] grid) {
		int N = grid.length;
		if (N < 2) return 0;
		// 方向
		int[] ii = {1,-1,0,0};
		int[] jj = {0,0,1,-1};
		int max = 0;
		int res = 0;
		// Map<Integer, Integer> map = new HashMap<>();
		int[] map = new int[N * N];
		// 初始化map，当前为陆地时，标记距离为0，当前为海进，标记距离为无限大
		for (int i=0; i<N; ++i) {
			for (int j=0; j<N; ++j) {
				res += grid[i][j];
				int pos = i * N + j;
				if (grid[i][j] == 1) map[pos] = 0;
				else map[pos] = Integer.MAX_VALUE;
			}
		}
		if (res == N*N || res == 0) return -1;
		Queue<Integer> q_pos = new LinkedList<>();
		for (int k=0; k<N*N; ++k) {
			if (map[k] == 0) {
				// 大陆的位置
				q_pos.offer(k);
			}
		}
		int[][] flag = this.initial(N);
		while (! q_pos.isEmpty()) {
			// 出队
			int cur_pos = q_pos.poll();
			int cur_i = cur_pos / N; int cur_j = cur_pos % N;
			// 用于标记是否被访问过
			// 上下左右四个方向
			for (int k=0; k<4; ++k) {
				int ni = cur_i + ii[k]; int nj = cur_j + jj[k];
				if (ni>=0 && ni<N && nj>=0 && nj<N && grid[ni][nj]==0 && flag[ni][nj]==0) {
					int npos = ni * N + nj;
					q_pos.offer(npos);
					map[npos] = Math.min(map[npos], map[cur_pos] + 1);
					max = Math.max(max, map[npos]);
					flag[ni][nj] = 1;
				}
			}
		}
		
		System.out.println(Arrays.toString(map));
		return max;
	}
	
	private int[][] initial(int N) {
		int[][] flag = new int[N][N];
		for (int i=0; i<N; ++i) {
			for (int j=0; j<N; ++j) {
				flag[i][j] = 0;
			}
		}
		return flag;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] grid = {{0,0,0},{0,0,0},{0,0,0}};
		practice1162 p = new practice1162();
	    int max = p.maxDistance(grid);
	    System.out.println(max);
	}

}
