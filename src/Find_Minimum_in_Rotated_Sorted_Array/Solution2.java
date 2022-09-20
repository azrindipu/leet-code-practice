package Find_Minimum_in_Rotated_Sorted_Array;

import java.util.Arrays;

public class Solution2 {
    public int findMin(int[] nums) {
        Arrays.sort(nums);
        return nums[0];
    }
}
