package Search_in_Rotated_Sorted_Array;

//TC: o(n)
//SC: o(1)
class Solution {
    public int search(int[] nums, int target) {
        if(nums == null || nums.length ==0) return -1;
        return search(nums, target, 0, nums.length-1);
    }

    public int search(int[] nums, int target, int start, int end) {
        if(start>end) return -1;
        int mid = start+(end-start)/2;
        if(nums[mid] == target) return mid;
        if(nums[mid] >= nums[start]){
            if(target>= nums[start] && target < nums[mid]) return search(nums, target, start, mid-1);
            else return search(nums, target, mid+1, end);
        }else{
            if(target >nums[mid] && target <= nums[end]) return search(nums, target, mid+1, end);
            else return search(nums, target, start, mid-1);
        }
    }
}
