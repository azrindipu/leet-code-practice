package Find_Minimum_in_Rotated_Sorted_Array;

public class Solution {
    public int findMin(int[] nums) {
        int start =0;
        int end = nums.length-1;
        int min = nums[0];
        while (end>=start){
            if(nums[end] > nums[start]){
               min=Math.min(min, nums[start]);
               break;
            }
            int mid = start+(end-start)/2;
            min=Math.min(min, nums[mid]);
            if(nums[mid]>=nums[start]) start=mid+1;
            else end=mid-1;
        }
        return min;
    }
}
