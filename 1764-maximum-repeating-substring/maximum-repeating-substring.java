class Solution {
    public int maxRepeating(String sequence, String word) {
        int k = 0;
        String repeatedWord = "";
        while (sequence.contains(repeatedWord + word)) {
            repeatedWord += word;
            k++;
        }
        return k;
    }
}