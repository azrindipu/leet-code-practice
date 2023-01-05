package Array.Top_K_Frequent_Elements;

import java.util.*;

public class Top_K_Frequent_Elements {
    public static void main(String[] args){
        int[] nums = {5,3,1,1,1,3,73,1};
        Solution solution = new Solution();
        int[] result = solution.topKFrequent(nums, 2);
        for(int i=0; i<result.length; i++){
            System.out.print(result[i]);
        }
        System.out.println();
    }
}

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        int maxFrequency =1;
        for(int i=0; i<nums.length; i++){
            if(frequencyMap.containsKey(nums[i])){
                int count = frequencyMap.get(nums[i])+1;
                maxFrequency = Math.max(maxFrequency, count);
                frequencyMap.put(nums[i], count);
            }else {
                frequencyMap.put(nums[i], 1);
            }
        }
        int[] result = new int[k];
        List<Integer> list = new ArrayList<>();
        while (maxFrequency > 0){
            if(frequencyMap.containsValue(maxFrequency)){
                Set<Integer> keys = frequencyMap.keySet();
                for(Integer key: keys){
                    if(frequencyMap.get(key) == maxFrequency){
                        list.add(key);
                    }
                }
            }
            maxFrequency--;
        }
        for(int i=0; i<k; i++){
            result[i] = list.get(i);
        }
        return result;
    }
}
