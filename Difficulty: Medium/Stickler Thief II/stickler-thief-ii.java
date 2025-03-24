//{ Driver Code Starts
import java.io.*;
import java.util.*;

class IntArray {
    public static int[] input(BufferedReader br) throws IOException {
        String[] s = br.readLine().trim().split(" ");
        int n = s.length;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = Integer.parseInt(s[i]);

        return a;
    }

    public static void print(int[] a) {
        for (int e : a) System.out.print(e + " ");
        System.out.println();
    }

    public static void print(ArrayList<Integer> a) {
        for (int e : a) System.out.print(e + " ");
        System.out.println();
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {

            int[] arr = IntArray.input(br);

            Solution obj = new Solution();
            int res = obj.maxValue(arr);

            System.out.println(res);
            System.out.println("~");
        }
    }
}

// } Driver Code Ends


class Solution {
    int maxValue(int[] arr) {
        // code here
        int n=arr.length;
        int prev=arr[0];
        int prev2=0;
        for(int i=1;i<n-1;i++){
            int take=arr[i];
            if(i>1) take+=prev2;
            int notake=prev;
            int curr=Math.max(take,notake);
            prev2=prev;
            prev=curr;
        }
        int ans=prev;
        prev=arr[1];
        prev2=0;
         for(int i=2;i<n;i++){
            int take=arr[i];
            if(i>1) take+=prev2;
            int notake=prev;
            int curr=Math.max(take,notake);
            prev2=prev;
            prev=curr;
        }
        return Math.max(ans,prev);
    }
}
