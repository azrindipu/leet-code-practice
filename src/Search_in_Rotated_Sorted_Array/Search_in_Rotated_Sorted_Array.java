package Search_in_Rotated_Sorted_Array;

public class Search_in_Rotated_Sorted_Array {
    public static void main(String[] args){
        int[] nums = {4,5,6,7,0,1,2};
        Solution solution = new Solution();
        System.out.println(solution.search(nums, 0));

        Solution1 solution1 = new Solution1();
        System.out.println(solution1.search(nums, 0));
    }
}

//TC: o(n)
//SC: o(1)
class Solution {
    public int search(int[] nums, int target) {
        for(int i=0; i<nums.length; i++){
            if(nums[i]==target) return i;
        }
        return -1;
    }
}

class Solution1 {
    public int search(int[] nums, int target) {
        if(nums == null || nums.length==0) return -1;
        return search(nums, target, 0, nums.length-1);
    }

    public int search(int[] nums, int target, int start, int end) {
        if(start>end) return -1;
        int mid = start+((end-start)/2);
        if(target==nums[mid]) return mid;
        if(nums[mid] >= nums[start]){
            if(target>=nums[start] && target<nums[mid]){
                return search(nums, target, start, mid-1);
            }else{
                return search(nums, target, mid+1, end);
            }
        }else{
            if(target>nums[mid] && target<=nums[end]){
                return search(nums, target, mid+1, end);
            }else{
                return search(nums, target, start, mid-1);
            }
        }
    }
}
