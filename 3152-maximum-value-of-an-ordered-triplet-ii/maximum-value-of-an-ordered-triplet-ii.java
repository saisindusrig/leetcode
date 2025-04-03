class Solution {
    public long maximumTripletValue(int[] nums) {
int e=0,diff=0;
long val=0;
for(int i=0;i<nums.length;i++){
    val = Math.max(val,(long)diff*nums[i]);
    diff = Math.max(diff,e-nums[i]);
    e = Math.max(e,nums[i]);
    
}
return val;

    }
}