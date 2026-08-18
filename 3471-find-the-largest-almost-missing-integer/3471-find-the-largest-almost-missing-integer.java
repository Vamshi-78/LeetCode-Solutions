class Solution {
    public int largestInteger(int[] nums, int k) {
        int n=nums.length;
        HashMap<Integer,Integer> freq=new HashMap<>();
        if(n==k){
            int ans=nums[0];
        for(int num:nums){
            ans=Math.max(ans,num);
        }
        return ans;
        }
        int[] count=new int[51];
        for(int num:nums){
           count[num]++;
        }
        if(k==1){
            for(int i=50;i>=0;i--){
                if(count[i]==1)
                return i;
            }
                return -1;
        }
        int ans=-1;
        if(count[nums[0]]==1){
            ans=Math.max(ans,nums[0]);
        }
        if(count[nums[n-1]]==1){
            ans=Math.max(ans,nums[n-1]);
        }
        return ans;
    }
}