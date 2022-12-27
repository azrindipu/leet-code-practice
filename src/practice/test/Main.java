package practice.test;

public class Main {
    public static void main(String[] args){
        int[] nums = {-1,1,0,-3,3};
        Solution solution = new Solution();
        solution.productExceptSelf(nums);
    }
}

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] preProductArray = new int[nums.length];
        int[] postProductArray = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            if(i-1<0){
                preProductArray[i]=nums[i];
            }else{
                preProductArray[i]=preProductArray[i-1]*nums[i];
            }
        }
        for(int i=nums.length-1; i>=0; i--){
            if(i+1 >= nums.length){
                postProductArray[i]=nums[i];
            }else{
                postProductArray[i]=postProductArray[i+1]*nums[i];
            }
        }
        for(int i=0; i<nums.length; i++){
            if(i==0){
                nums[i]=postProductArray[i+1];
            }else if(i==nums.length-1){
                nums[i]=preProductArray[i-1];
            }else{
                nums[i]=preProductArray[i-1]*postProductArray[i+1];
            }
        }
        return nums;
    }
}