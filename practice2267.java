class Solution {
    boolean visited[][][];
    int m, n;
    char[][] grid;
    public boolean hasValidPath(char[][] grid) {
        m = grid.length; n = grid[0].length;
        this.grid = grid;
        visited = new boolean[m][n][m + n - 1];
        // 剪枝
        if ((m + n) % 2 == 0 || grid[0][0] == ')' || grid[m - 1][n - 1] == '(') return false;
        return dfs(0, 0, 0);
    }

    // x, y位置， c是剩余左括号的数量
    public boolean dfs(int x, int y, int c) {
        if (c > m - x + n - y - 1 || c < 0) return false;
        if (x == m - 1 && y == n - 1) return c == 1;
        if (x >= m || y >= n) return false;
        // 如果是以前访问过x, y这个位置，且状态是c。
        // 如果这个位置和状态此前发生过，我就不用再深搜一次了
        if (visited[x][y][c]) return false;
        // 把这个位置和状态设置成已访问过
        visited[x][y][c] = true;
        if (grid[x][y] == '(') c++; else c--;
        return dfs(x + 1, y, c) || dfs(x, y + 1, c);
    }
}