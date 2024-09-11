class Solution {
    public int minBitFlips(int start, int goal) {
        int x = start^goal;
        int c =0;
        while(x>0){
            c += x&1; //1 or 0
            x >>=1; // move from lsb

        }
        return c;
    }
}