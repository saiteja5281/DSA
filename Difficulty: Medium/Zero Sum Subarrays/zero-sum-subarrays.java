//{ Driver Code Starts
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt(); // Number of test cases
        sc.nextLine();        // Consume the newline

        while (t-- > 0) {
            String input = sc.nextLine(); // Input array as a space-separated string
            String[] inputArray = input.split(" ");
            int[] arr = new int[inputArray.length];

            // Parse the input array
            for (int i = 0; i < inputArray.length; i++) {
                arr[i] = Integer.parseInt(inputArray[i]);
            }

            Solution ob = new Solution();
            System.out.println(ob.findSubarray(arr));
            System.out.println("~");
        }

        sc.close();
    }
}

// } Driver Code Ends


class Solution {
    public int findSubarray(int[] arr) {
        // code here.
        int ps=0,c=0;
        HashMap<Integer,Integer>h=new HashMap<>();
        h.put(ps,1);
        for(int i=0;i<arr.length;i++){
            ps+=arr[i];
            if(h.containsKey(ps)){
                c+=h.get(ps);
                h.put(ps,h.get(ps)+1);
            }
            else h.put(ps,1);
        }
        return c;
    }
}
