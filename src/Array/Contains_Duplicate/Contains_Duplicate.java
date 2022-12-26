package Array.Contains_Duplicate;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Contains_Duplicate {
    public static void main(String[] args){
        int[] nums = {1,2,3,1};
        Solution solution = new Solution();
        System.out.println(solution.containsDuplicate(nums));

        Solution1 solution1 = new Solution1();
        System.out.println(solution1.containsDuplicate(nums));

        Solution2 solution2 = new Solution2();
        System.out.println(solution2.containsDuplicate(nums));
    }
}

//TC: o(n)^2
//SC: o(1)
class Solution1 {
    public boolean containsDuplicate(int[] nums) {
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i] == nums[j]) return true;
            }
        }
        return false;
    }
}

//TC: o(log(n))
//SC: o(1)
class Solution2 {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=0; i<nums.length-1; i++){
            if(nums[i]==nums[i+1]) return true;
        }
        return false;
    }
}

//TC: o(n)
//SC: o(n)
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            if(!set.add(nums[i])) return true;
        }
        return false;
    }
}