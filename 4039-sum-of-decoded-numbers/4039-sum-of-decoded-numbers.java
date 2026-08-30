class Solution {
    public int sumDecoded(long[] nums) {
        long MOD = 1_000_000_007;
        long sum=0;
        for(long num:nums){
            int width=(int)(num%10);
            long d=num/10;
            String s=String.valueOf(d);
            long x=Long.parseLong(s.substring(0,width));
            long y=Long.parseLong(s.substring(width));
            long res=1;
            long base=x%MOD;
            while(y>0){
                if(y%2==1){
                    res=(res*base)%MOD;
                }
                base=(base*base)%MOD;
                y=y/2;    
            }
            sum=(sum+res)%MOD;
        }
        return (int)sum;
    }
}