package Array.Product_of_Array_Except_Self;

public class Product_of_Array_Except_Self {
    public static void main(String[] args){
        int[] array = {4,3,2,1,2};
        Solution solution = new Solution();
        int[] result = solution.productExceptSelf(array);
        for(int i=0; i<result.length; i++){
            System.out.print(result[i]+" ");
        }
        System.out.println();
        Solution1 solution1 = new Solution1();
        int[] result1 = solution1.productExceptSelf(array);
        for(int i=0; i<result1.length; i++){
            System.out.print(result1[i]+" ");
        }
        System.out.println();
        int[] array2 = {4,3,2,1,2};
        Solution2 solution2 = new Solution2();
        int[] result2 = solution2.productExceptSelf(array2);
        for(int i=0; i<result2.length; i++){
            System.out.print(result2[i]+" ");
        }
    }
}

//TC: o(n)^2
//SC: o(1)
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        int index=0;
        for(int i=0; i<nums.length; i++){
            int prod=1;
            for(int j=0; j<nums.length; j++){
                if(j!=i){
                    prod*=nums[j];
                }
            }
            result[index++]=prod;
        }
        return result;
    }
}

//TC: o(n)
//SC: o(n)
class Solution1 {
    public int[] productExceptSelf(int[] nums) {
        if(nums == null) return null;
        if(nums.length == 1 || nums.length ==0) return nums;
        int[] leftProductArray = new int[nums.length];
        int[] rightProductArray = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            if(i==0){
                leftProductArray[i]=nums[i];
                continue;
            }
            leftProductArray[i]=leftProductArray[i-1]*nums[i];
        }
        for(int i=nums.length-1; i>=0; i--){
            if(i==nums.length-1){
                rightProductArray[i]=nums[i];
                continue;
            }
            rightProductArray[i]=rightProductArray[i+1]*nums[i];
        }
        for(int i=0; i<nums.length; i++){
            if(i==0){
                nums[i]=rightProductArray[i+1];
                continue;
            }
            if(i==nums.length-1){
                nums[i]=leftProductArray[i-1];
                continue;
            }
            nums[i]=leftProductArray[i-1]*rightProductArray[i+1];
        }
        return nums;
    }
}

//TC: o(n)
//SC: o(n)
class Solution2 {
    public int[] productExceptSelf(int[] nums) {
        if(nums == null) return null;
        if(nums.length == 1 || nums.length ==0) return nums;
        int[] leftProductArray = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            if(i==0){
                leftProductArray[i]=nums[i];
                continue;
            }
            leftProductArray[i]=leftProductArray[i-1]*nums[i];
        }
        int rightArrayProduct=1;
        for(int i=nums.length-1; i>=0; i--){
            if(i== nums.length-1){
                rightArrayProduct*=nums[i];
                nums[i]=leftProductArray[i-1];
                continue;
            }
            if(i==0){
                nums[i]=rightArrayProduct;
                break;
            }
            int tmp = nums[i];
            nums[i]=leftProductArray[i-1]*rightArrayProduct;
            rightArrayProduct*=tmp;
        }
        return nums;
    }
}
