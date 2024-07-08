class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
       int c=0;
       int in=0; //type
       if(ruleKey.equals("color")){
        in=1;
       }else if(ruleKey.equals("name")){
        in=2;
       }
       for(List<String> i:items){
        if(i.get(in).equals(ruleValue)){
            c++;
        }
       }
       return c;
    }
}