//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GfG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            int k = sc.nextInt();
            Solution obj = new Solution();
            System.out.println(obj.longestkSubstr(s, k));
        
System.out.println("~");
}
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public int longestkSubstr(String s, int k) {
        // code here
        HashMap<Character,Integer>h=new HashMap<>();
        int j=0,ml=-1;
        for(int i=0;i<s.length();i++){
            char c1=s.charAt(i);
            if(h.containsKey(c1)) h.put(c1,h.get(c1)+1);
            else h.put(c1,1);
            //System.out.println(h);
            if(ml<i-j+1 && h.size()==k) ml=i-j+1;
            while(h.size()>k){
                h.put(s.charAt(j),h.get(s.charAt(j))-1);
                if(h.get(s.charAt(j))==0) h.remove(s.charAt(j));
                j++;
            }
            
        }
        return ml;
    }
}