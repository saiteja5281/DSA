class Solution {
    public static int fun(int[] nums,int k,int n){
        int c=0,j=0;
        HashMap<Integer,Integer>h=new HashMap<>();
        for(int i=0;i<n;i++){
            h.put(nums[i],h.getOrDefault(nums[i],0)+1);
            while(h.size()>k){
                h.put(nums[j],h.get(nums[j])-1);
                if(h.get(nums[j])==0) h.remove(nums[j]);
                j++;
            }
            c+=(i-j+1);
        }
        return c;
    }
    public int subarraysWithKDistinct(int[] nums, int k) {
        int n=nums.length;
        return fun(nums,k,n)-fun(nums,k-1,n);
    }
}