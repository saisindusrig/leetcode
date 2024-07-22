class Solution {
    public String reversePrefix(String word, char ch) {
        int index= word.indexOf(ch);
        if (index==-1){
            return word;
        }
        String substring = word.substring(0,index+1);
        String reverseSt = new StringBuilder(substring).reverse().toString();
        String other = word.substring(index+1);
        return reverseSt+other;
    }
}