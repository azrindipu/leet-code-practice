package Best_Time_to_Buy_and_Sell_Stock;

public class Main {
    public static void main(String[] args){
        int[] prices = {7,1,5,3,6,4};
        Solution solution = new Solution();
        System.out.println(solution.maxProfit(prices));

        Solution2 solution2 = new Solution2();
        System.out.println(solution2.maxProfit(prices));
    }
}
