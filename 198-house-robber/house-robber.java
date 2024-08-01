class Solution {
    public int rob(int[] nums) {
        int m=0;
        int p =0;
        for(int i=0;i<nums.length;i++){
            int temp=m;
            m=Math.max(m,p+nums[i]);
            p=temp;
        }
        return m;
    }
}