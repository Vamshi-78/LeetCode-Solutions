class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0;
        int mul=1;
        int ans=0;
        int temp=n;
        while(n>0){
            int r=n%10;
            sum+=r;
            mul*=r;
            ans=sum+mul;
            n/=10;
        }
        if(temp%ans==0)
        return true;
        else
        return false;
    }
}