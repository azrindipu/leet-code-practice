package Array.maximum_subarray;

public class Solution1 {
    public int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            int currentSum =0;
            for(int j=i; j<nums.length; j++){
                currentSum+=nums[j];
                maxSum=Math.max(maxSum, currentSum);
            }
        }
        return maxSum;
    }
}
