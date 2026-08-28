class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int last=nums[n-1];
        int lstSec=nums[n-2];
        int ans=(last-1)*(lstSec-1);
        return ans;
    }
}