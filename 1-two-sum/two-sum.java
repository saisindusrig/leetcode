class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] sumArr = new int[2];
        int m=0;
        for(int i = 0; i<nums.length;i++){ //
            for(int j=i+1;j<nums.length;j++){
                int sum = nums[i]+nums[j];
                if(sum==target){
                    return new int[] {i,j};
                }
            }
        }
        return sumArr;
    }
}