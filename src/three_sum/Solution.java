package three_sum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<List<Integer>> threeSum(int[] nums){
        List<List<Integer>> result = new ArrayList<>();
        if(nums == null || nums.length <3) return result;
        Arrays.sort(nums);
        for(int i=0; i<nums.length; i++){
            if(i>0 && nums[i] == nums[i-1]) continue;
            int start = i+1;
            int end = nums.length-1;
            while (end > start){
                int sum = nums[i] + nums[start]+nums[end];
                if(sum == 0){
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[start]);
                    temp.add(nums[end]);
                    result.add(temp);
                    start++;
                    while (start<end && nums[start] == nums[start-1]){
                     start++;
                    }
                }else if(sum>0){
                    end--;
                }else{
                    start++;
                }
            }
        }
        return result;
    }
}
