package graph.MaxAreaofIsland;

import java.util.Stack;

public class MaxAreaofIsland {
    public static void main(String[] args){
        int[][] grid = {{0,0,1,0,0,0,0,1,0,0,0,0,0},
                {0,0,0,0,0,0,0,1,1,1,0,0,0},
                {0,1,1,0,1,0,0,0,0,0,0,0,0},
                {0,1,0,0,1,1,0,0,1,0,1,0,0},
                {0,1,0,0,1,1,0,0,1,1,1,0,0},
                {0,0,0,0,0,0,0,0,0,0,1,0,0},
                {0,0,0,0,0,0,0,1,1,1,0,0,0},
                {0,0,0,0,0,0,0,1,1,0,0,0,0}};
        Solution solution = new Solution();
        System.out.println(solution.maxAreaOfIsland(grid));

        Solution2 solution2 = new Solution2();
        System.out.println(solution2.maxAreaOfIsland(grid));
    }
}

class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int maxArea = 0;
        if(grid == null) return maxArea;
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        for(int x=0; x<grid.length; x++){
            for(int y=0; y<grid[x].length; y++){
                if(!visited[x][y] && grid[x][y] == 1){
                    visited[x][y]=true;
                    maxArea = Math.max(this.dfs(grid, visited, new Point(x, y)), maxArea);
                }
            }
        }
        return maxArea;
    }

    public int dfs(int[][] grid, boolean[][] visited, Point point){
        int area = 0;
        Stack<Point> stack = new Stack<>();
        stack.add(point);
        while (!stack.isEmpty()){
            area++;
            Point currentNode = stack.pop();
            if(currentNode.x-1 >= 0 && !visited[currentNode.x-1][currentNode.y] && grid[currentNode.x-1][currentNode.y]==1) {
                visited[currentNode.x-1][currentNode.y]=true;
                stack.add(new Point(currentNode.x-1, currentNode.y));
            }
            if(currentNode.x+1 < grid.length && !visited[currentNode.x+1][currentNode.y] && grid[currentNode.x+1][currentNode.y]==1) {
                visited[currentNode.x+1][currentNode.y]=true;
                stack.add(new Point(currentNode.x+1, currentNode.y));
            }
            if(currentNode.y-1 >=0 && !visited[currentNode.x][currentNode.y-1]
                    && grid[currentNode.x][currentNode.y-1]==1) {
                visited[currentNode.x][currentNode.y-1]=true;
                stack.add(new Point(currentNode.x, currentNode.y-1));
            }
            if(currentNode.y+1 < grid[currentNode.x].length && !visited[currentNode.x][currentNode.y+1]
                    && grid[currentNode.x][currentNode.y+1]==1) {
                visited[currentNode.x][currentNode.y+1]=true;
                stack.add(new Point(currentNode.x, currentNode.y+1));
            }
        }
        return area;
    }
}

class Point{
    int x;
    int y;
    public Point(int x, int y){
        this.x=x;
        this.y=y;
    }
}