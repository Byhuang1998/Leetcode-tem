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
		// ���ڱ���Ƿ���ʹ�
		// ��������0��λ��ӳ�䵽0
		for (int i = 0; i < row; ++i) {
			for (int j = 0; j < col; ++j) {
				if (matrix[i][j] == 0) {
					qi.offer(i);
					qj.offer(j);
				} else {
					// ������1��λ�ñ��Ϊ1����ʾ��δ�����ʹ�
					matrix[i][j] = -1;
				}
			}
		}
		// ��Դ�����������
		while (! qi.isEmpty()) {
			// ȡ��һ��Ϊ0��
			int t_i = qi.poll();
			int t_j = qj.poll();
			for (int k=0; k<4; ++k) {
				int ni = t_i + ii[k];
				int nj = t_j + jj[k];
				if (ni>=0 && ni<row && nj>=0 && nj<col && matrix[ni][nj] == -1) {
					matrix[ni][nj] = matrix[t_i][t_j] + 1;
					// ���µ�Ҳѹ�����
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
