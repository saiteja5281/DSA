//{ Driver Code Starts
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());

        while (tc-- > 0) {
            String str[] = br.readLine().split(" ");
            int arr[] = new int[str.length];

            for (int i = 0; i < str.length; i++) arr[i] = Integer.parseInt(str[i]);
            Solution obj = new Solution();

            obj.reverseArray(arr);
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


class Solution {
    public static void fun(int arr[],int m,int i,int n){
        if(i==m) return;
        fun(arr,m,i+1,n);
        int t=arr[i];
        arr[i]=arr[n-i-1];
        arr[n-i-1]=t;
    }
    public void reverseArray(int arr[]) {
        // code here
        int m=arr.length/2;
        int n=arr.length;
        fun(arr,m,0,n);
    }
}