package Array.maximum_subarray;

public class maximum_subarray {
    public static void main(String[] args){
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};

        //TC: o(n^3)
        Solution solution = new Solution();
        System.out.println(solution.maxSubArray(nums));

        //TC: o(n^2)
        Solution1 solution1 = new Solution1();
        System.out.println(solution1.maxSubArray(nums));

        //TC: o(n)
        Solution2 solution2 = new Solution2();
        System.out.println(solution2.maxSubArray(nums));
    }
}
