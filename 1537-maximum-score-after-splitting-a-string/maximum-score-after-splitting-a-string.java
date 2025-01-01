class Solution {
    public int maxScore(String s) {
        int max = Integer.MIN_VALUE;
        int leftZeros = 0;
        int rightOnes = 0;
        for (char c : s.toCharArray()) {
            if (c == '1') {
                rightOnes++;
            }
        }

        
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == '0') {
                leftZeros++;
            } else {
                rightOnes--; 
            }

            int currentScore = leftZeros + rightOnes;
            max = Math.max(max, currentScore);
        }

        return max;
    }

    
}