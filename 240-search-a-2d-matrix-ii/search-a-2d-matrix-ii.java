class Solution {
    public boolean find(int[][] matrix, int target,int row,int col,int n,int m){
        if(row>=n||col<0) return false;
        if(matrix[row][col]==target) return true;
        if(matrix[row][col]>target) return find(matrix,target,row,col-1,n,m);
        else return find(matrix,target,row+1,col,n,m);
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix.length;
        int m=matrix[0].length-1;
        int row=0;
        int col=m;
        return  find(matrix,target,row,col,n,m);
        // while(row<n&&col>=0){
        //     if(matrix[row][col]==target) return true;
        //     if(matrix[row][col]>target) col--;
        //     else row++;
        // }

        // for(int i=0;i<n;i++){
        //     int low=0;
        //     int high=m;
        //     while(low<=high){
        //         int mid=low+(high-low)/2;
        //         if(matrix[i][mid]==target) return true;
        //         if(matrix[i][mid]>target){
        //             high=mid-1;
        //         }else low=mid+1;
        //     }
        // }
        // return false;
    }
}