//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long N = sc.nextLong();

            Solution ob = new Solution();
            ArrayList<Long> ans = ob.factorialNumbers(N);
            for (long num : ans) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


// User function Template for Java
class Solution {
     public static void fun(long n,long a[],int p,long temp,ArrayList<Long> l){
        a[0]*=p;
        temp=a[0];
        if(a[0]>n) return;
        fun(n,a,p+1,temp,l);
        l.add(temp);
    }
    static ArrayList<Long> factorialNumbers(long n) {
        // code here
        long a[]={1};
        int p=1;
        long temp=1;
        ArrayList<Long>l=new ArrayList<>();
        fun(n,a,p,temp,l);
        Collections.reverse(l);
        return l;
    }
}