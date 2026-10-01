/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int compare(const void *a,const void *b){
    return (*(int*)a-*(int*)b);
}
int* sortedSquares(int* nums, int n, int* returnSize) {
    int* ans=malloc(n*sizeof(int));
    for(int i=0;i<n;i++){
            nums[i]=nums[i]*nums[i];
        }
        // for(int i=0;i<n;i++){
        //     for(int j=i+1;j<n;j++){
        //         if(nums[i]>nums[j]){
        //             int temp=nums[i];
        //             nums[i]=nums[j];
        //             nums[j]=temp;
        //         }
        //     }
        // }
        qsort(nums,n,sizeof(int),compare);
        for(int i=0;i<n;i++){
            ans[i]=nums[i];
        }
        *returnSize=n;
        return ans;
}