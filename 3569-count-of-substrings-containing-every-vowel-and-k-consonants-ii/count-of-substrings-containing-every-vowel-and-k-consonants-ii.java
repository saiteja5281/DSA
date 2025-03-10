class Solution {
    public static long fun1(String s,int k){
         HashMap<Character,Integer>h=new HashMap<>();
        List<Character>l=Arrays.asList('a','e','i','o','u');
        int c=0,j=0;
        long sc=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(l.contains(ch)){
                if(h.containsKey(ch)) h.put(ch,h.get(ch)+1);
                else h.put(ch,1);
            }
            else c++;
            while( h.size()==5 && c>=k){
                sc+=s.length()-i;
                char ch1=s.charAt(j);
                if(l.contains(ch1)){
                    h.put(ch1,h.get(ch1)-1);
                    if(h.get(ch1)==0) h.remove(ch1);
                }
                else c--;
                j++;
            }
           // if(h.size()==5 && c==k) sc+=1;
            
        }
         
        return sc;
    }
    public long countOfSubstrings(String s, int k) {
        return fun1(s,k)-fun1(s,k+1);
    }
}