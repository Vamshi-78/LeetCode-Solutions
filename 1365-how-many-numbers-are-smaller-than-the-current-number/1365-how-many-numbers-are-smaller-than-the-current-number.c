/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* smallerNumbersThanCurrent(int* nums, int n, int* returnSize) {
    int* ans=(int*)malloc(n*sizeof(int));
    for(int i=0;i<n;i++){
        int c=0;
        for(int j=0;j<n;j++){
            if(nums[i]>nums[j])
            c++;
        }
        ans[i]=c;
    }
    *returnSize=n;
    return ans;
}