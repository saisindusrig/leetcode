public class Solution {
    public bool IsHappy(int n) {
        var seen = new HashSet<int>();
        while (n != 1 && !seen.Contains(n)) {
            seen.Add(n);
            n = FindSquare(n);
        }
        return n == 1;
    }

    private int FindSquare(int number) {
        int sum = 0;
        while (number > 0) {
            int rem = number % 10;
            sum += rem * rem;
            number /= 10;
        }
        return sum;
    }
}
