//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) {

        // taking input using Scanner class
        Scanner sc = new Scanner(System.in);

        // taking total testcases
        int t = sc.nextInt();

        while (t-- > 0) {

            // taking count of stairs
            int m = sc.nextInt();

            // creating an object of class DynamicProgramming
            Solution obj = new Solution();

            // calling method countWays() of class
            // DynamicProgramming
            System.out.println(obj.countWays(m));

            System.out.println("~");
        }
    }
}
// } Driver Code Ends


class Solution {
    int countWays(int n) {
        // your code here
        int p1=1,p2=2,c=0;
        if(n==1) return 1;
        else if(n==2) return 2;
        for(int i=3;i<=n;i++){
            c=p1+p2;
            p1=p2;
            p2=c;
        }
        return c;
    }
}
