
public class practice322 {
	public int coinChange(int[] coins, int amount) {
		if (amount==0) return 0;
		int len = coins.length;
		int[] dp = new int[amount+1];
		dp[0] = 0;
		for (int i=1; i<amount+1; ++i) dp[i] = Integer.MAX_VALUE/2;
		for (int money=1; money<=amount; ++money) {
			for (int coinId=0; coinId<len; ++coinId) {
				if (money>=coins[coinId]) {
					dp[money] = Math.min(dp[money], dp[money-coins[coinId]]+1);
				}
			}
		}
		if (dp[amount] == Integer.MAX_VALUE/2) return -1;
		return dp[amount];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] coins = {3,5,10};
		int amount = 16;
		practice322 p = new practice322();
		int res = p.coinChange(coins, amount);
		System.out.println(res);
	}

}
