package Array.Longest_Consecutive_Sequence;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Longest_Consecutive_Sequence {
    public static void main(String[] args){
        //int[] nums = {1,2,0,1};
        int[] nums = {-2,-3,-3,7,-3,0,5,0,-8,-4,-1,2};
        //int[] nums = {100,4,200,1,3,2};
        Solution solution = new Solution();
        System.out.println(solution.longestConsecutive(nums));
    }
}

class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int result =0;
        for(int i=0; i<nums.length; i++){
            set.add(nums[i]);
        }
        for(int i=0; i<nums.length; i++){
            if(!set.contains(nums[i]-1)){
                int count =0;
                while (set.contains(nums[i] + count)){
                    count++;
                }
                result = Math.max(count, result);
            }
        }
        return result;
    }
}

