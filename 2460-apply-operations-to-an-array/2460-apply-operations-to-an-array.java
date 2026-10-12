class Solution {
    public int[] applyOperations(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n-1;i++){
            int j=i+1;
            if(nums[i]==nums[j]){
                nums[i]=nums[i]*2;
                nums[j]=0;
            }
        }
        int k=0;
        for(int i=0;i<n;i++){
            if(nums[i]!=0){
                nums[k]=nums[i];
                k++;
            }
        }
        for(int i=k;i<n;i++){
            nums[i]=0;
        }
        return nums;
    }
}