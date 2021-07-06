class Solution {
    
   // public int result = 10000;
    
    public int minPathSum(int[][] grid) {
        int [][] dp = new int [grid.length][grid[0].length];
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[i].length; j++){
                dp[i][j] += grid[i][j];
                if(i > 0 && j > 0){
                    dp[i][j] += Math.min(dp[i - 1][j],dp[i][j - 1]);
                }else if(i > 0){
                    dp[i][j] += dp[i - 1][j];
                }else if(j > 0){
                    dp[i][j] += dp[i][j - 1];
                }
            }
        }
        
        return dp[grid.length - 1][grid[0].length - 1];
    }
    
    /*public void calculate(int [][] grid, int row,int column,int sum){
        
        
        sum += grid[row][column];
        if(row == grid.length - 1 && column == grid[row].length - 1  && sum <= result){
            result = sum;
            return ;
        }else if(row == grid.length - 1 && column == grid[row].length - 1  && sum > result){
            return ;
        }
            if(row < grid.length - 1)
                calculate(grid,row + 1,column,sum);
            if(column < grid[row].length - 1)
                calculate(grid,row,column + 1,sum);
    }*/
}
