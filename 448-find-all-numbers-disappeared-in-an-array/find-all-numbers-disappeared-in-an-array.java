class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int i=0;
        while(i<nums.length){
            int orgIndex = nums[i]-1;
            if(nums[i]!=nums[orgIndex]){
                swap(nums,i,orgIndex);
            }else{
                i++;
            }
        }
        List<Integer> ans = new ArrayList<>();
        for(int j=0;j<nums.length;j++){
            if(nums[j]!= j+1){
                ans.add(j+1);
            }
        }
        return ans;
    }
    public void swap(int[] nums,int first,int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;        
     }
}