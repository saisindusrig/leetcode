class Solution {
    public boolean isPalindrome(String s) {
      if (s == null || s.length()==0){
        return true;
      }
      String r= s.toLowerCase();
      StringBuilder sb = new StringBuilder();
      for(int i=0;i<r.length();i++){
        char c= r.charAt(i);
        if(Character.isLetterOrDigit(c)){
            sb.append(c);
        }
      }
      for(int i=0;i<sb.length()/2;i++){
        if(sb.charAt(i)!=sb.charAt(sb.length()-1-i)){
            return false;
        }
      }
      return true;
    }
}