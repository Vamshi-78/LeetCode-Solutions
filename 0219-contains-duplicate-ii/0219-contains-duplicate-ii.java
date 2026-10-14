class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        // for(int i=0;i<nums.length;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         if((nums[i]==nums[j]&&Math.abs(i-j)<=k))
        //         return true;
        //     }
        // }
        // return false;
        if(k==0)
        return false;
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(i>k){
            set.remove(nums[i-k-1]);
            }
            if(!set.contains(nums[i])){
            set.add(nums[i]);
            }
            else
            return true;
        }
        return false;

    }
}