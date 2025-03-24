//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.lang.*;
import java.util.*;


// } Driver Code Ends

// User function Template for Java

class Solution {
    int findMaxSum(int arr[]) {
        // code here
        int prev=arr[0];
        int prev2=0;
        for(int i=1;i<arr.length;i++){
            int take=arr[i];
            if(i>1) take+=prev2;
            int notake=prev;
            int curr=Math.max(take,notake);
            prev2=prev;
            prev=curr;
        }
        return prev;
    }
}


//{ Driver Code Starts.

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
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
            int res = obj.findMaxSum(arr);

            System.out.println(res);

            System.out.println("~");
        }
    }
}

// } Driver Code Ends