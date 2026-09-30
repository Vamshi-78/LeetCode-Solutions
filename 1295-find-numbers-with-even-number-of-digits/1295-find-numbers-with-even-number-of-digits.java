class Solution {
    public int findNumbers(int[] nums) {
        int ec=0;
        for(int num:nums){
            int digc=0;
            while(num!=0){
                digc++;
                num/=10;
            }
            if(digc%2==0)
            ec++;
        }
        return ec;
    }
}