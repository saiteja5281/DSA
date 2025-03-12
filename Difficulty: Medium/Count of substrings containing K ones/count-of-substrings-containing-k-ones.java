//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String input[] = read.readLine().trim().split(" ");
            String s = input[0];
            int k = Integer.parseInt(input[1]);
            Solution ob = new Solution();
            System.out.println(ob.countOfSubstringWithKOnes(s, k));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    public static long fun(String s,int k,int n){
        
        int j=0,c=0;
        long s1=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='1') c++;
            while(c>k){
                if(s.charAt(j)=='1') c--;           
                j++;
                
            }
            s1+=(i-j+1);
        }
        return s1;
    }
    long countOfSubstringWithKOnes(String s, int k){
        
       
        //  code here
        int n=s.length();
        if(k==0) return fun(s,0,n);
        return fun(s,k,n)-fun(s,k-1,n);
    }
}