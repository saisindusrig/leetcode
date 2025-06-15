class Solution {
    public void sortColors(int[] nums) {
        //dnf
        //three pointer
        //...low...mid...high
        int l=0,m=0,h=nums.length-1;
        while(h>=m){
            if(nums[m]==0){
                swap(nums,m,l);
                m++;
                l++;
            }else if(nums[m]==2){
                swap(nums,m,h);
                h--;
            }else{
                m++;
            }
        }
    }
    void swap(int[] nums,int a,int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}