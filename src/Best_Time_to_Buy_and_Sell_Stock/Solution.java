package Best_Time_to_Buy_and_Sell_Stock;

class Solution {
    public int maxProfit(int[] prices) {
        int maxProfite =0;
        if(prices == null || prices.length <=1) return maxProfite;
        for(int i=0; i<prices.length; i++){
            for(int j=i+1; j<prices.length; j++){
                maxProfite = Math.max(maxProfite, (prices[j]-prices[i]));
            }
        }
        return maxProfite;
    }
}
