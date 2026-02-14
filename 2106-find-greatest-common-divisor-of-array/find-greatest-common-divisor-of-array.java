class Solution {
    public int findGCD(int[] nums) {
        merges(nums,0,nums.length-1);
        int min=nums[0];
        int max=nums[nums.length-1];
        return gcd(min,max);
    }
    public int gcd(int min,int max){
        if(max==0) return min;
        return gcd(max,min%max);
    }
    public void merges(int[] nums,int low,int high){
        if(low>=high) return;
        int mid=low+(high-low)/2;

        merges(nums,low,mid);
        merges(nums,mid+1,high);

        sorting(nums,low,mid,high);
    }
    public void sorting(int[] nums,int low,int mid,int high){
        int temp[]=new int[high-low+1];

        int i=low;
        int j=mid+1;
        int count=0;
        while(i<=mid&&j<=high){
            if(nums[i]<=nums[j]){
                temp[count++]=nums[i];
                i++;
            }
            else{
                temp[count++]=nums[j++];
            }
        }
        while(i<=mid){
            temp[count++]=nums[i++];
        }
        while(j<=high){
            temp[count++]=nums[j++];
        }

        for(int k=0;k<temp.length;k++){
            nums[k+low]=temp[k];
        }

    }

}