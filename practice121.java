
public class practice121 {

	
	public int maxProfit(int[] prices) {
		int len = prices.length;
		if (len < 2) return 0;
		int profit = 0;
		for (int i=0; i<len-1; i++) {
			int temProfit = 0;
			int tem = prices[i];
			int temMax = prices[i+1];
			for (int j=i+1; j<len; j++) {
				if (prices[j]>temMax) {
					temMax = prices[j];
				}
			}
			temProfit = temMax>tem ? temMax - tem : 0;
			profit = temProfit>profit ? temProfit : profit;
		}
		return profit;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] prices = {10,2,3,4,5,6};
		practice121 p = new practice121();
		int profit = p.maxProfit(prices);
		System.out.println(profit);
	}

}
