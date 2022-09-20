package maximum_product_subarray;

public class Solution {
    public int maxProduct(int[] nums) {
        int maxProd =nums[0];
        for(int i=0; i<nums.length; i++){
            int currentProd =1;
            for(int j=i; j<nums.length; j++){
                currentProd*=nums[j];
                maxProd=Math.max(maxProd, currentProd);
            }
        }
        return maxProd;
    }
}
