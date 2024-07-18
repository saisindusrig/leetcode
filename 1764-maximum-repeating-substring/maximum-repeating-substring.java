class Solution {
    public int maxRepeating(String sequence, String word) {
        int count =0;
        String words ="";
        while(sequence.contains(words+word)){
            words+=word;
            count++;
        }
        return count;
    }
}