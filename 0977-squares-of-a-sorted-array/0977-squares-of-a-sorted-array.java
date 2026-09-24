class Solution {
    public int[] sortedSquares(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int pow=(int)Math.pow(nums[i],2);
            nums[i]=pow;
        }
        Arrays.sort(nums);
        return nums;
    }
}