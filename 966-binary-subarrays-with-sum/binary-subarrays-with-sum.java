class Solution {
    public int numSubarraysWithSum(int[] a, int k) {
        HashMap<Integer,Integer>h=new HashMap<>();
        int ps=0,c=0;
        h.put(ps,1);
        for(int i=0;i<a.length;i++){
            ps+=a[i];
            if(h.containsKey(ps-k)){
                c+=h.get(ps-k);
            }
            if(h.containsKey(ps)) h.put(ps,h.get(ps)+1);
            else h.put(ps,1);
        }
        System.out.println(c);
        return c;
    }
}