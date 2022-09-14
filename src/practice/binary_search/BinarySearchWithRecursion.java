package practice.binary_search;

public class BinarySearchWithRecursion {
    public int binarySearch(int[] nums, int target){
        if(nums==null || nums.length==0) return -1;
     return binarySearch(nums, target, 0, nums.length-1);
    }
    public int binarySearch(int[] nums, int target, int start, int end){
        int mid = start+(end-start)/2;
        if(target == nums[mid]) return mid;
        if(target > nums[mid]) return binarySearch(nums, target, mid+1, end);
        if(target < nums[mid]) return binarySearch(nums, target, start, mid-1);
        return -1;
    }
}
