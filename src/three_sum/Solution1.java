package three_sum;

import java.util.*;

public class Solution1 {
    public List<List<Integer>> threeSum(int[] nums){
        List<List<Integer>> result = new ArrayList<>();
        if(nums == null || nums.length < 3) return result;
        Set<List<Integer>> set = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                for(int k=j+1; k<nums.length; k++){
                    if(i!=j && i!=k && j!=k){
                        if(nums[i]+nums[j]+nums[k]==0){
                            List<Integer> temp = new ArrayList<>();
                            temp.add(nums[i]);
                            temp.add(nums[j]);
                            temp.add(nums[k]);
                            Collections.sort(temp);
                            if(set.add(temp)) {
                                result.add(temp);
                            }
                        }
                    }
                }
            }
        }
        return result;
    }
}
