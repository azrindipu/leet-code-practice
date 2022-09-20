package maximum_product_subarray;

public class maximum_product_subarray {
    public static void main(String[] args){
        //int[] nums = {2,3,-2,4};
        int[] nums = {-2,0,-1};

        //TC: o(n^2)
        Solution solution = new Solution();
        System.out.println(solution.maxProduct(nums));

        //TC: o(n)
        Solution1 solution1 = new Solution1();
        System.out.println(solution1.maxProduct(nums));
    }
}
