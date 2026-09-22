class Solution {
    public int findPeakElement(int[] nums) {
        int a=nums[0];
        int index=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>a){
                a=nums[i];
            index=i;
            }
        }
        return index;
    }
}