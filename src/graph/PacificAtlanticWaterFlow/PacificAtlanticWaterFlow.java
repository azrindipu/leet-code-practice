package graph.PacificAtlanticWaterFlow;

import java.util.ArrayList;
import java.util.List;

public class PacificAtlanticWaterFlow {
    public static void main(String[] args){
        Solution solution = new Solution();
        int[][] height = {
                {1,2,2,3,5},
                {3,2,3,4,4},
                {2,4,5,3,1},
                {6,7,1,4,5},
                {5,1,1,2,4}};
        List<List<Integer>> result = solution.pacificAtlantic(height);
        System.out.println(result.toString());
    }
}
class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        List<List<Integer>> result = new ArrayList<>();
        boolean[][] visited = new boolean[heights.length][heights[0].length];
        for(int x=0; x<heights.length; x++){
            for(int y=0; y<heights[x].length; y++){
                if(!visited[x][y]){
                    visited[x][y]=true;
                    boolean bool = false;
                    isAtlantic(heights, x, y, bool);
                    if(bool){
                        bool = false;
                        isPacific(heights, x, y, bool);
                        if(bool){
                            List<Integer> temp = new ArrayList<>();
                            temp.add(x);
                            temp.add(y);
                            result.add(temp);
                        }
                    }
                }
            }
        }
        return result;
    }

    public void isAtlantic(int[][] height, int x, int y, boolean bool){
        if(x== height.length-1 || y==0){
            bool = true;
            return;
        }
        if(x-1 >= 0 && height[x][y] >= height[x-1][y]) isAtlantic(height, x-1, y, bool);
        if(x+1 < height.length && height[x][y] >= height[x+1][y]) isAtlantic(height, x+1, y, bool);
        if(y-1 >= 0 && height[x][y] >= height[x][y-1]) isAtlantic(height, x, y-1, bool);
        if(y+1 < height[x].length && height[x][y+1] >= height[x][y+1]) isAtlantic(height, x, y+1, bool);
    }

    public void isPacific(int[][] height, int x, int y, boolean bool){
        if(y== height[x].length-1 || x==0){
            bool = true;
            return;
        }
        if(y-1>=0 && height[x][y] >= height[x][y-1]) isPacific(height, x, y-1, bool);
        if(y+1<height[x].length && height[x][y] >= height[x][y+1]) isPacific(height, x, y+1, bool);
        if(x-1>=0 && height[x][y] >= height[x-1][y]) isPacific(height, x-1, y, bool);
        if(x+1< height.length && height[x][y] >= height[x+1][y]) isPacific(height, x+1, y, bool);
    }
}