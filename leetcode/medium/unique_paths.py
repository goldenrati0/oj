class Solution:
    def uniquePaths(self, m: int, n: int) -> int:
        row, col = n, m
        dp = []
        for i in range(row):
            if i == 0:
                dp.append([1] * col)
            else:
                dp.append([1] + [0] * (col - 1))
            
        for i in range(1, row):
            for j in range(1, col):
                dp[i][j] = dp[i][j - 1] + dp[i - 1][j]
        return dp[row - 1][col - 1]