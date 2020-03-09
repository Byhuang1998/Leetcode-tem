
public class practice121 {

	
	public int maxProfit(int[] prices) {
		int len = prices.length;
		if (len < 2) return 0;
		int profit = 0;
		int temMax = 0;
		for (int i=len-2; i>=0; i--) {
			int temProfit = 0; // 本次循环的最大利润
			int tem = prices[i]; // 买入价
			int temNum = prices[i+1];
			// 由后往前，只需比较新加入的值与来的最大值，则可得出新的最大值，不需要重复进行一次比较
			temMax = temNum>temMax ? temNum : temMax; 
			temProfit = temMax>tem ? temMax - tem : 0;
			profit = temProfit>profit ? temProfit : profit; // 将新得的利润与原始利润比较，更新
		}
		return profit;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] prices = {10,5,3,4,5,6};
		practice121 p = new practice121();
		int profit = p.maxProfit(prices);
		System.out.println(profit);
	}

}
