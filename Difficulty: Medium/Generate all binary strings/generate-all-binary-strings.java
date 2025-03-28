//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

class GFG {
  public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    while (T-- > 0) {
      int n = sc.nextInt();
      Solution obj = new Solution();
      List<String> ans = obj.generateBinaryStrings(n);
      for(String s : ans) System.out.print(s+" ");
      System.out.println();
    
System.out.println("~");
}
  }
}

// } Driver Code Ends


//User function Template for Java

class Solution {
    public static void fun(int c,String s,List<String>l,char ch,int n){
        if(c==n){l.add(s);return;}
        fun(c+1,s+"0",l,'0',n);
        if(ch!='1') fun(c+1,s+"1",l,'1',n);
    }
  public static List<String> generateBinaryStrings(int n) {
    // code here
        List<String>l=new ArrayList<>();
        fun(0,"",l,'0',n);
        return l;
  }
}
     
     