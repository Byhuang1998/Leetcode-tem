import java.util.ArrayList;
public class practice994 {
	
	public int orangesRotting(int[][] grid) {
		// 获取行列长度
		int col = grid.length;
		int row = grid[0].length;
		
		// 需要花费的时间
		int time = 0;
		// 分别用于存储空格子的坐标	
		ArrayList<Integer> emptyCol = new ArrayList<>();
		ArrayList<Integer> emptyRow = new ArrayList<>();
		int emptyCount = 0;		
		
		// 分别用于存储刚开始的腐烂的橘子的坐标	
		ArrayList<Integer> freshCol = new ArrayList<>();
		ArrayList<Integer> freshRow = new ArrayList<>();
		int freshCount = 0;		
		
		// 分别用于存储刚开始的腐烂的橘子的坐标	
		ArrayList<Integer> rottenCol = new ArrayList<>();
		ArrayList<Integer> rootenRow = new ArrayList<>();
		int rottenCount = 0;
		
		// 找到初始时，空格子、新鲜、腐烂的位置
		for (int i=0; i<col; i++) {
			
			for (int j=0; j<row; j++) {
				if (grid[i][j] == 0) {
					emptyCol.set(emptyCount, i);
					emptyRow.set(emptyCount, j);
					emptyCount++;
					
				} else	if (grid[i][j] == 1) {
					freshCol.set(freshCount, i);
					freshRow.set(freshCount, j);
					freshCount++;
				} else {
					rottenCol.set(rottenCount, i);
					rootenRow.set(rottenCount, j);
					rottenCount++;
				}
			}
		}		
		return time;
	}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println();
	}

}
