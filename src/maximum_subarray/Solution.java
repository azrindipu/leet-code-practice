package maximum_subarray;

public class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            for(int j=i; j<nums.length; j++){
                int sum =0;
                for(int k=i; k<=j; k++){
                    sum+=nums[k];
                }
                maxSum=Math.max(maxSum, sum);
            }
        }
        return maxSum;
    }
}
