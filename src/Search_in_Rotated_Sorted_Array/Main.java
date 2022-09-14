package Search_in_Rotated_Sorted_Array;

public class Main {
    public static void main(String[] args){
        int[] nums = {3,1};
        Solution solution = new Solution();
        System.out.println(solution.search(nums, 1));

        Solution1 solution1 = new Solution1();
        System.out.println(solution1.search(nums, 0));
    }
}
