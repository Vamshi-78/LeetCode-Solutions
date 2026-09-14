class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> arr=new ArrayList<>();
        Arrays.sort(nums);
        int n=nums.length;
        int j=1;
        for(int i=0;i<n;i++){
            if(j==nums[i])
            j++;
            else if(j>nums[i])
            continue;
            else{
                while(j<nums[i]){
                    arr.add(j);
                    j++;
                }
                j++;
            }    
        }
        while(j<=n){
            arr.add(j);
            j++;
        }
        return arr;
    }
}