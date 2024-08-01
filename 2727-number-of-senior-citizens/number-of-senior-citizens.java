class Solution {
    public int countSeniors(String[] details) {
        int c=0;
        int age=0;
        for(String i: details){
            age = Character.getNumericValue(i.charAt(11))*10+Character.getNumericValue(i.charAt(12));
            if(age>60){
                c++;
            }
        }
        return c;
    }
}