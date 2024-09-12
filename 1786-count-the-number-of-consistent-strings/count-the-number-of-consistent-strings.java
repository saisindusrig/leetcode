class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int c = 0;
        for (String i : words) {
            boolean consistent = true;
            for (char ch : i.toCharArray()) {
                if (allowed.indexOf(ch) == -1) {
                    consistent = false;
                    break;
                }
            }
            if (consistent) {
                c++;
            }
        }
        return c;
    }
}