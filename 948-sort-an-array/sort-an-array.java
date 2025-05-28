class Solution {
    public int[] sortArray(int[] nums) {
        //merge sort
        sort(nums,0,nums.length-1);
        return nums;
    }
    void sort(int[] nums, int l, int r){
        if(l<r){
            int m = l+(r-l)/2;
            sort(nums, l,m);
            sort(nums,m+1,r);

            //merge
            merge(nums,l,m,r);
        }
    }
    void merge(int[] nums, int l,int m,int r){
        //two diff sub arrays, then merge them
        int a1 = m-l+1;
        int a2 = r-m;
        //temp 
        int[] arr1 = new int[a1];
        int[] arr2 = new int[a2];
        //copy values
        for(int i=0;i<a1;++i){
            arr1[i] = nums[l+i];
        }
        for(int j=0;j<a2;++j){
            arr2[j] = nums[m+1+j];
        }
        //compare and sort
        int i=0,j=0,k=l; // k means the starting of the sub array
        while(i<a1 && j<a2){
            if(arr1[i]<arr2[j]){
                nums[k] = arr1[i];
                i++;
            }else{
                nums[k] = arr2[j];
                j++;
            }
            k++;
        }
        //if rem left
        while(i<a1){
            nums[k]= arr1[i];
            i++;
            k++;
        }
        while(j<a2){
            nums[k] = arr2[j];
            j++;
            k++;
        }
    }

}