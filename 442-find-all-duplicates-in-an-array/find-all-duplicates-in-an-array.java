class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int i=0;
        while(i<nums.length){
            int orgIndex = nums[i]-1;
            if(nums[i]!= nums[orgIndex]){
                swap(nums,i,orgIndex);
            }else{
                i++;
            }
        }
        List<Integer> newList= new ArrayList<>();
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=j+1){
                newList.add(nums[j]);
            }
        }
        return newList;
    }
    public void swap(int[] nums,int f,int s){
        int t=nums[f];
        nums[f]=nums[s];
        nums[s]=t;
    }
}