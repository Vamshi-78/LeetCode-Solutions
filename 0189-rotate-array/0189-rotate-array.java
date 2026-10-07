class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;

        // for(int i=0;i<k;i++){
        //     int temp=nums[0];
        //     for(int j=1;j<n;j++){
        //     nums[j-1]=nums[j];
        // }

        int[] ans=new int[n];
        for(int i=0;i<n;i++){
            ans[(i+k)%n]=nums[i];
        }
        for(int i=0;i<n;i++){
            nums[i]=ans[i];
        }
        // nums[n-1]=temp;
    }
}