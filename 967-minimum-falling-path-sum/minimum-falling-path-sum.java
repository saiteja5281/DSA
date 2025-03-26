class Solution {
    /*public static int fun(int i,int j,int m[][],int n){
        if (j < 0 || j >= n) return (int) 1e9;  // Large value, but avoids overflow
        if(i==0) return m[i][j];
            int up=m[i][j]+fun(i-1,j,m,n);
            int d1=m[i][j]+fun(i-1,j-1,m,n);
            int d2=m[i][j]+fun(i-1,j+1,m,n);
            System.out.println(Math.min(up,Math.min(d1,d2)));
            return (Math.min(up,Math.min(d1,d2)));
        }*/
    
    public int minFallingPathSum(int[][] m) {
        int n=m.length;
       
       int mini=0;
       int dp[][]=new int[n][n];
        for(int i=0;i<n;i++) dp[0][i]=m[0][i];
        for(int i=1;i<n;i++){
            for(int j=0;j<n;j++){
                mini=m[i][j];
                int t1=Integer.MAX_VALUE,t2=Integer.MAX_VALUE,t3=Integer.MAX_VALUE;
                if(j-1>=0) t1=dp[i-1][j-1];
                if(j>=0) t2=dp[i-1][j];
                if(j+1>=0 && j+1<n) t3=dp[i-1][j+1];
                dp[i][j]=mini+Math.min(t1,Math.min(t2,t3));
            }
        }
        int ans=dp[n-1][0];
        for(int i=0;i<n;i++){
            System.out.print(dp[n-1][i]+" ");
            if(ans>dp[n-1][i]) ans=dp[n-1][i];
        }
        return ans;
    }
}