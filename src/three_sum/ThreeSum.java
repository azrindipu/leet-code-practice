package three_sum;

import java.util.List;

public class ThreeSum {
    public static void main(String[] args){
        int[] nums = {-1,0,1,2,-1,-4};
        /*Solution1 solution1 = new Solution1();
        List<List<Integer>> result = solution1.threeSum(nums);
        for(int i=0; i<result.size(); i++){
            for(int j=0; j<result.get(i).size(); j++){
                System.out.print(result.get(i).get(j)+" ");
            }
            System.out.println();
        }*/

        Solution solution = new Solution();
        List<List<Integer>> result = solution.threeSum(nums);
        for(int i=0; i<result.size(); i++){
            for(int j=0; j<result.get(i).size(); j++){
                System.out.print(result.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }
}
