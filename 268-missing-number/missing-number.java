class Solution {
    public int missingNumber(int[] nums) {
        int i = 0;
		while(i<nums.length) {
			int orgIndex= nums[i];
			if(nums[i]< nums.length && nums[i]!= nums[orgIndex]) {
				swapArr(nums,i,orgIndex);
				
			}else {
				i++;
			}
            
        }
        for (int j=0;j<nums.length;j++){
            if(nums[j]!=j){
                return j;
            }
        }
        return nums.length;
	}
    
		
    	static void swapArr(int[]arr,int first,int second) {
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second]= temp;
	
}
}


