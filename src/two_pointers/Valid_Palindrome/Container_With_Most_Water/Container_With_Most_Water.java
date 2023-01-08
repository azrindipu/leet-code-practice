package two_pointers.Valid_Palindrome.Container_With_Most_Water;

public class Container_With_Most_Water {
    public static void main(String[] args){
        int[] height = {1,8,6,2,5,4,8,3,7};
        Solution solution = new Solution();
        System.out.println(solution.maxArea(height));
    }
}

class Solution {
    public int maxArea(int[] height) {
        int leftPointer =0;
        int rightPointer = height.length-1;
        int maxArea = Integer.MIN_VALUE;
        while (rightPointer > leftPointer){
            maxArea = Math.max((rightPointer-leftPointer) * (Math.min(height[leftPointer], height[rightPointer])), maxArea);
            if(height[leftPointer] > height[rightPointer]){
                rightPointer--;
            }else{
                leftPointer++;
            }
        }
        return maxArea;
    }
}