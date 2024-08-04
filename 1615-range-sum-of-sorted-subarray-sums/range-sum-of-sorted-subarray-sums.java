class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        int MOD = 1000000007;
        int[] subArr = new int[n*(n+1)/2];
        int h = 0; //index for subArr
        for(int i = 0;i < n;i++){ //start at 
            int c = 0;
            for(int j = i;j < n; j++){ //start to end
                c += nums[j];
                subArr[h] += c;
                h++;
            }
        }
        Arrays.sort(subArr);
        long sum = 0;
        for(int i = left-1;i < right; i++){
            sum = (sum+subArr[i]) % MOD;
        }
        return (int)sum;
    }
}