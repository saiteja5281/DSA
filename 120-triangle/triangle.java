class Solution {
   /* public static int fun(int i,int j,List<List<Integer>>l){
        if(i==l.size()-1) return l.get(i).get(j);
        int down=l.get(i).get(j)+fun(i+1,j,l);
        int dg=l.get(i).get(j)+fun(i+1,j+1,l);
        System.out.println("min= "+Math.min(down,dg));
        return Math.min(down,dg);
    }*/
    public int minimumTotal(List<List<Integer>> l) {
        int m=l.size();
        int n=l.get(m-1).size();
       int dp[][]=new int[m][n];
       for(int j=0;j<n;j++){
        dp[m-1][j]=l.get(m-1).get(j);
       }
       for(int i=m-2;i>=0;i--){
        for(int j=i;j>=0;j--){
            int down=l.get(i).get(j)+dp[i+1][j];
            int dg=l.get(i).get(j)+dp[i+1][j+1];
            dp[i][j]=Math.min(down,dg);
        }
       }
       return dp[0][0];
    }
}