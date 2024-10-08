class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] newArr = new int[101];
        for(int i=0;i<nums.length;i++){
            newArr[nums[i]]++;
        }for(int i=1;i<101;i++){
            newArr[i]+= newArr[i-1];
        }for(int i =0;i<nums.length;i++){
            int pos = nums[i];
            if(pos==0){
                nums[i]=0;
            }else{
                nums[i] = newArr[pos-1];
            }
        }
        return nums;
        }
    }
