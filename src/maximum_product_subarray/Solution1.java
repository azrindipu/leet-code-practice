package maximum_product_subarray;

public class Solution1 {
    public int maxProduct(int[] nums) {
        int maxProd =Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            if(nums[i]>maxProd){
                maxProd=nums[i];
            }
        }
        int currentMax =1;
        int currentMin = 1;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==0){
                currentMax=1;
                currentMin=1;
                continue;
            }
            int tmp = currentMax;
            currentMax=Math.max(Math.max(nums[i]*currentMax, nums[i]*currentMin), nums[i]);
            currentMin = Math.min(Math.min(nums[i]*tmp, nums[i]*currentMin), nums[i]);
            maxProd = Math.max(Math.max(currentMax, currentMin), maxProd);
        }
        return maxProd;
    }
}
