
public class practice999 {

	public int numRookCaptures(char[][] board) {
		// 记录白色Rook的位置
		int ii = 0; int jj = 0;
		for (int i=0; i<8; ++i) {
			for (int j=0; j<8; ++j) {
				if (board[i][j] == 'R') {
					ii = i;
					jj = j;
					break;
				}
			}
		}
		int ans = 0;
		for (int k=jj+1; k<8; ++k) {
			char cur = board[ii][k];
			int judge = this.judge(cur);
			if (judge == -1) break;
			if (judge == 0) continue;
			if (judge == 1) {
				ans += 1;
				break;
			}
		}
		for (int k=jj-1; k>=0; --k) {
			char cur = board[ii][k];
			int judge = this.judge(cur);
			if (judge == -1) break;
			if (judge == 0) continue;
			if (judge == 1) {
				ans += 1;
				break;
			}
		}
		for (int k=ii+1; k<8; ++k) {
			char cur = board[k][jj];
			int judge = this.judge(cur);
			if (judge == -1) break;
			if (judge == 0) continue;
			if (judge == 1) {
				ans += 1;
				break;
			}
		}
		for (int k=ii-1; k>=0; --k) {
			char cur = board[k][jj];
			int judge = this.judge(cur);
			if (judge == -1) break;
			if (judge == 0) continue;
			if (judge == 1) {
				ans += 1;
				break;
			}
		}
		return ans;
	}
	
	private int judge(char c) {
		int ans = 0;
		switch (c) {
		case ',' :
			ans = 0;
			break;
		case 'P' :
		case 'B' :
		case 'b' :
		case 'r' :
			ans = -1;
			break;
		case 'p' :
			ans = 1;
			break;
		}
		return ans;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		practice999 p = new practice999();
		char[][] board = 
            {{'.', '.', '.', '.', '.', '.', '.', '.'},
            {'.', '.', '.', 'p', '.', '.', '.', '.'},
            {'.', '.', '.', 'R', '.', '.', '.', 'p'},
            {'.', '.', '.', '.', '.', '.', '.', '.'},
            {'.', '.', '.', '.', '.', '.', '.', '.'},
            {'.', '.', '.', 'p', '.', '.', '.', '.'},
            {'.', '.', '.', '.', '.', '.', '.', '.'},
            {'.', '.', '.', '.', '.', '.', '.', '.'}};
		System.out.println(p.numRookCaptures(board));
	}

}
