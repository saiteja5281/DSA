class Solution {
    public int numberOfSubstrings(String s) {
        int c=0,n=s.length(),j=0;
        int f[]=new int[3];
        for(int i=0;i<n;i++){
            f[s.charAt(i)-'a']+=1;
            while(f[0]>0 && f[1]>0 && f[2]>0){
                c+=n-i;
                f[s.charAt(j)-'a']-=1;
                j++;
            }
        }
       return c;
    }
}