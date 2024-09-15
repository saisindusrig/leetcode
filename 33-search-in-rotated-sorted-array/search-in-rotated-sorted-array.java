class Solution {
    public int search(int[] nums, int target) {
       int piviotElement = getPiviot(nums);
       if(piviotElement==-1){
        return binarySearch(nums,target,0,nums.length-1);
       }
       if (nums[piviotElement]==target){
        return piviotElement;
       }else if(nums[0]<=target){
        return binarySearch(nums,target,0,piviotElement-1);
       }
       return binarySearch(nums,target,piviotElement+1,nums.length-1);
        
    }
    public int binarySearch(int[] arr,int target,int start,int end){
        while(start<=end){
            int mid = start+(end-start)/2;
            if(target >arr[mid]){
                start = mid+1;
            }else if(target<arr[mid]){
                end = mid-1;
            }else{
                return mid;
            }
        }
        return -1;
    }
    public int getPiviot(int[] arr){
        int start=0;
        int end = arr.length -1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(mid<end && arr[mid+1]<arr[mid]){
                return mid;
            }if(mid>start && arr[mid-1]> arr[mid]){
                return mid-1;
            }if(arr[start]>arr[mid]){
                end = mid-1;
            }else{
                start = mid+1;
            }

        }
        return -1;
    }
}