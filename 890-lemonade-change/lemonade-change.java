class Solution {
    public boolean lemonadeChange(int[] bills) {
        // 5,10,15 -- 0,5,10
        // no change at first
        int f = 0, t = 0;
        for (int bill : bills) {
            if (bill == 5) {
                f++;
            } else if (bill == 10) {
                if (f < 1)
                    return false;
                f--;
                t++;
            } else if (bill == 20) {
                if (t > 0 && f > 0) { // atleast one 5,10 is enough
                    f--;
                    t--;
                } else if (f >= 3) { // just 5
                    f -= 3;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}