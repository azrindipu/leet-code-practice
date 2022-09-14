package practice.binary_search;

public class BinarySearchWithLoop {
    public int binarySearch(int[] nums, int target){
        if(nums == null || nums.length ==0) return -1;
        int start=0;
        int end = nums.length-1;
        while (end >= start){
            int mid = start+(end-start)/2;
            if(target == nums[mid]) return mid;
            if(target > nums[mid]){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;
    }
}
