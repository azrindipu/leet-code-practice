package maximum_subarray;

public class maximum_subarray {
    public static void main(String[] args){
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};

        Solution solution = new Solution();
        System.out.println(solution.maxSubArray(nums));

        Solution1 solution1 = new Solution1();
        System.out.println(solution1.maxSubArray(nums));

        Solution2 solution2 = new Solution2();
        System.out.println(solution2.maxSubArray(nums));
    }
}
