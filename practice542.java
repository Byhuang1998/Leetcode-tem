import java.util.Queue;
import java.util.LinkedList;
public class practice542 {

	public int[][] updateMatrix(int[][] matrix) {
		Queue<Integer> qi = new LinkedList<>();
		Queue<Integer> qj = new LinkedList<>();
		int row = matrix.length;
		int col = matrix[0].length;
		int[] ii = {0, -1, 1, 0};
		int[] jj = {-1, 0, 0, 1};
		// 用于标记是否访问过
		// 将所有是0的位置映射到0
		for (int i = 0; i < row; ++i) {
			for (int j = 0; j < col; ++j) {
				if (matrix[i][j] == 0) {
					qi.offer(i);
					qj.offer(j);
				} else {
					// 所有是1的位置标记为1，表示还未被访问过
					matrix[i][j] = -1;
				}
			}
		}
		// 多源广度优先搜索
		while (! qi.isEmpty()) {
			// 取出一个为0的
			int t_i = qi.poll();
			int t_j = qj.poll();
			for (int k=0; k<4; ++k) {
				int ni = t_i + ii[k];
				int nj = t_j + jj[k];
				if (ni>=0 && ni<row && nj>=0 && nj<col && matrix[ni][nj] == -1) {
					matrix[ni][nj] = matrix[t_i][t_j] + 1;
					// 将新的也压入队列
					qi.offer(ni);
					qj.offer(nj);
				}
			}
		}
		return matrix;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = {{0,0,0},{0,1,0},{1,1,1}};
		practice542 p = new practice542();
		int[][] ans = p.updateMatrix(matrix);
		for (int i=0; i<3; i++) {
			for (int j=0; j<3; j++) {
				System.out.print(ans[i][j]);
			}
			System.out.println();
		}

	}

}
