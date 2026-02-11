class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int l1=nums1.length;
        int l2=nums2.length;
        HashSet<Integer> h=new HashSet<>();
        HashSet<Integer> m=new HashSet<>();
        for(int i:nums1){
            h.add(i);
        }
        for(int i:nums2){
            if(h.contains(i)){
                m.add(i);
            }
        }
        int arr[]=new int[m.size()];
        int c=0;
        for(int i:m){
            arr[c]=i;
            c++;
        }
        return arr;
    }
}