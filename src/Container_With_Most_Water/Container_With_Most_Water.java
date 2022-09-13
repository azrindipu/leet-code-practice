package Container_With_Most_Water;

public class Container_With_Most_Water {
    public static void main(String[] args){
        Solution solution = new Solution();
        int[] array = {1,8,6,2,5,4,8,3,7};
        System.out.println(solution.maxArea(array));
    }
}

class Solution {
    public int maxArea(int[] height) {
        int start = 0;
        int end = height.length-1;
        int result = 0;
        while(end > start){
            int x = end-start;
            int y = Math.min(height[start], height[end]);
            int area = x*y;
            result = Math.max(area, result);
            if(height[start]> height[end]){
                end--;
            }else{
                start++;
            }
        }
        return result;
    }
}