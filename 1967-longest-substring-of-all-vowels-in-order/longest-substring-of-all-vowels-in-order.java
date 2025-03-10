class Solution {
    public int longestBeautifulSubstring(String s) {
        HashMap<Character,Integer>h=new HashMap<>();
        int c=1,mc=0,n=s.length();
        h.put(s.charAt(0),1);

        for(int i=1;i<n;i++){
            if(s.charAt(i)>=s.charAt(i-1)){
                h.put(s.charAt(i),1);
                c++;
            }
            
            else{
                h.clear();
                h.put(s.charAt(i),1);
                c=1;
            }
             if(h.size()==5){
                if(mc<c) mc=c;
            }
        }
        return mc;
    }
}