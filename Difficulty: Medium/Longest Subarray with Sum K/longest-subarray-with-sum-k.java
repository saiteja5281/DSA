//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine().trim()); // Read number of test cases

        while (t-- > 0) {
            String line = read.readLine().trim(); // Read the array input
            String[] numsStr = line.split(" ");   // Split the input string by spaces
            int[] nums =
                new int[numsStr.length]; // Convert string array to integer array
            for (int i = 0; i < numsStr.length; i++) {
                nums[i] = Integer.parseInt(numsStr[i]);
            }

            int k = Integer.parseInt(read.readLine().trim()); // Read target sum

            Solution ob = new Solution();
            int ans = ob.longestSubarray(nums, k); // Call the function and store result
            System.out.println(ans);
            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public int longestSubarray(int[] arr, int k) {
        // code here
        /*int i=0,j=0,ml=0,s=0;
        int n=arr.length;
        while(i<n){
            if(s==k && ml<i+1) ml=i+1;
            else if(s>k){
                s-=arr[j];
                j++;
                continue;
            }
            s+=arr[i];
            i++;
        }
        return ml;*/
        HashMap<Integer,Integer>h=new HashMap<>();
        int ml=0,ps=0;
        h.put(ps,0);
        for(int i=0;i<arr.length;i++){
            ps+=arr[i];
            if(h.containsKey(ps-k)){
                if(ml<i-h.get(ps-k)+1) ml=i-h.get(ps-k)+1;
            } 
            h.putIfAbsent(ps,i+1);
        }
        return ml;
    }
}
