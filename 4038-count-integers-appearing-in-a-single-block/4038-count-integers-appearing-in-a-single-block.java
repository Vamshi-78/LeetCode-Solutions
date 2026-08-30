class Solution {
    public int countSpecialIntegers(int[] nums) {
        Set<Integer> spec = new HashSet<>();
        Set<Integer> inval = new HashSet<>();

        for(int i=0;i<nums.length;i++){
            if(i==0||nums[i]!=nums[i-1]){
                if(spec.contains(nums[i])){
                    inval.add(nums[i]);
                }
                else{
                    spec.add(nums[i]);
                }
            }
        }
        return spec.size()-inval.size();
    }
}