class Solution {
    public int firstMissingPositive(int[] nums) {
       int i = 0;
		while(i<nums.length) {
			int orgIndex= nums[i]-1;
			if(nums[i]>0 && nums[i] <nums.length && nums[i]!= nums[orgIndex]) {
				swapArr(nums,i,orgIndex);
			}else {
				i++;
			}
            
        }
        for (int j=0;j<nums.length;j++){
            if(nums[j]!=j+1){
              return j+1;
        }
        }
        return nums.length+1;
    }
   
    
    public void swapArr(int[] nums,int f,int s){
        int t =nums[f];
        nums[f]=nums[s];
        nums[s] = t;
    }
}
