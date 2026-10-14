/**
 * Return an array of arrays of size *returnSize.
 * The sizes of the arrays are returned as *returnColumnSizes array.
 * Note: Both returned array and *columnSizes array must be malloced, assume caller calls free().
 */
int** transpose(int** matrix, int n, int* m, int* returnSize, int** returnColumnSizes) {
    int rows=m[0];
    int cols=n;
    int** ans=(int**)malloc(rows*sizeof(int*));
    *returnColumnSizes=(int*)malloc(rows*sizeof(int));

    for (int i=0;i<rows;i++){
        ans[i]=(int*)malloc(cols*sizeof(int));
        (*returnColumnSizes)[i]=cols;
    }

    for (int i=0;i<n;i++) {
        for (int j=0;j<m[0];j++) {
            ans[j][i]=matrix[i][j];
        }
    }
    *returnSize=rows;
    return ans;
}