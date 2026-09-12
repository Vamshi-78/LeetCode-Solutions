class Solution {
    public boolean validMountainArray(int[] arr) {
        int n=arr.length;
        if(n<3)
        return false;
        int index=0;
        for(int i=1;i<n;i++){
            if(arr[i-1] >= arr[i])
            break;
            
            index++;
        }
        if(index==0||index==n-1)
        return false;

        for(int i=index;i<n-1;i++){
            if(arr[i]<=arr[i+1])
            return false;
        }
        return true;
    }
}