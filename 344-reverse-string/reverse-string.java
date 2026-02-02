class Solution {
    public void reverseString(char[] s) {
        int l=0;
        int r=s.length-1;
        reverse(s,l,r);
    }
    private void reverse(char[] s, int l,int r){
        if(l>r) return;
        char temp=s[l];
        s[l]=s[r];
        s[r]=temp;
        reverse(s,l+1,r-1);
    }
}