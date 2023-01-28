package graph.MaxAreaofIsland;

import java.util.ArrayList;
import java.util.List;

public class Solution2 {
    public int maxAreaOfIsland(int[][] grid) {
        int maxArea = 0;
        if(grid == null) return maxArea;
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        for(int x=0; x<grid.length; x++){
            for(int y=0; y<grid[x].length; y++){
                if(!visited[x][y] && grid[x][y]==1){
                    List<Integer> list = new ArrayList<>();
                    dfs(grid, visited, x, y, list);
                    maxArea = Math.max(maxArea, list.size());
                }
            }
        }
        return maxArea;
    }
    public void dfs(int[][] grid, boolean[][] visited,int x, int y, List<Integer> list){
        list.add(1);
        visited[x][y]=true;
        if(x-1>=0 && !visited[x-1][y] && grid[x-1][y]==1) dfs(grid, visited, x-1, y, list);
        if(x+1<grid.length && !visited[x+1][y] && grid[x+1][y]==1) dfs(grid, visited, x+1, y, list);
        if(y-1>=0 && !visited[x][y-1] && grid[x][y-1]==1) dfs(grid, visited, x, y-1, list);
        if(y+1<grid[x].length && !visited[x][y+1] && grid[x][y+1]==1) dfs(grid, visited, x, y+1, list);
    }
}
