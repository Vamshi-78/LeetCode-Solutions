class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int size=nums.length;
        return nums[size/2];
    }
}