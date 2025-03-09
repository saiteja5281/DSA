class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0) nums[i]=0;
            else nums[i]=1;
        }
        int ps=0,c=0;
        HashMap<Integer,Integer>h=new HashMap<>();
        h.put(0,1);
        for(int i=0;i<nums.length;i++){
            ps+=nums[i];
            if(h.containsKey(ps-k)){
                c+=h.get(ps-k);
            }
            if(h.containsKey(ps)) h.put(ps,h.get(ps)+1);
            else h.put(ps,1);
        }
        return c;
    }
}