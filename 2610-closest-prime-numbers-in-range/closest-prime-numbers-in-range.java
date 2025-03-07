class Solution {
    public static boolean fun(int n){
        if (n < 2) return false; 
        if (n == 2) return true; 
        if (n % 2 == 0) return false; 
        
        for (int i = 3; i * i <= n; i += 2) { 
            if (n % i == 0) return false;
        }
        return true;
    }
    
    public int[] closestPrimes(int l, int r) {
        ArrayList<Integer>a=new ArrayList<>();
        for(int i=l;i<=r;i++){
            if(fun(i)) a.add(i);
        }
        int n1=-1,n2=-1,m=-1;
        for(int i=1;i<a.size();i++){
            if(m==-1 || a.get(i)-a.get(i-1)<m){
                m=a.get(i)-a.get(i-1);
                n1=a.get(i-1);
                n2=a.get(i);
            }
        }
        int a1[]=new int[2];
        a1[0]=n1;
        a1[1]=n2;
        return a1;
    }
}