class Solution {
    public boolean isPalindrome(String s) {
        if(s == null || s.length()==0) {
			return true;
        }
        String r =s.toLowerCase();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<r.length();i++){
            char c = r.charAt(i);
            if(Character.isLetterOrDigit(c)){ //digits are also allowed
                sb.append(c);
            }
        }
        for(int i=0;i<sb.length()/2;i++) {
			char start = sb.charAt(i);
			char end = sb.charAt(sb.length()-1-i);
			if(start!=end) {
				return false;
			}
		}
		return true;
    }
}