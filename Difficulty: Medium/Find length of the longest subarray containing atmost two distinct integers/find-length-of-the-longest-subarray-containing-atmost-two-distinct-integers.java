//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t;
        t = sc.nextInt();
        sc.nextLine(); // Consume the newline character

        while (t-- > 0) {
            String line = sc.nextLine();
            String[] tokens = line.split(" ");

            // Create an ArrayList to store the integers
            ArrayList<Integer> array = new ArrayList<>();

            // Parse the tokens into integers and add to the array
            for (String token : tokens) {
                array.add(Integer.parseInt(token));
            }

            // Convert ArrayList to array
            Integer[] arr = new Integer[array.size()];
            array.toArray(arr);

            Solution ob = new Solution();

            // Call totalFruits method and print result
            Integer ans = ob.totalElements(arr);
            System.out.println(ans);

            System.out.println("~");
        }
        sc.close();
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public static int totalElements(Integer[] arr) {
        // code here
        HashMap<Integer,Integer>h=new HashMap<>();
        int i=0,j=0,c=0;
        for(i=0;i<arr.length;i++){
            if(h.containsKey(arr[i])) h.put(arr[i],h.get(arr[i])+1);
            else h.put(arr[i],1);
            while( h.size()>2){
                h.put(arr[j],h.get(arr[j])-1);
                if (h.get(arr[j]) == 0) h.remove(arr[j]);
                j++;
                //System.out.println(c+" "+h.size());
            }
            if(c<i-j+1) c=i-j+1;
        }
        return c;
    }
}