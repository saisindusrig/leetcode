class Solution {
    public int search(int[] nums, int target) {
        int s=0,e=nums.length-1;
        // if(nums.length==1) return 0;
        while(s<=e){
            int m = s+(e-s)/2;
            if(nums[m]==target){
                return m;
            }
            if(target>nums[s]){
                s++;
            }else if(target<nums[e]){
                e--;
            }
        }
        return -1;
    }
}