class Solution {
    void reverse(int[][] m, int row) {
    int left = 0;
    int right = m.length - 1;

    while (left < right) {
        int temp = m[row][left];
        m[row][left] = m[row][right];
        m[row][right] = temp;

        left++;
        right--;
    }
}
    public void rotate(int[][] matrix) {
        int n=matrix.length;

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        for(int k=0;k<n;k++){
            reverse(matrix,k);
        }
    }
}