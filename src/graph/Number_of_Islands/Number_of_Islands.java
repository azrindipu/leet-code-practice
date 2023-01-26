package graph.Number_of_Islands;

public class Number_of_Islands {
    public static char[][] grid = {
            {'1','1','1','1','0'},
            {'1','1','0','1','0'},
            {'1','1','0','0','0'},
            {'0','0','0','0','0'}};

    public static void main(String[] args){
        Solution solution = new Solution();
        System.out.println(solution.numIslands(grid));
    }
}

class Solution {
    public int numIslands(char[][] grid) {
        if(grid == null) return 0;
        int count =0;
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        for(int x=0; x<grid.length; x++){
            for(int y=0; y<grid[x].length; y++){
                if(!visited[x][y] && grid[x][y]=='1'){
                    count++;
                    dfs(grid, visited, x, y);
                }
            }
        }
        return count;
    }

    void dfs(char[][] grid, boolean[][] visited, int x, int y){
        visited[x][y]=true;
        if(x-1>=0 && !visited[x-1][y] && grid[x-1][y]=='1') dfs(grid, visited, x-1, y);
        if(x+1<grid.length && !visited[x+1][y] && grid[x+1][y]=='1') dfs(grid, visited, x+1, y);
        if(y-1>=0 && !visited[x][y-1] && grid[x][y-1]=='1') dfs(grid, visited, x, y-1);
        if(y+1<grid[x].length && !visited[x][y+1] && grid[x][y+1]=='1') dfs(grid, visited, x, y+1);
    }
}