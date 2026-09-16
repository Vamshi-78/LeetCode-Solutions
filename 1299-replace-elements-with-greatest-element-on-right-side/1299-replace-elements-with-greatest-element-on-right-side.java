class Solution {
    public int[] replaceElements(int[] arr) {
        int n=arr.length;
        int max=-1;
        int[] res=new int[n];
        for(int i=n-1;i>0;i--){
            int curr=arr[i];
            res[i]=max;
            if(curr>max)
            max=curr;
        }
        res[0]=max;
        return res;
    }
}