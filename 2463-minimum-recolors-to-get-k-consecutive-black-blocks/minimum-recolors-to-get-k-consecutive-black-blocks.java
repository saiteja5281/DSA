class Solution {
    public int minimumRecolors(String s, int k) {
        int c=0,mc;
        for(int i=0;i<k;i++){
            if(s.charAt(i)=='W') c++;
        }
        mc=c;
        for(int i=1;i<s.length()-k+1;i++){
            if(s.charAt(i-1)=='W' && s.charAt(i-1+k)=='B') c--;
            else if(s.charAt(i-1)=='B' && s.charAt(i-1+k)=='W') c++;
            if(mc>c) mc=c;
        }
        return mc;
    }
}