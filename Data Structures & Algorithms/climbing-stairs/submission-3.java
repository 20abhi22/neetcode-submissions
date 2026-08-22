class Solution {

    public int climbStairs(int n) {
        if(n<=2) return n;
        int[] dp = new int[n+1];
        dp[0]=0;
        dp[1]=1;
        dp[2]=2;

        // if(n==0)return 0;
        // if(n==1)return 1;
        // if(n==2)return 2;
        // int numWays = 0;
        for(int x= 3 ;x <= n;x++){
            // numWays=climbStairs(n-1)+climbStairs(n-2) ;
            dp[x]=dp[x-1]+dp[x-2];
        }
        return dp[n];
        
    }
}
