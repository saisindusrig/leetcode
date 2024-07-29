class Solution {
    public int numTeams(int[] rating) {
    int n = rating.length;
    int res = 0;
    for (int i = 0; i < n; i++) {
        int lessLeft = 0, moreLeft = 0, lessRight = 0, moreRight = 0;
        for (int j = 0; j < i; j++) {
            if (rating[j] < rating[i]) {
                lessLeft++;
            } else if (rating[j] > rating[i]) {
                moreLeft++;
            }
        }
        for (int j = i + 1; j < n; j++) {
            if (rating[j] < rating[i]) {
                lessRight++;
            } else if (rating[j] > rating[i]) {
                moreRight++;
            }
        }
        res += lessLeft * moreRight + moreLeft * lessRight;
    }
    return res;
}
}