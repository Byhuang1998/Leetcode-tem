import java.util.Arrays;

public class practice289 {

	public void gameOfLife(int[][] board) {
		int row = board.length;
		int col = board[0].length;
		int[] ii = {-1,-1,-1,0,0,1,1,1};
		int[] jj = {-1,0,1,-1,1,-1,0,1};
		for (int i=0; i<row; ++i) {
			for (int j=0; j<col; ++j) {
				int count = 0;
				for (int k=0; k<8; ++k) {
					// 8个方向
					int ni = i + ii[k];	int nj = j + jj[k];
					// 统计活细胞的数量
					if (ni>=0 && ni<row && nj>=0 && nj<col && Math.abs(board[ni][nj])==1) count ++;					
				}
				// 更新grid数组
				if (board[i][j] == 1 && (count < 2 || count > 3))  board[i][j] = -1;
				else if (board[i][j] == 0 && count == 3) board[i][j] = 2;
			}
		}
		for (int i=0; i<row; ++i) {
			for (int j=0; j<col; ++j) {
				if (board[i][j] == -1) board[i][j] = 0;
				else if (board[i][j] == 2) board[i][j] = 1;
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		practice289 p = new practice289();
		int[][] grid = {{0,1,0},{0,0,1},{1,1,1},{0,0,0}};
		p.gameOfLife(grid);
		for (int i=0; i<4; i++) {
			System.out.println(Arrays.toString(grid[i]));
		}
		
	}

}
