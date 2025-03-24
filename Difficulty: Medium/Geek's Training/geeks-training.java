//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int N = sc.nextInt();
            int[][] arr = new int[N][3];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < 3; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }
            Solution obj = new Solution();
            int res = obj.maximumPoints(arr);
            System.out.println(res);

            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public static int f(int idx,int prev,int arr[][],int[][] dp){
        if(idx==-1) return 0;
        if(dp[idx][prev]!=0) return dp[idx][prev];
        int m=0;
        for(int i=0;i<3;i++){
            if(i!=prev){
            int f1=arr[idx][i]+f(idx-1,i,arr,dp);
            m=Math.max(m,f1);
            }
        }
        return dp[idx][prev]=m;
    }
    public int maximumPoints(int arr[][]) {
        // code here
        int dp[][]=new int[arr.length][4];
        return f(arr.length-1,3,arr,dp);
    }
}