class Solution {
    public int maxProfit(int[] prices) {
        // 所有上升的钱都可以收入囊中～～～！！！
        
        if(prices.length == 0) {
            return 0;
        }
        int maxprofit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1])
                maxprofit += prices[i] - prices[i - 1];
        }
        return maxprofit;
    }
}