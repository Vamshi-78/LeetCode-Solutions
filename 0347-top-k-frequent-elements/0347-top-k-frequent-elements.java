class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int n:nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        List<Integer>[] arr=new List[nums.length+1];
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            int num=entry.getKey();
            int freq=entry.getValue();

            if(arr[freq]==null){
                arr[freq]=new ArrayList<>();
            }
            arr[freq].add(num);
        }        
        int[] res=new int[k];
        int index=0;
        for(int i=nums.length;i>=1;i--){
            if(arr[i]!=null){
                for(int num:arr[i]){
                    res[index]=num;
                    index++;
                    if(index==k)
                    return res;
                }
            }
        }
        return res;
    }
}