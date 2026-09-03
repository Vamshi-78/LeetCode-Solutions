class Solution {
    public int mySqrt(int x) {
        // long i=1;
        // while(i*i<=x){
        //     i++;
        // }
        // return (int)(i-1);

        if(x<2){
            return x;
        }

        int l=1;
        int r=x/2;
        while(l<=r){
            int mid=(r+l)/2;
            if(mid<=(x/mid))
            l=mid+1;
            else
            r=mid-1;
        }
        return r;
    }
}