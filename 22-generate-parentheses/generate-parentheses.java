class Solution {
    public static void fun(int open,int close,int n,String s,List<String>l){
        if(close==n){l.add(s);return;}
        if(open<n) fun(open+1,close,n,s+"(",l);
        if(close<open) fun(open,close+1,n,s+")",l);
    }
    public List<String> generateParenthesis(int n) {
        List<String>l=new ArrayList<>();
        fun(0,0,n,"",l);
        return l;
    }
}