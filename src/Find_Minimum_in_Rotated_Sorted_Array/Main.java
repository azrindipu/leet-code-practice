package Find_Minimum_in_Rotated_Sorted_Array;

public class Main {
    public static void main(String[] args){
        int[] nums = {3,4,5,1,2};
        Solution solution = new Solution();
        System.out.println(solution.findMin(nums));

        Solution2 solution2 = new Solution2();
        System.out.println(solution2.findMin(nums));
    }
}
