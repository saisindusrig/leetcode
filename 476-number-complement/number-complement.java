public class Solution {
    public int findComplement(int num) {
        if (num == 0) {
            return 1;
        }
        int n = num;
        int bits = 0;
        while (n > 0) {
            n = n >> 1;
            bits++;
        }
        int comp = num ^ ((1 << bits) - 1);
        return comp;
    }
}