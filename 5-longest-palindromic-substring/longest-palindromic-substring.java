class Solution {
    public String longestPalindrome(String s) {
        //expand around center
        String res ="";
        
        for(int i=0;i<s.length();i++){
            String evenP = eac(s,i,i);
            String oddP = eac(s,i,i+1);
            if(evenP.length() > res.length()) res = evenP;
            if(oddP.length() > res.length()) res = oddP;
        }
        return res;
    }
    public static String eac(String s,int l,int r){
        while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)){
            l--;
            r++;
        }
        return s.substring(l+1,r);    }
}