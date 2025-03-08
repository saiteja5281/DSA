//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String s = read.readLine().trim();

            Solution ob = new Solution();
            System.out.println(ob.longestUniqueSubstring(s));

            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    int longestUniqueSubstring(String s) {
        // code here
        HashSet<Character>cs=new HashSet<>();
        int i=0,j=0,c=0;
        for(j=0;j<s.length();j++){
            while(cs.contains(s.charAt(j))){
                cs.remove(s.charAt(i));
                i++;
            }
            cs.add(s.charAt(j));
            if(c<j-i+1) c=j-i+1;
        }
        return c;
    }
}