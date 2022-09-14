package Search_in_Rotated_Sorted_Array;

class Solution1 {
    //not complete
    //TC: o(log(n))
    //SC: 0(1)
    public int search(int[] nums, int target) {
        if(nums == null|| nums.length == 0) return -1;
        if(nums.length==1 && target==nums[0]) return 0;
        if(nums.length ==1 && target != nums[0]) return -1;
        if(nums.length ==2 && nums[0]==target) return 0;
        if(nums.length==2 && target==nums[1]) return 1;
        if(nums.length==2 && target!= nums[0] && target!= nums[1]) return -1;
        if(nums[nums.length-1] > nums[0]) return binarySearch(nums, target, 0, nums.length-1);
        int pivot = getPivotPoimt(nums, 0, nums.length-1);
        int firstPartValue = binarySearch(nums, target, 0, pivot);
        if(firstPartValue != -1) return firstPartValue;
        int secondPartValue = binarySearch(nums, target, pivot+1, nums.length-1);
        if(secondPartValue != -1) return secondPartValue;
        return -1;
    }

    public int getPivotPoimt(int[] nums, int start, int end){
        int mid = start+(end-start)/2;
        if(nums[mid] > nums[mid-1] && nums[mid] > nums[mid+1]) return mid;
        if(nums[mid] > nums[start]) return getPivotPoimt(nums, mid+1, end);
        else return getPivotPoimt(nums, start, mid-1);
    }
    public int binarySearch(int[] nums, int target, int start, int end){
        if(start>end) return -1;
        int mid = start+(end-start)/2;
        if(nums[mid]== target) return mid;
        if(target > nums[mid]) return binarySearch(nums, target, mid+1, end);
        if(target < nums[mid]) return binarySearch(nums, target, start, mid-1);
        return -1;
    }
}
