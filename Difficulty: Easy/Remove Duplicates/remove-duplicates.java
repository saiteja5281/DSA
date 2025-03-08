//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String s = read.readLine();

            Solution ob = new Solution();
            String result = ob.removeDups(s);

            System.out.println(result);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    String removeDups(String s) {
        // code here
        int a[]=new int[26];
        StringBuilder s1=new StringBuilder("");
        for(int i=0;i<s.length();i++){
            if(a[s.charAt(i)-97]==0){
                s1.append(s.charAt(i));
                a[s.charAt(i)-97]++;
            }
        }
        return s1.toString();
        
    }
}