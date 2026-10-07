class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set=new HashSet<>();
        for(int num:nums){
            if(!set.contains(num))
            set.add(num);
            else
            return true;
        }
        return false;



        // Arrays.sort(nums);
        // boolean ans=false;
        // int j=1;
        // for(int i=0;i<nums.length-1;i++){
        //     if(nums[i]==nums[j])
        //     ans=true;
        //     else{
        //         j++;
        //     }
        // }
        // return ans;



        //  Arrays.sort(nums);
        // boolean ans=false;
        // for(int i=0;i<nums.length;i++){
        //     if(i<nums.length-1&&nums[i]==nums[i+1])
        //     ans=true;
        // }
        // return ans;
    }
}