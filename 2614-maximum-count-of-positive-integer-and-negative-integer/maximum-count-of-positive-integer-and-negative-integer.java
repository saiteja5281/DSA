class Solution {
    public int maximumCount(int[] a) {
        if(a[0]==0 && a[a.length-1]==0) return 0;
        
        int c=0;
        int p1=-1,i=0,j=a.length-1;
        while(i<=j){
            int m=(i+j)/2;
            if(a[m]>=0){j=m-1;}
            else if(a[m]<0){p1=m;i=m+1;}
            //else j=m-1;
            System.out.println(i+" "+j);
        }
        c=p1+1;
        i=0;j=a.length-1;
        p1=-1;
        while(i<=j){
            int m=(i+j)/2;
            if(a[m]<=0){i=m+1;}
            else if(a[m]>0){p1=m;j=m-1;}
            //else j=m-1;
            System.out.println(i+" "+j);
        }
        if(p1!=-1 && c<a.length-p1) c=a.length-p1;
        return c;
    }
}