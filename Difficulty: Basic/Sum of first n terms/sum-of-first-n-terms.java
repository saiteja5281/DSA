//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.sumOfSeries(N));

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public static void fun(int n,int a[]){
        a[0]+=(n*n*n);
        if(n==1) return;
        fun(n-1,a);
    }
    int sumOfSeries(int n) {
        // code here
        int a[]={0};
        fun(n,a);
        return a[0];
    }
}