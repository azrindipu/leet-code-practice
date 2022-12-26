package Array.Two_Sum;

import java.util.HashMap;
import java.util.Map;

public class Two_Sum {
    public static void main(String[] args) {
        int[] array = {2, 7, 11, 15};
        int target = 9;
        Solution01 solution01 = new Solution01();
        int[] result1 = solution01.twoSum(array, target);
        System.out.println(result1[0]);
        System.out.println(result1[1]);

        Solution02 solution02 = new Solution02();
        int[] result2 = solution02.twoSum(array, target);
        System.out.println(result2[0]);
        System.out.println(result2[1]);
    }
}

//TC: o(n^2)
//SC: o(1)
class Solution01 {
    public int[] result = new int[2];
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    break;
                }
            }
        }
        return result;
    }
}

//TC: o(n)
//SC: o(n)
class Solution02 {
    public int[] result = new int[2];
    public Map<Integer, Integer> map = new HashMap<>();
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(target-nums[i])){
                result[0]=map.get(target-nums[i]);
                result[1]= i;
                break;
            }
            map.put(nums[i], i);
        }
        return result;
    }
}
