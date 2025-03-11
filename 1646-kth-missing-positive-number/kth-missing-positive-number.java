class Solution {
    public int findKthPositive(int[] arr, int k) {
        
        int n=arr.length;
        int miss[]=new int[n];
        for(int i=0;i<n;i++) miss[i]=arr[i]-i-1;
        int i=0,j=n-1;
        System.out.println(Arrays.toString(miss));
        if(k<=miss[0]) return k;
        while(i<=j){
            int m=(i+j)/2;
            if(miss[m]<k) i=m+1;
            else j=m-1;
        }
        System.out.println(i+" "+j);
        return k-miss[j]+arr[j];
    }
}