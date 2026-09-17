/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* runningSum(int* nums, int numsSize, int* returnSize) {
    int* ans=(int*)malloc(numsSize*sizeof(int));
    int index=0;
    ans[index]=nums[0];
    for(int i=1;i<numsSize;i++){
        ans[i]=ans[index]+nums[i];
        index++;
    }
    *returnSize=numsSize;
    return ans;
}