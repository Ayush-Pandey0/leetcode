class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix.length;
        int m=matrix[0].length;
        for(int i=0;i<n;i++){
            int left=0;
            int right=m-1;
            while(left<=right){
                int mid=left+(right-left)/2;
                if(target==matrix[i][mid]) return true;
                if(target<matrix[i][mid]) right=mid-1;
                else{
                    left=mid+1;
                }
            }
        }
            return false;

    }
}