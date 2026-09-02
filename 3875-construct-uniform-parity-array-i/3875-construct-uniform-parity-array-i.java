class Solution {
    public boolean uniformArray(int[] nums1) {
        int n=nums1.length;
        if(n==1)
        return true;
        int oddC=0;
        int evenC=0;
        
        for(int i=0;i<n;i++){
           if(nums1[i]%2==0)
           evenC++;
           else
           oddC++;
        }
        if(oddC!=1){
            return true;
        }
        if(evenC>0){
            return true;
        }
        return false;
    }
}