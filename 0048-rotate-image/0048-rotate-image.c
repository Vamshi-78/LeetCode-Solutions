void rotate(int** matrix, int r, int* c) {
    for(int i=0;i<r;i++){
        for(int j=i;j<c[0];j++){
            int temp=matrix[i][j];
            matrix[i][j]=matrix[j][i];
            matrix[j][i]=temp;
        }
    }
    for(int i=0;i<r;i++){
        for(int j=0;j<c[0]/2;j++){
            int temp=matrix[i][j];
            matrix[i][j]=matrix[i][c[0]-j-1];
            matrix[i][c[0]-j-1]=temp;
        }
    }
}