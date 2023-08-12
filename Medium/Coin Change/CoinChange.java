// User function Template for Java

class Solution {
    public long count(int coins[], int n, int sum) {
        // code here.
        long[][] dp = new long[n+1][sum+1];
        for(int i=0;i<=n;i++) dp[i][0]=1;
        
        for(int i=1;i<=n;i++){
            for(int j=1;j<=sum;j++){
                dp[i][j] = dp[i-1][j];
                if(coins[i-1]<=j){
                  dp[i][j] += dp[i][j-coins[i-1]];
                }
            }
        }
        return dp[n][sum];
    }
}