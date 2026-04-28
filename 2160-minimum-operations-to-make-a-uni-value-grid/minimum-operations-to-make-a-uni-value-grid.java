class Solution {
    public int minOperations(int[][] grid, int x) {
        int n=grid.length;
        int m=grid[0].length;

        int arr[]=new int[n*m];
        int c=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[c++]=grid[i][j];
            }
        }

        Arrays.sort(arr);
        int rem=arr[0]%x;
        for(int i=1;i<m*n;i++){
            if(arr[i]%x!=rem) return -1;
        }
        int op=0;
        int middle=arr[arr.length/2];
        for(int i=0;i<n*m;i++){
            op+=Math.abs(middle-arr[i])/x;
        }
        return op;
    }
}