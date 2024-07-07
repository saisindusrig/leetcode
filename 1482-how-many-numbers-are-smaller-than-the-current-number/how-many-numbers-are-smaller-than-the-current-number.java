class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] newArr = new int[101]; 
        for(int i=0;i<nums.length;i++){
            newArr[nums[i]]++;//n[0]==0,n[1]==1,n[2]==2,n[3]==1,n[4]==0...n[8]=1
        }for(int i=1;i<101;i++){
            newArr[i]+= newArr[i-1];
        }for(int i=0;i<nums.length;i++){
            int j= nums[i];
            if(j==0){
                nums[i]=0;
            }else{
                nums[i]= newArr[j-1];
            }
        }
        return nums;
        }
    }
