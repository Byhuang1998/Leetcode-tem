import java.util.Stack;
public class practice695 {

	public int maxAreaOfIsland(int[][] grid) {
		int row = grid.length;
		int col = grid[0].length;
		int max = 0;
		int[] ii = {0,0,1,-1};
		int[] jj = {1,-1,0,0};
		
		for (int i=0; i<row; i++) {
			for (int j=0; j<col; j++) {
				int cur_num = 0;
				Stack<Integer> stacki = new Stack<>();
				Stack<Integer> stackj = new Stack<>();
				if (grid[i][j]==0) continue;
				stacki.push(i);
				stackj.push(j);
				while (!stacki.isEmpty()) {
					int cur_i = stacki.pop();
					int cur_j = stackj.pop();
					if (cur_i<0 || cur_j<0 || cur_i==row || cur_j==col || grid[cur_i][cur_j]==0) continue;
					cur_num++;
					grid[cur_i][cur_j] = 0;
					for (int k=0; k<4; k++) {
						stacki.push(cur_i+ii[k]);
						stackj.push(cur_j+jj[k]);
					}
				max = Math.max(max, cur_num);
				}
			}
		}
		
		
		return max;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] grid = {{0,0,1,0,0,0,0,1,0,0,0,0,0},
		                {0,0,0,0,0,0,0,1,1,1,0,0,0},
		                {0,1,1,0,1,0,0,0,0,0,0,0,0},
		                {0,1,0,0,1,1,0,0,1,0,1,0,0},
		                {0,1,0,0,1,1,0,0,1,1,1,0,0},
		                {0,0,0,0,0,0,0,0,0,0,1,0,0},
		                {0,0,0,0,0,0,0,1,1,1,0,0,0},
		                {0,0,0,0,0,0,0,1,1,0,0,0,0}};
		practice695 p = new practice695();
		int max = p.maxAreaOfIsland(grid);
		System.out.println(max);
	}

}
