//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.lang.*;
import java.util.*;


// } Driver Code Ends

// User function Template for Java

class Solution {
    public int minimizeCost(int k, int arr[]) {
        // code here
        int n=arr.length;
        if(n==1) return 0;
        int a[]=new int[n];
        a[1]=Math.abs(arr[1]-arr[0]);
        for(int i=2;i<n;i++){
            int c=k,m=Integer.MAX_VALUE;
            for(int j=i-1;j>=0;j--){
                if(c==0) break;
                m=Math.min(m,Math.abs(arr[i]-arr[j])+a[j]);
                c--;
            }
            a[i]=m;
        }
        return a[n-1];
    }
}



//{ Driver Code Starts.

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int k = Integer.parseInt(br.readLine());
            String line = br.readLine();
            String[] tokens = line.split(" ");

            // Create an ArrayList to store the integers
            ArrayList<Integer> array = new ArrayList<>();

            // Parse the tokens into integers and add to the array
            for (String token : tokens) {
                array.add(Integer.parseInt(token));
            }

            int[] arr = new int[array.size()];
            int idx = 0;
            for (int i : array) arr[idx++] = i;
            Solution obj = new Solution();
            int res = obj.minimizeCost(k, arr);

            System.out.println(res);

            System.out.println("~");
        }
    }
}
// } Driver Code Ends