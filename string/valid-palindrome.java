class Solution {
    public boolean isPalindrome(String s) {
      String s1="";
      for(int i=0;i<s.length();i++){
        if(Character.isLetterOrDigit(s.charAt(i))) s1+=s.charAt(i);
      }  
      s1=s1.toLowerCase();
      int i=0;
      int j=s1.length()-1;
      System.out.println(s1);
      while(i<=j){
        if(s1.charAt(i)!=s1.charAt(j)) return false;
        i++;
        j--;
      }
      return true;
    }
}