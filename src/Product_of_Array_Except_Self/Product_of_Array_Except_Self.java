package Product_of_Array_Except_Self;

public class Product_of_Array_Except_Self {
    public static void main(String[] args){
        int[] array = {1,2,3,4};
        Solution solution = new Solution();
        int[] result = solution.productExceptSelf(array);
        for(int i=0; i<result.length; i++){
            System.out.print(result[i]+" ");
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
