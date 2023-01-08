package two_pointers.Valid_Palindrome.ThreeSum;

import java.util.*;

public class ThreeSum {
    public static void main(String[] args){
        int[] nums = {-1,0,1,2,-1,-4};
        /*FaltuSolution faltuSolution = new FaltuSolution();
        List<List<Integer>> result = faltuSolution.threeSum(nums);
        System.out.println(result.toString());*/

        Solution solution = new Solution();
        List<List<Integer>> result2 = solution.threeSum(nums);
        System.out.println("New: "+result2.toString());
    }
}
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if(nums == null || nums.length < 3) return result;
        Arrays.sort(nums);
        for(int i=0; i<nums.length; i++){
            if(i > 0 && nums[i] == nums[i-1]) continue;
            int target = nums[i];
            int leftPointer = i+1;
            int rightPointer = nums.length-1;
            while (rightPointer > leftPointer){
                int sum = target + nums[leftPointer] + nums[rightPointer];
                if(sum == 0){
                    List<Integer> triplet = new ArrayList<>();
                    triplet.add(target);
                    triplet.add(nums[leftPointer]);
                    triplet.add(nums[rightPointer]);
                    result.add(triplet);
                    leftPointer++;
                    while (leftPointer < rightPointer && nums[leftPointer] == nums[leftPointer-1]){
                        leftPointer++;
                    }
                }else if(sum > 0){
                    rightPointer--;
                }else{
                    leftPointer++;
                }
            }
        }
        return result;
    }
}

class FaltuSolution{
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                for(int k=j+1; k<nums.length; k++){
                    if(nums[i]+nums[j]+nums[k] == 0){
                        List<Integer> triplet = new ArrayList<>();
                        triplet.add(nums[i]);
                        triplet.add(nums[j]);
                        triplet.add(nums[k]);
                        Collections.sort(triplet);
                        if(!result.contains(triplet)) {
                            result.add(triplet);
                        }
                    }
                }
            }
        }
        return result;
    }
}
