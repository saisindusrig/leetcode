class Solution {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        Arrays.fill(res,1);
        for(int i=1;i<res.length;i++){
            for(int j=0;j<i;j++){
                if(nums[i]>nums[j]){
                    res[i]= Math.max(res[i],res[j]+1);
                } // 9>10
            }
        }
        int max=0;
        for(int i:res){
            max=Math.max(max,i);
        }
        return max;
    }
}