class Solution {
    public boolean isLongPressedName(String name, String typed) {
        int i=0; //name
        int j=0; //typed
        int n= name.length();
        int m= typed.length();
        while(i<n){
            int c1 =0;
            int c2=0;
            char c = name.charAt(i);
            while(i<n && name.charAt(i)==c){  //check
                i++;
                c1++;
            }while(j<m && typed.charAt(j)==c){
                j++;
                c2++;
            }
            if(c1>c2){
                return false;
            }

        }
        return j<m? false : true;
    }
    
}