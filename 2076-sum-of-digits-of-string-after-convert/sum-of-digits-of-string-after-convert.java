class Solution {
    public int getLucky(String s, int k) {
        StringBuilder num = new StringBuilder();
        for (char c : s.toCharArray()) {
            num.append(c - 'a' + 1); // postion to string
        }

        int sum = 0;
        for (int i = 0; i < num.length(); i++) {
            sum += num.charAt(i) - '0'; // org sum of digits
        }

        while (k > 1) { // sum of digits until it turns into a single digit
            int newSum = 0;
            while (sum > 0) {
                newSum += sum % 10;
                sum /= 10;
            }
            sum = newSum;
            k--;
        }

        return sum;
    }
}