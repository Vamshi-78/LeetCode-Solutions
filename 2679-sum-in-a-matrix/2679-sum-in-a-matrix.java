class Solution {
    public int matrixSum(int[][] nums) {
        int n=nums.length;
        int m=nums[0].length;
        int sum=0;
        for(int i=0;i<n;i++){
            Arrays.sort(nums[i]);
        }
        for(int j=0;j<m;j++){
            int max=0;
            for(int k=0;k<n;k++){
                max=Math.max(max,nums[k][j]);
            }
            sum+=max;
        }
        return sum;
    }
}