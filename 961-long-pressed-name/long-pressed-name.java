class Solution {
    public boolean isLongPressedName(String name, String typed) {
        int i=0;
        int j=0;
        int n = name.length();
        int t = typed.length();
        while(i<n){
            int c1=0;
            int c2=0;
            char c = name.charAt(i);
            while(i<n && name.charAt(i)==c){
                i++; //increase in position of i in name
                c1++;
            }while (j<t && typed.charAt(j)==c){
                j++;
                c2++;
            }
            if(c1>c2){
                return false;
            }
        }
        return j<t? false: true;
    }
    
}