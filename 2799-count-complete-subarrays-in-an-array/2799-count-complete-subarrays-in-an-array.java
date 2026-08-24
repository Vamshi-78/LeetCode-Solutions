class Solution {
    public int countCompleteSubarrays(int[] nums) {
        int n=nums.length;
        int ans=0;
        Set<Integer>set=new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        int x=set.size();
        for(int i=0;i<n;i++){
            Set<Integer> s=new HashSet<>();
            for(int j=i;j<n;j++){
                s.add(nums[j]);
                if(s.size()==x){
                    ans++;
                }
            }
        }
        return ans;
    }
}