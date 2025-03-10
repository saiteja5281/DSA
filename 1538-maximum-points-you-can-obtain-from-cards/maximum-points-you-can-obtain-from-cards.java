class Solution {
    public int maxScore(int[] arr, int k) {
       int ts=0,ms=0,s=0,ps=0;
       int p[]=new int[arr.length];
       for(int i:arr) ts+=i;
       if(k==arr.length) return ts;
        for(int i=0;i<arr.length;i++){
            ps+=arr[i];
            p[i]=ps;
        }
        k=k-1;
        int pi=arr.length-1;
        System.out.println(Arrays.toString(p));
        while(k>=0){
            s=p[k]+(ts-p[pi]);
            System.out.println(ts-p[pi]);
            if(ms<s) ms=s;
            k--;
            pi--;
        }
        if(ts-(p[pi])>ms) ms=ts-(p[pi]);
        return ms;
    }
}