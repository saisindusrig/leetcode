class Solution {
    public int[] findErrorNums(int[] nums) {
        int i=0;
        while(i<nums.length){
            int orgIndex=nums[i]-1;
            if(nums[i]!=nums[orgIndex]){
                swap(nums,i,orgIndex);
            }else{
                i++;
            }
        }
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=j+1){
                return new int[] {nums[j],j+1};
            }
        }
        return new int[] {-1,-1};
    }
    public static void swap(int[] nums,int f,int s){
        int t=nums[f];
        nums[f]=nums[s];
        nums[s]=t;
    }
}