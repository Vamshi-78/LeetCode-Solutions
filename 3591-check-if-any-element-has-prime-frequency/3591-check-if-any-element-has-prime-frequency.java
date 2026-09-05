class Solution {
    public boolean checkPrimeFrequency(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            if(map.containsKey(nums[i]))
            map.put(nums[i],map.get(nums[i])+1);
            else
            map.put(nums[i],1);
        }
        boolean ans=false;
        for(int freq:map.values()){
        int c=0;
        for(int i=1;i<=freq;i++){
            if(freq%i==0)
            c++;
        }
        if(c==2)
        ans=true;
        }
        return ans;
    }
}