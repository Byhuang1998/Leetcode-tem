
public class practice695 {

	public int maxAreaOfIsland(int[][] grid) {
		int row = grid.length;
		int col = grid[0].length;
		int max = 0;
		for (int i=0; i<row; i++) {
			for (int j=0; j<col; j++) {
				max = Math.max(max, dfs(grid, i, j));
			}
		}
		return max;
	}
	
	private int dfs(int[][] grid, int i, int j) {
		int row = grid.length;
		int col = grid[0].length;
		if (i<0 || j<0 || i>=row || j>=col || grid[i][j]==0) return 0;
		int num = 1;
		grid[i][j] = 0;
		num += dfs(grid, i+1, j);
		num += dfs(grid, i-1, j);
		num += dfs(grid, i, j+1);
		num += dfs(grid, i, j-1);		
		return num;
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
