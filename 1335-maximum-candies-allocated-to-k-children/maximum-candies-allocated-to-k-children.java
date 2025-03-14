class Solution {
    public static boolean fun(int mid,int[] c,long k){
        long count=0;
        for(int i:c){
            count+=(i/mid);
        }
        return count>=k;
    }
    public int maximumCandies(int[] c, long k) {
        int res=c[0],me=c[0];
        long ts=0;
        for(int i:c){
            if(me<i) me=i;
            ts+=i;
        }
      
        if(ts<k) return 0;
        int i=1,j=me;
        while(i<=j){
            int mid=(i+j)/2;
            if(fun(mid,c,k)){
                res=mid;
                i=mid+1;
            }
            else j=mid-1;
        }
        return res;
    }
}