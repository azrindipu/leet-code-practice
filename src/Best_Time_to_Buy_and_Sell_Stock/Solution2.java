package Best_Time_to_Buy_and_Sell_Stock;

public class Solution2 {
    public int maxProfit(int[] prices) {
        int left=0;
        int right=1;
        int maxProfit=0;
        while (right < prices.length){
            if(prices[right]> prices[left]){
                maxProfit = Math.max(maxProfit, (prices[right]-prices[left]));
            }else{
                left=right;
            }
            right++;
        }
        return maxProfit;
    }
}
