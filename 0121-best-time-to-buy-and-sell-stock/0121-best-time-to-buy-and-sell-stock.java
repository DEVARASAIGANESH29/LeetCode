class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int l = 0;
        int profit = 0;
        for(int i=1;i<n;i++){
            if(prices[i] < prices[l]){
                l = i;
            }
            else{
                profit = Math.max(profit, prices[i] - prices[l]);
            }
        }
        return profit;
    }
}