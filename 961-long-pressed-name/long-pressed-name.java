class Solution {
    public boolean isLongPressedName(String name, String typed) {
        int i=0; //name
        int j=0; //typed
        int n= name.length();
        int m= typed.length();
        while(i<n){ //for each c in name
            int c1 =0; 
            int c2=0;
            char c = name.charAt(i); //take a char(c) in name
            while(i<n && name.charAt(i)==c){  
                i++;
                c1++; //check the times c is repeating in name
            }while(j<m && typed.charAt(j)==c){
                j++;
                c2++; //check the times c is repeating in typed
            }
            if(c1>c2){ //if typed doesn't have the count of original name chars
                return false; //then false
            }
        }
        return j<m? false : true; //if extra characters are left, then it is false as it is not longpressed.
    }
    
}
