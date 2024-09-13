class Solution {
    public int findPeakElement(int[] nums) {
        return indexfinder(nums);
    }
    
    static int indexfinder(int[] arr){
        int start =0;
        int end=arr.length-1;
        while(start<end){
            int mid = start + (end-start)/2;
            if(arr[mid+1]>arr[mid]){
                start= mid+1;
            }else if(arr[mid]>arr[mid+1]){ //decreasing
                end= mid;
            } 
        }
        return start;
    }
}