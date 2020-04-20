import java.util.Queue;
import java.util.LinkedList;
public class practice200 {
	    public boolean isClear(char[][] grid, int row, int col) {
	        for (int i=0; i<row; i++) {
	            for (int j=0; j<col; j++) {
	                if (grid[i][j] == '1') return false;
	            }
	        }
	        return true;
	    }

	    public int[] getLand(char[][] grid, int row, int col) {
	        int[] pos = new int[2];
	        sign: for (int i=0; i<row; i++) {
	            for (int j=0; j<col; j++) {
	                if (grid[i][j] == '1') {
	                    pos[0] = i;
	                    pos[1] = j;
	                    break sign;
	                }
	            }
	        }
	        return pos;
	    }
	    public int numIslands(char[][] grid) {
	        Queue<Integer> si = new LinkedList<>();
	        Queue<Integer> sj = new LinkedList<>();
	        int[] ii = {-1, 1, 0, 0};
	        int[] jj = {0, 0, -1, 1};
	        int row = grid.length;
	        if (row == 0) return 0;
	        int col = grid[0].length;
	        int count = 0;
	        while (! isClear(grid, row, col)) {
	            count++;
	            int m = getLand(grid, row, col)[0];
	            int n = getLand(grid, row, col)[1];
	            si.offer(m);
	            sj.offer(n);
	            grid[m][n] = '0';
	            while (! si.isEmpty()) {
	                int x = si.poll();
	                int y = sj.poll();
	                for (int k=0; k<4; k++) {
	                    int ni = x + ii[k];
	                    int nj = y + jj[k];
	                    // ÒÀÈ»ÊÇÂ½µØ
	                    if (ni>=0 && ni<row && nj>=0 && nj<col && grid[ni][nj]=='1') {
	                        grid[ni][nj] = '0';
	                        si.offer(ni);
	                        sj.offer(nj);
	                    }
	                }
	            }
	        }
	        return count;
	    }
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			practice200 p = new practice200();
			char grid[][] = {
					{'1','0','1','1','1'},
					{'1','0','1','0','1'},
					{'1','1','1','0','1'},
					//{'0','0','0','0','0'},
			};
			int ans = p.numIslands(grid);
			System.out.println(ans);
		}

}
