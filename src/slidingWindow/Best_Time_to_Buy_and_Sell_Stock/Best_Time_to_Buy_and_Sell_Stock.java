package slidingWindow.Best_Time_to_Buy_and_Sell_Stock;

public class Best_Time_to_Buy_and_Sell_Stock {
    public static void main(String[] args){
        int[] prices = {7,1,5,3,6,4};
        Solution solution = new Solution();
        System.out.println(solution.maxProfit(prices));
    }
}

class Solution {
    public int maxProfit(int[] prices) {
        int slow = 0;
        int fast = 1;
        int maxProfit = 0;
        while (fast < prices.length){
            if(prices[fast] > prices[slow]){
                maxProfit = Math.max(maxProfit, prices[fast]-prices[slow]);
            }else{
                slow = fast;
            }
            fast++;
        }
        return maxProfit;
    }
}