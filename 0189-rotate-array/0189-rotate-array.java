class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;

        // int[] ans=new int[n];
        // for(int i=0;i<n;i++){
        //     ans[(i+k)%n]=nums[i];
        // }
        // for(int i=0;i<n;i++){
        //     nums[i]=ans[i];
        // }

        if(k<0){
            k+=n;
        }
        reverse(nums,0,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);

    }
    static void reverse(int nums[],int l,int r){
        while(l<r){
            int temp=nums[l];
            nums[l]=nums[r];
            nums[r]=temp;
            l++;
            r--;
        }
    }
}